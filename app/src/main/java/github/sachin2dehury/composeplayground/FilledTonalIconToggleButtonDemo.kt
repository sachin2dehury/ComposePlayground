package github.sachin2dehury.composeplayground

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.FilledTonalIconToggleButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun FilledTonalIconToggleButtonDemo() {
    var checked by remember { mutableStateOf(false) }
    FilledTonalIconToggleButton(checked = checked, onCheckedChange = { checked = it }) {
        Icon(Icons.Filled.Lock, contentDescription = "Localized description")
    }
}