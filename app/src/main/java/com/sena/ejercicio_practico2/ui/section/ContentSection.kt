package com.sena.ejercicio_practico2.ui.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.sena.ejercicio_practico2.ui.composable.CategoryItem
import com.sena.ejercicio_practico2.ui.composable.DestinationItem


@Composable
fun ContentSection() {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        // Imagen destacada
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(145.dp)
                .clip(RoundedCornerShape(14.dp))
        ) {
            Image(
                painter = painterResource(R.drawable.img_6),
                contentDescription = "Montañas y lago",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                Color.Black.copy(alpha = 0.65f)
                            )
                        )
                    )
            )

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Explora",
                    color = Color.White,
                    fontSize = 21.sp
                )
                Text(
                    text = "Lugares increíbles cerca de ti",
                    color = Color.White,
                    fontSize = 13.sp
                )
            }
        }

        // Categorías horizontales
        LazyRow (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            item {
                CategoryItem(
                    "▲", "Montaña", Color(0xFFE9DFFF)
                )

            }
            item {
                CategoryItem(
                    "🌲", "Bosque", Color(0xFFDDF5E3)
                )
            }
            item {
                CategoryItem(
                    "🌴", "Playa", Color(0xFFDDF1FF)
                )
            }
            item {
                CategoryItem(
                    "🏛", "Ciudad", Color(0xFFFFEBD3)
                )
            }
            item {
                CategoryItem(
                    "♥", "Favoritos", Color(0xFFFFE1F0)
                )
            }
        }

        // Título de destinos
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Destinos Turisticos",
                modifier = Modifier.weight(1f),
                fontSize = 17.sp
            )
            Text(
                text = "Ver todos",
                color = Color(0xFF5145CD),
                fontSize = 12.sp
            )
        }

        // Lista vertical de destinos
        DestinationItem(
            imagen = R.drawable.img_2,
            nombre = "Basilica virgen de guadalupe",
            categoria = "Oración",
            puntuacion = "4.8",
            descripcion = "Un lugar donde hay paz, cultura eh historia."
        )

        DestinationItem(
            imagen = R.drawable.img_3,
            nombre = "Ciudad de México",
            categoria = "Ciudad",
            puntuacion = "4.6",
            descripcion = "Un lugar lleno de cultura y experiencias memorables."
        )

        DestinationItem(
            imagen = R.drawable.img_4,
            nombre = "Estatua Histórica",
            categoria = "Cultura",
            puntuacion = "4.7",
            descripcion = "Historia y arquitectura en un solo lugar."
        )
    }
}