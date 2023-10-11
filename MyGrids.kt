package com.example.projeto.Composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.Projeto.Composables.MyCard
import com.example.Projeto.Composables.MyInfoCard

@Composable
fun MyInfoGrid(
    modifier: Modifier = Modifier,
    list: List<Elements>
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        modifier = modifier.height(110.dp)
            .fillMaxWidth()
    ) {
        items(list) {
                y -> MyInfoCard(
            text = y.toptext
        )
        }
    }
}


@Composable
fun MyGridCard(
    modifier: Modifier = Modifier,
    list: List<Elements>
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        modifier = modifier
            .height(190.dp)
            .fillMaxSize()
            .padding(top = 20.dp),
        horizontalArrangement = Arrangement.Center

    ) {

        items(list) {
                y -> MyCard(
            text = y.toptext,
            info = y.btmtext
                )
        }
    }
}

