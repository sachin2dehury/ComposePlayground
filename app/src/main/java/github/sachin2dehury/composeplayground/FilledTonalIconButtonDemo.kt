package github.sachin2dehury.composeplayground

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun FilledTonalIconButtonDemo() {
    FilledTonalIconButton(onClick = { /* doSomething() */ }) {
        Icon(Icons.Outlined.Lock, contentDescription = "Localized description")
    }
}