package com.sena.ejercicio_practico2.ui.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.ejercicio_practico2.R


@Composable
fun HeaderSection() {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.horizontalGradient(
                    listOf(
                        Color(0xFF5145CD),
                        Color(0xFF7169E8)
                    )
                )
            )
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column (modifier = Modifier.weight(1f)) {
            Text(
                text = "Descubre México",
                color = Color.White,
                fontSize = 22.sp
            )
            Text(
                text = "Nuevos destinos, nuevas experiencias ",
                color = Color.White,
                fontSize = 12.sp
            )
        }

        Image(
            painter = painterResource(R.drawable.img_5),
            contentDescription = "Perfil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(46.dp)
                .clip(CircleShape)
        )
    }
}