package github.sachin2dehury.composeplayground

import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ElevatedButtonDemo() {
    ElevatedButton(onClick = { /* Do something! */ }) { Text("Elevated Button") }
}
