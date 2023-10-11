package com.example.projeto.Composables

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.projeto.R

@Composable
fun MyProfile(
    modifier: Modifier = Modifier,
    @StringRes text: Int = R.string.name
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(3.dp)
    ) {
        Icon(
            imageVector = Icons.Rounded.AccountCircle,
            contentDescription = null
        )

        Text(
            text = stringResource(id = text),
            color = Color.Black
        )

    }
}

@Composable
fun Watercups(
    modifier: Modifier = Modifier
) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.ic_cups_foreground),
            contentDescription = null,
            modifier = Modifier.size(70.dp)
        )

        Column(modifier = modifier.width(60.dp),
            verticalArrangement = Arrangement.Center) {

            Text(
                text = "Água tomada:",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black
            )

            Spacer(modifier = Modifier.size(6.dp))

            Text(
                text = "1L / 2L",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black
            )

        }

    }
}

@Composable
fun MyDay (
    modifier: Modifier = Modifier,
    day: String,
    date: String
) {
    Box (modifier = Modifier.padding(6.dp)){
        Column (modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = day)

            Surface(
                color = Color(0x6B, 0x99, 0xE3),
                modifier = Modifier
                    .clip(CircleShape)
                    .size(26.dp)
            ) {
                Text(
                    text = date,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun MyCalendar(
    modifier: Modifier = Modifier,
    list: List<Elements>
) {
    LazyRow (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        items(list) {
                x -> MyDay(
            day = x.toptext,
            date = x.btmtext
        )
        }
    }
}



/////////////////////////////////////////////////////////

data class Elements(
    var toptext: String = "",
    var btmtext: String = ""
)

val listActivities = listOf(
    Elements("Pedalar \nna orla"),
    Elements("Corrida no Marinha"),
    Elements("Basquete"),
    Elements("Meditação"),
    Elements("Cardio")
)

val listWeek = listOf(
    Elements("D", "24"),
    Elements("S", "25"),
    Elements("T", "26"),
    Elements("Q", "27"),
    Elements("Q", "28"),
    Elements("S", "29"),
    Elements("S", "30")
)

val listStats = listOf(
    Elements("Peso Atual", "86.30"),
    Elements("Peso perdido nos últimos 30 dias", "3,7 Kg"),
    Elements("Maior desempenho", "Corrida"),
    Elements("Emepenho com os exercícios", "Alto")
)