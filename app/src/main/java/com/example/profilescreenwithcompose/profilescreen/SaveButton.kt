package com.example.profilescreenwithcompose.profilescreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilescreenwithcompose.R
import com.example.profilescreenwithcompose.ui.theme.ButtonColor
import java.sql.Savepoint

@Composable
fun SaveButton() {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(54.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = ButtonColor
        ),
        onClick = { /*TODO*/ }
    ) {
        Text(
            text = stringResource(id = R.string.save),
            fontFamily = FontFamily(
                Font(
                    R.font.aclonica
                )
            ),
            color = Color.White,
            fontSize = 14.sp
        )
    }
}