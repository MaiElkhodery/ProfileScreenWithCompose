package com.example.profilescreenwithcompose.profilescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilescreenwithcompose.R
import com.example.profilescreenwithcompose.ui.theme.CardColor
import com.example.profilescreenwithcompose.ui.theme.LightGray

@Composable
fun InformationCard(title: String, info: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = CardColor
        )
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)
        ) {
            Text(
                color = LightGray,
                text = title,
                fontSize = 9.sp, fontFamily = FontFamily(
                    Font(
                        R.font.aclonica
                    )
                ),
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Start
            )
            Text(
                color = Color.Black,
                text = info,
                fontFamily = FontFamily(
                    Font(
                        R.font.aclonica
                    )
                ),
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Start
            )
        }
    }
}