package com.example.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardSecundaria(R.drawable.bibliotecafondo2)
                }
            }
        }
    }
}

@Composable
fun CardSecundaria(@DrawableRes id: Int){
    val image = painterResource(id = id)

    Column (
            modifier = Modifier.fillMaxSize()
        ){
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "My Profile",
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(7.dp)
                        .fillMaxWidth(),
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold
                )
                Icon(
                    painter = painterResource(R.drawable.geargreen),
                    contentDescription = "Configuracion",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .padding(10.dp)
                        .align(alignment = Alignment.CenterEnd),
                    tint = Color(31, 169, 89)
                    )
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
            ){
                Image(
                    painter = image,
                    modifier = Modifier
                        .height(165.dp)
                        .fillMaxWidth()
                        .alpha(0.2f),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Intro"
                )
                Image(
                    painter = painterResource(R.drawable.avatar),
                    modifier = Modifier
                        .height(130.dp)
                        .fillMaxWidth()
                        .align(alignment = Alignment.CenterStart)
                        .absoluteOffset(0.dp, 20.dp),
                    contentDescription = "Perfil",
                    alignment = Alignment.Center
                )
                Text(
                    text = "SERGIO ALEJANDRO ORELLANA COLINDRES",
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(7.dp)
                        .fillMaxWidth()
                        .align(alignment = Alignment.CenterStart)
                        .absoluteOffset(0.dp, 105.dp),
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(232, 232, 232))
            )
            Row(
                modifier = Modifier
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.birrete),
                    contentDescription = "Campus",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(4.dp),
                    tint = Color(31, 169, 89)
                    )
                Column {
                    Text(
                        text = "My Campus",
                        textAlign = TextAlign.Center,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(2.dp),
                        fontStyle = FontStyle.Normal
                    )
                    Text(
                        text = "Campus Central",
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(2.dp)
                    )
                }

            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(232, 232, 232))
            )
            Row(
                modifier = Modifier
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.dospersonas),
                    contentDescription = "Friends",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(4.dp),
                    tint = Color.Blue
                )
                Text(
                    text = "My Friends",
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(2.dp),
                    fontStyle = FontStyle.Normal
                )

            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(232, 232, 232))
            )
            Row(
                modifier = Modifier
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = "Calendar",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(4.dp),
                    tint = Color(40, 225, 118)
                )
                Text(
                    text = "My Calendar",
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(2.dp),
                    fontStyle = FontStyle.Normal
                )

            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(232, 232, 232))
            )
            Row(
                modifier = Modifier
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.enciclopedia),
                    contentDescription = "Courses",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(4.dp),
                    tint = Color(235, 122, 22)
                )
                Text(
                    text = "My Courses",
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(2.dp),
                    fontStyle = FontStyle.Normal
                )

            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(232, 232, 232))
            )
            Row(
                modifier = Modifier
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.quealification),
                    contentDescription = "Grades",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(4.dp),
                    tint = Color(157, 1, 252)
                )
                Text(
                    text = "My Grades",
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(2.dp),
                    fontStyle = FontStyle.Normal
                )

            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(232, 232, 232))
            )
            Row(
                modifier = Modifier
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.grupos_foreground),
                    contentDescription = "Groups",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(4.dp),
                    tint = Color(157, 1, 252)
                )
                Text(
                    text = "My Groups",
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(2.dp),
                    fontStyle = FontStyle.Normal
                )

            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(232, 232, 232))
            )
            Row(
                modifier = Modifier
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.calendarioeventos_foreground),
                    contentDescription = "Events",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(4.dp),
                    tint = Color(13, 213, 203)
                )
                Text(
                    text = "My Upcoming Events",
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(2.dp),
                    fontStyle = FontStyle.Normal
                )

            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(232, 232, 232))
            )
            Row(
                modifier = Modifier
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.cohete_foreground),
                    contentDescription = "Activities",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(4.dp),
                    tint = Color(247, 29, 7)
                )
                Text(
                    text = "My Activities",
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(2.dp),
                    fontStyle = FontStyle.Normal
                )

            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(232, 232, 232))
            )

        }
    }

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Mi UI2"
)

@Composable
fun GreetingPreview2() {
    Laboratorio4Theme {
        CardSecundaria(R.drawable.bibliotecafondo2)
    }
}