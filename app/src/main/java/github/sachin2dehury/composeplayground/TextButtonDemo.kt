package github.sachin2dehury.composeplayground

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun TextButtonDemo() {
    TextButton(onClick = { /* Do something! */ }) { Text("Text Button") }
}
