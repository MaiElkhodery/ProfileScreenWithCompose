package com.example.profilescreenwithcompose.profilescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilescreenwithcompose.R
import com.example.profilescreenwithcompose.ui.theme.LightGray

@Composable
fun Header(title: String, subTitle: String) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(start = 20.dp, top = 25.dp),
            color = Color.Black,
            fontSize = 18.sp,
            fontFamily = FontFamily(
                Font(
                    R.font.aclonica
                )
            ),
            fontWeight = FontWeight.Bold
        )

        Text(
            modifier = Modifier
                .padding(start = 20.dp),
            color = LightGray,
            text = subTitle,
            fontSize = 12.sp,
            fontFamily = FontFamily(
                Font(
                    R.font.aclonica
                )
            ),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start
        )
    }

}