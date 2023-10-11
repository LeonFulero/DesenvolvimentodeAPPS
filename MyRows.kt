package com.example.projeto.Composables


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import com.example.projeto.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projeto.Composables.*

@Composable
fun MyWeeklyGoals(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color(0xFF, 0xDE, 0x91)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .width(100.dp)
                .padding(5.dp)
            ) {
                Column {
                    Text(
                        text = "2",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.size(5.dp))

                    Text(
                        text = "Dias Consecutivos",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Black
                    )
                }
            }
            Box(modifier = Modifier
                .width(100.dp)
                .padding(5.dp)
            ) {
                Column {
                    Text(
                        text = "562",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.size(10.dp))

                    Text(
                        text = "Kcal",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Black
                    )
                }
            }
            Box(modifier = Modifier
                .width(100.dp)
                .padding(5.dp)
            ) {
                Column {
                    Text(
                        text = "Meta semanal",
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.size(8.dp))

                    Image(
                        painterResource(id = R.drawable.ic_bar),
                        contentDescription = null
                    )
                }
            }
        }
    }
}

@Composable
fun MyDailyActivities(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color(0xFF, 0xCF, 0x75)
    ) {
        Column (modifier = Modifier.padding(bottom = 6.dp)){
            MyProfile()

            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = modifier
                    .width(320.dp)
                    .padding(3.dp)) {
                Watercups()

                MyInfoGrid(list = listActivities)

            }
        }
    }
}

@Composable
fun MyReportScreen(
    modifier: Modifier = Modifier,
    list: List<Elements>
) {
    Surface {
        Column (
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.padding(top = 20.dp, bottom = 60.dp)
        ) {
            Text(
                text = stringResource(id = R.string.reports),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp)
            )


            Text(
                text = "Histórico",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.headlineSmall,
                modifier = modifier.padding(8.dp)
            )

            MyCalendar(list = listWeek)

            MyGridCard(list = listStats)
        }
    }
}

@Composable
fun MyRights(
    modifier: Modifier = Modifier
) {
    Surface {
        Image(
            painter = painterResource(id = R.drawable.bg_night_end),
            modifier = Modifier
                .fillMaxWidth()
                .height(121.5.dp),
            contentDescription = null
        )

        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Versão 1.0.1",
                style = MaterialTheme.typography.labelSmall,
                color = Color.White
            )
            Text(
                text = "© 2023 Todos os direitos reservados a ninguém, já que é só um exemplo :D",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(280.dp),
                style = MaterialTheme.typography.labelSmall,
                color = Color.White
            )
            Spacer(modifier = Modifier.size(20.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_logo_end),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}

@Preview
@Composable
fun MyRowPrev() {
    MyReportScreen(list = listWeek)
}