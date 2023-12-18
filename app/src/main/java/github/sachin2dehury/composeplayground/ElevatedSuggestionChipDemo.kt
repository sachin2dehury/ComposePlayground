package github.sachin2dehury.composeplayground

import androidx.compose.material3.ElevatedSuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ElevatedSuggestionChipDemo() {
    ElevatedSuggestionChip(
        onClick = { /* Do something! */ },
        label = { Text("Suggestion Chip") },
    )
}
