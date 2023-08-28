package com.example.profilescreenwithcompose.profilescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilescreenwithcompose.R

@Composable
@Preview(showSystemUi = true)
fun Preview(){
    ShowProfileScreen()
}

@Composable
fun ShowProfileScreen(){
    Column (
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ){

        Header(stringResource(id = R.string.account),stringResource(id = R.string.edit_text))

        VerticalSpacer()
        ProfileAvatar(painter = painterResource(id = R.drawable.img2))
        VerticalSpacer()
        TextButton(text = stringResource(id = R.string.change_profile)){

        }
        VerticalSpacer()
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(modifier = Modifier.weight(1f)){
                InformationCard(title = stringResource(id = R.string.enter_name), info = "kjhg")
            }
            HorizontalSpacer()
            Box(modifier = Modifier.weight(1f)){
                InformationCard(title = stringResource(id = R.string.enter_name2), info = "kjhg")
            }
        }
        InformationCard(title = stringResource(id = R.string.enter_name), info = "bvnc")
        InformationCard(title = stringResource(id = R.string.enter_phone), info = "fhka")

        Spacer(modifier = Modifier.weight(1f))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green
            ),
            onClick = { /*TODO*/ }
        ) {
            Text(
                text = stringResource(id = R.string.save),
                color = Color.White,
                fontSize = 14.sp
            )
        }
    }

}