
package com.sena.ejercicio_practico2.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sena.ejercicio_practico2.ui.section.HeaderSection
import com.sena.ejercicio_practico2.ui.section.ContentSection
import com.sena.ejercicio_practico2.ui.section.FooterSection

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF8F9FC))
            .verticalScroll(rememberScrollState())
    ) {
        HeaderSection()
        ContentSection()
        FooterSection()
    }
}
