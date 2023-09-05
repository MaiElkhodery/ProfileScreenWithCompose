package com.example.profilescreenwithcompose.profilescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.profilescreenwithcompose.R
import com.example.profilescreenwithcompose.viewmodel.ProfileUIState
import com.example.profilescreenwithcompose.viewmodel.ProfileViewModel

@Composable
@Preview(showSystemUi = true)
fun Preview() {
    ShowProfileScreen()
}

@Composable
fun ShowProfileScreen(
    viewModel: ProfileViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    ShowProfileContent(
        state,
        viewModel::setFirstName,
        viewModel::setLastName,
        viewModel::setLocation,
        viewModel::setPhoneNumber,
        viewModel::setEmail,
    )

}

@Composable
private fun ShowProfileContent(
    state: ProfileUIState,
    onChangeFirstName : (String)->Unit,
    onChangeLastName : (String)->Unit,
    onChangeLocation : (String)->Unit,
    onChangePhoneNumber : (String)->Unit,
    onChangeEmail : (String)->Unit,
) {
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
                InformationCard(
                    title = stringResource(id = R.string.first_name),
                    info = state.firstName,
                    onChangeFirstName
                    )
            }
            HorizontalSpacer()
            Box(modifier = Modifier.weight(1f)) {
                InformationCard(
                    title = stringResource(id = R.string.last_name),
                    info = state.lastName,
                    onChangeLastName
                )
            }
        }
        InformationCard(title = stringResource(id = R.string.location), info = state.location,onChangeLocation)
        InformationCard(title = stringResource(id = R.string.email), info = state.email,onChangeEmail)
        InformationCard(title = stringResource(id = R.string.phone), info = state.phoneNumber,onChangePhoneNumber)

        Spacer(modifier = Modifier.weight(1f))

        SaveButton()
    }

}