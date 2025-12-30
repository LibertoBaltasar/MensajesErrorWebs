package org.example.project.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font
import mensajeserrorwebs.composeapp.generated.resources.Res
import mensajeserrorwebs.composeapp.generated.resources.RobotoMono_Bold
import mensajeserrorwebs.composeapp.generated.resources.RobotoMono_Regular
import mensajeserrorwebs.composeapp.generated.resources.Roboto_Mono

@OptIn(ExperimentalResourceApi::class)
@Composable
fun getTypography(): Typography {
    val robotoMono = FontFamily(
        Font(
            resource = Res.font.RobotoMono_Regular,
            weight = FontWeight.Normal
        ),
        Font(
            resource = Res.font.RobotoMono_Bold,
            weight = FontWeight.Bold
        )
    )

    return Typography(
        headlineMedium = Typography().headlineMedium.copy(fontFamily = robotoMono, fontWeight = FontWeight.Bold, fontSize = Typography().headlineMedium.fontSize * 2f),
        bodyLarge = Typography().bodyLarge.copy(fontFamily = robotoMono, fontWeight = FontWeight.Normal)
    )
}