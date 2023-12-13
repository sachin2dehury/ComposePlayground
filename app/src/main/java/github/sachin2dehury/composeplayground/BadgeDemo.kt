package github.sachin2dehury.composeplayground

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun BadgeDemo() {
    BadgedBox(
        modifier = Modifier.wrapContentSize(),
        badge = {
            Badge {
                val badgeNumber = "8"
                Text(
                    badgeNumber,
                    modifier = Modifier.semantics {
                        contentDescription = "$badgeNumber new notifications"
                    },
                )
            }
        },
    ) {
        Icon(
            Icons.Filled.Star,
            contentDescription = "Favorite",
        )
    }
}
