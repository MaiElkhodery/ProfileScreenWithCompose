package com.example.profilescreenwithcompose.profilescreen

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.profilescreenwithcompose.R

@Composable
fun TextButton(
    text: String,
    onClick: () -> Unit
) {
    Text(
        modifier = Modifier.clickable { onClick() },
        color = Color.Red,
        text = text,
        fontWeight = FontWeight.Medium,
        fontFamily = FontFamily(
            Font(
                R.font.aclonica
            )
        ),
        fontSize = 14.sp,
        textAlign = TextAlign.Center
    )
}