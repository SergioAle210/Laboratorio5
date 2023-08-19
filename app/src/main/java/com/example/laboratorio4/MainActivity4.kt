package com.example.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardCuarta(R.drawable.bibliotecafondo2)
                }
            }
        }
    }
}

@Composable
fun CardCuarta(@DrawableRes id: Int) {
    val image = painterResource(id = id)
    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(modifier = Modifier.fillMaxWidth().padding(0.dp, 10.dp)) {
            Icon(
                painter = painterResource(R.drawable.x),
                contentDescription = "Exit",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .padding(10.dp)
                    .align(alignment = Alignment.CenterStart),
                tint = Color(31, 169, 89)
            )
            Text(
                text = "Emergency Contacts",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(7.dp)
                    .fillMaxWidth(),
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
        Column {
            Row(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 10.dp, 0.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.warning_foreground),
                    contentDescription = "Warning",
                    modifier = Modifier
                        .height(50.dp)
                        .border(width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(8.dp, 8.dp, 8.dp, 8.dp)
                        )
                        .clip(RoundedCornerShape(8.dp)),
                    tint = Color.Red
                )
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp, 0.dp),
                ){
                    Text(
                        text = "Emergencias",
                        textAlign = TextAlign.Left,
                        fontSize = 16.sp,
                        modifier = Modifier,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Si se presenta un incidente o un percance por favor marca el número de emergencia y rápidamente te apoyamos.",
                        fontSize = 14.sp,
                        modifier = Modifier
                    )
                }
            }
        }
        Surface(
            color = Color(34, 153, 84),
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(15.dp)
                .border(width = 1.dp,
                    color = Color.Gray,
                    shape = RoundedCornerShape(4.dp, 4.dp, 4.dp, 4.dp)
                )
                .clip(RoundedCornerShape(8.dp))
        ){
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    painter = painterResource(R.drawable.call_foreground),
                    contentDescription = "Call",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .padding(10.dp),
                    tint = Color.White
                )
                Text(
                    text = "Call 5978-1736",
                    textAlign = TextAlign.Left,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp, 8.dp),
                    fontStyle = FontStyle.Normal,
                    color = Color.White
                )
            }
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(232, 232, 232))
        )
        Column {
            Row(
                modifier = Modifier
                    .padding(15.dp, 20.dp, 10.dp, 0.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.emergency_foreground),
                    contentDescription = "Warning",
                    modifier = Modifier
                        .height(50.dp)
                        .border(width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(8.dp, 8.dp, 8.dp, 8.dp)
                        )
                        .clip(RoundedCornerShape(8.dp)),
                    tint = Color.Blue
                )
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp, 0.dp),
                ){
                    Text(
                        text = "Clínica UVG",
                        textAlign = TextAlign.Left,
                        fontSize = 16.sp,
                        modifier = Modifier,
                        fontStyle = FontStyle.Normal
                    )
                    Text(
                        text = "La Clínica UVG, presta los siguientes servicios: \n\n° Atención a Emergencias \n° Atención Primaria a Enfermedades Comunes\n° Plan Educacional sobre Enfermedades\n\nHorario de atención: 7:00 a.m. a 8:30 p.m. Campus Central Edificio F 119-120",
                        fontSize = 14.sp,
                        modifier = Modifier,
                        lineHeight = 16.sp
                    )
                }
            }
        }
        Surface(
            color = Color(34, 153, 84),
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(15.dp)
                .border(width = 1.dp,
                    color = Color.Gray,
                    shape = RoundedCornerShape(4.dp, 4.dp, 4.dp, 4.dp)
                )
                .clip(RoundedCornerShape(8.dp))
        ){
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    painter = painterResource(R.drawable.call_foreground),
                    contentDescription = "Call",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .padding(10.dp),
                    tint = Color.White
                )
                Text(
                    text = "Call 2507-1500 ex 21312",
                    textAlign = TextAlign.Left,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp, 8.dp),
                    color = Color.White
                )
            }
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
    name = "Mi UI4"
)

@Composable
fun GreetingPreview4() {
    Laboratorio4Theme {
        CardCuarta(R.drawable.bibliotecafondo2)
    }
}
