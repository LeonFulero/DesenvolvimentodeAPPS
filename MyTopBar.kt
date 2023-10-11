package com.example.projeto.Composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SmallTopAppBar
import com.example.projeto.R
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int = R.drawable.ic_logo_foreground
) {
    SmallTopAppBar(
        navigationIcon = {
            Icon(
                painterResource(id = image),
                contentDescription = null
            )

        },
        title = {
        Text(
            text = "Speed of Light",
            modifier = modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )
        },
        actions = {
            IconButton(
                onClick = { /*TODO*/ },
                content = {
                    Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = null
                    )
                }
            )
        }
    )
}

////////////////////////////////////////////////////////////////////////////////////////////////////

@Preview
@Composable
fun MyTopPrev() {
    MyTopBar()
}