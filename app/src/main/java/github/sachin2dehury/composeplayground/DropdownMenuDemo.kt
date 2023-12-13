package github.sachin2dehury.composeplayground

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun DropdownMenuDemo() {
    var expanded by remember { mutableStateOf(true) }
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false },
    ) {
        DropdownMenuItem(
            text = { Text("Edit") },
            onClick = { /* Handle edit! */ },
            leadingIcon = {
                Icon(
                    Icons.Outlined.Edit,
                    contentDescription = null,
                )
            },
        )
        DropdownMenuItem(
            text = { Text("Settings") },
            onClick = { /* Handle settings! */ },
            leadingIcon = {
                Icon(
                    Icons.Outlined.Settings,
                    contentDescription = null,
                )
            },
        )
        DropdownMenuItem(
            text = { Text("Send Feedback") },
            onClick = { /* Handle send feedback! */ },
            leadingIcon = {
                Icon(
                    Icons.Outlined.Email,
                    contentDescription = null,
                )
            },
            trailingIcon = { Text("F11", textAlign = TextAlign.Center) },
        )
    }
}
