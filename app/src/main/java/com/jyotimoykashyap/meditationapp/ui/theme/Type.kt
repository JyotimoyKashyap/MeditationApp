package com.jyotimoykashyap.meditationapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jyotimoykashyap.meditationapp.R

val poppinsFonts = FontFamily(
    listOf(
        Font(R.font.poppins_bold, FontWeight.Bold),
        Font(R.font.poppins_extra_bold, FontWeight.ExtraBold),
        Font(R.font.poppins_light, FontWeight.Light),
        Font(R.font.poppins_regular, FontWeight.Normal),
        Font(R.font.poppins_medium, FontWeight.Medium),
        Font(R.font.poppins_semibold, FontWeight.SemiBold),
        Font(R.font.poppins_thin_itallic, FontWeight.Thin)
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = AquaBlue
    ),
    h1 = TextStyle(
        color = TextWhite,
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    h2 = TextStyle(
        color = TextWhite,
        fontFamily = poppinsFonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    )

    // defining my own typography
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)