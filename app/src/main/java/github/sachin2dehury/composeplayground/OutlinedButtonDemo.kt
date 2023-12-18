package github.sachin2dehury.composeplayground

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun OutlinedButtonDemo() {
    OutlinedButton(onClick = { /* Do something! */ }) { Text("Outlined Button") }
}
