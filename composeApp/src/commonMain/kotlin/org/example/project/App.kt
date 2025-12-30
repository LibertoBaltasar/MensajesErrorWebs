package org.example.project

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.example.project.PantallasError.Screen417
import org.example.project.ui.theme.getTypography
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme(typography = getTypography()) {
        Navigator(Screen417) { navigator ->
            SlideTransition(navigator)
        }
    }
}