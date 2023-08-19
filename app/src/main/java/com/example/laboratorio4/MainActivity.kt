package com.example.laboratorio4


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardPrincipal(R.drawable.portada)
                }
            }
        }
    }
}

@Composable
fun CardPrincipal(@DrawableRes id: Int){
    val image = painterResource(id = id)
    Column (
    )
    {
        Text(
            text = "Campus Central",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = image,
            contentDescription = "Campus",
            modifier = Modifier.height(200.dp),
            contentScale = ContentScale.Crop,
            alpha = 0.7F
        )
        Text(
            text = "DESTACADOS",
            textAlign = TextAlign.Left,
            color = Color.Gray,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold
        )
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Column (
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .border(width = 2.dp,
                        color = Color(253, 254, 254,0),
                        shape = RoundedCornerShape(0.dp, 0.dp, 8.dp, 8.dp))
                    .clip(RoundedCornerShape(8.dp)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logosn),
                    contentDescription = "Service Now",
                    modifier = Modifier.height(140.dp),
                    contentScale = ContentScale.Crop
                    )
                Surface(
                    color = Color(34, 153, 84),

                ){
                    Text(
                        text = "Service Now",
                        textAlign = TextAlign.Left,
                        color = Color.White,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        fontStyle = FontStyle.Normal
                    )
                }
            }
            Column (
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .border(width = 2.dp,
                        color = Color(253, 254, 254,0),
                        shape = RoundedCornerShape(0.dp, 0.dp, 8.dp, 8.dp))
                    .clip(RoundedCornerShape(8.dp)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.uvg),
                    contentDescription = "Actualidad",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.height(140.dp),
                    alignment = Alignment.Center,
                    )
                Surface(
                    color = Color(66, 73, 73)
                ){
                    Text(
                        text = "Actualidad UVG",
                        textAlign = TextAlign.Left,
                        color = Color.White,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        fontStyle = FontStyle.Normal
                    )
                }
            }
        }
        Text(
            text = "SERVICIOS Y RECURSOS",
            textAlign = TextAlign.Left,
            color = Color.Gray,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold
        )
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Column (
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .border(width = 2.dp,
                        color = Color(253, 254, 254,0),
                        shape = RoundedCornerShape(0.dp, 0.dp, 8.dp, 8.dp))
                    .clip(RoundedCornerShape(8.dp)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.biblioteca),
                    contentDescription = "Directorio",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .height(140.dp),
                    alignment = Alignment.Center,

                )
                Surface(
                    color = Color(34, 153, 84),
                ){
                    Text(
                        text = "Directorio de Servicios Estudiantiles",
                        textAlign = TextAlign.Left,
                        color = Color.White,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        fontStyle = FontStyle.Normal
                    )
                }
            }
            Column (
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .border(width = 2.dp,
                        color = Color(253, 254, 254,0),
                        shape = RoundedCornerShape(0.dp, 0.dp, 8.dp, 8.dp))
                    .clip(RoundedCornerShape(8.dp)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.servicios_estudiantiles),
                    contentDescription = "Portal",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.height(140.dp).fillMaxWidth()
                )
                Surface(
                    color = Color(66, 73, 73)
                ){
                    Text(
                        text = "Portal Web Bibliotecas UVG",
                        textAlign = TextAlign.Left,
                        color = Color.White,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        fontStyle = FontStyle.Normal
                    )
                }
            }
        }
    }

}


@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Mi UI"
)

@Composable
fun GreetingPreview() {
    Laboratorio4Theme {
        CardPrincipal(R.drawable.portada)
    }
}