package com.example.profilescreenwithcompose.profilescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profilescreenwithcompose.R

@Composable
@Preview(showSystemUi = true)
fun Preview() {
    ShowProfileScreen()
}

@Composable
fun ShowProfileScreen() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Header(stringResource(id = R.string.account), stringResource(id = R.string.edit_text))

        VerticalSpacer()
        ProfileAvatar(painter = painterResource(id = R.drawable.img2))
        VerticalSpacer()
        TextButton(text = stringResource(id = R.string.change_profile)) {

        }
        VerticalSpacer()
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(modifier = Modifier.weight(1f)) {
                InformationCard(title = stringResource(id = R.string.first_name), info = "mai")
            }
            HorizontalSpacer()
            Box(modifier = Modifier.weight(1f)) {
                InformationCard(
                    title = stringResource(id = R.string.last_name),
                    info = "el-khodery"
                )
            }
        }
        InformationCard(title = stringResource(id = R.string.location), info = "matarya")
        InformationCard(title = stringResource(id = R.string.email), info = "mai@gmail.com")
        InformationCard(title = stringResource(id = R.string.phone), info = "+20886582737")

        Spacer(modifier = Modifier.weight(1f))

        SaveButton()
    }

}