package com.example.firstapplication.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val BloomColorScheme = lightColorScheme(
    primary = Rose,
    onPrimary = White,
    primaryContainer = Petal,
    onPrimaryContainer = Plum,
    secondary = Mauve,
    onSecondary = White,
    background = Blush,
    onBackground = Plum,
    surface = White,
    onSurface = Plum,
    surfaceVariant = Petal,
    onSurfaceVariant = Mauve,
    outline = Mauve
)

@Composable
fun FirstApplicationTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = BloomColorScheme,
        typography = Typography,
        content = content
    )
}
