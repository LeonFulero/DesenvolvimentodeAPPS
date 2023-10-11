package com.example.Projeto.Composables

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyCard(
    modifier: Modifier = Modifier,
    info: String,
    text: String
) {
    Surface(
        color = Color(0xCC, 0xE9, 0xFF),
        shape = MaterialTheme.shapes.small,
        modifier = modifier.padding(14.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier.width(132.dp)
        ) {
            Text(
                text = text,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium,
                modifier = modifier.fillMaxWidth(),
                color = Color(0x34, 0x1A, 0x5E)
            )

            Text(
                text = info,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium,
                modifier = modifier.fillMaxWidth(),
                color = Color(0x6B, 0x99, 0xE3)
            )
        }
    }
}



@Composable
fun MyInfoCard(
    modifier: Modifier = Modifier,
    text: String
) {
    Surface(
        color = Color(0xFF, 0xDE, 0x91),
        shape = MaterialTheme.shapes.small,
        modifier = modifier.padding(5.dp)
    ) {
        Box(
            contentAlignment = Alignment.CenterEnd,
            modifier = Modifier.width(80.dp)
        ) {
            Text(
                text = text,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium,
                modifier = modifier.fillMaxWidth(),
                color = Color(0x34, 0x1A, 0x5E)
            )
        }
    }
}


