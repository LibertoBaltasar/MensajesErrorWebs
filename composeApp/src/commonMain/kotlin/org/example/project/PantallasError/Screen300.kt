package org.example.project.PantallasError

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextDecoration
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.example.project.RandomlyAlignedScreen
import org.example.project.generateRandomButtonText

object Screen300 : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        RandomlyAlignedScreen(title = "300 - VARIAS RESPUESTAS POSIBLES") {
            TextButton(onClick = { navigator.push(Screen406) }) {
                Text(
                    text = generateRandomButtonText(),
                    style = MaterialTheme.typography.bodyLarge,
                    textDecoration = TextDecoration.Underline
                )
            }
            TextButton(onClick = { navigator.push(Screen400) }) {
                Text(
                    text = generateRandomButtonText(),
                    style = MaterialTheme.typography.bodyLarge,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}
