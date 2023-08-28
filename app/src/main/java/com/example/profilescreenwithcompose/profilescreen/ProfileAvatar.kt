package com.example.profilescreenwithcompose.profilescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun ProfileAvatar(painter : Painter){
    Image(
        modifier = Modifier
            .size(150.dp)
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Crop,
        painter = painter,
        contentDescription = "Can not load"
    )
}