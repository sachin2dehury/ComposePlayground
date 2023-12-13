package github.sachin2dehury.composeplayground

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.DockedSearchBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun DockedSearchBarDemo() {
    var text by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    DockedSearchBar(
        modifier = Modifier
            .padding(top = 8.dp)
            .semantics { traversalIndex = -1f },
        query = text,
        onQueryChange = { text = it },
        onSearch = { active = false },
        active = active,
        onActiveChange = { active = it },
        placeholder = { Text("Hinted search text") },
        leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
        trailingIcon = { Icon(Icons.Default.MoreVert, contentDescription = null) },
    ) {
        repeat(4) { idx ->
            val resultText = "Suggestion $idx"
            ListItem(
                headlineContent = { Text(resultText) },
                supportingContent = { Text("Additional info") },
                leadingContent = { Icon(Icons.Filled.Star, contentDescription = null) },
                modifier = Modifier
                    .clickable {
                        text = resultText
                        active = false
                    }
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
            )
        }
    }
}
