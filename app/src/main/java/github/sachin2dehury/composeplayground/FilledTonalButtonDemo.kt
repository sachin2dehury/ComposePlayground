package github.sachin2dehury.composeplayground

import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun FilledTonalButtonDemo() {
    FilledTonalButton(onClick = { /* Do something! */ }) { Text("Filled Tonal Button") }
}