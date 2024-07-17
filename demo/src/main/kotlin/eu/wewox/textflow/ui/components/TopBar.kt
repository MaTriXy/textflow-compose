package eu.wewox.textflow.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import eu.wewox.textflow.ui.theme.SpacingMedium

/**
 * The reusable component for top bar.
 *
 * @param title The text to show in top bar.
 */
@Composable
fun TopBar(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.h4,
        modifier = Modifier
            .padding(SpacingMedium)
            .statusBarsPadding(),
    )
}
