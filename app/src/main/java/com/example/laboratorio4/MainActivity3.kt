package com.example.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardTerciaria(R.drawable.bibliotecafondo2)
                }
            }
        }
    }
}
@Composable
fun CardTerciaria(@DrawableRes id: Int){
    val image = painterResource(id = id)
    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Icon(
                painter = painterResource(R.drawable.x),
                contentDescription = "Configuracion",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .padding(10.dp)
                    .align(alignment = Alignment.CenterStart),
                tint = Color(31, 169, 89)
            )
            Text(
                text = "Settings",
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
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
        Row(
            modifier = Modifier
                .padding(2.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.uniqueperson_foreground),
                contentDescription = "Profile",
                modifier = Modifier
                    .height(50.dp)
                    .padding(5.dp)
            )
            Text(
                text = "Edit Profile",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(5.dp),
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
                painter = painterResource(R.drawable.email_foreground),
                contentDescription = "Email",
                modifier = Modifier
                    .height(50.dp)
                    .padding(5.dp),
                tint = Color(13, 213, 203)
            )
            Text(
                text = "Email Addresses",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(5.dp),
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
                painter = painterResource(R.drawable.notifications_foreground),
                contentDescription = "Notification",
                modifier = Modifier
                    .height(50.dp)
                    .padding(5.dp),
                tint = Color(245, 114, 12)
            )
            Text(
                text = "Notifications",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(5.dp),
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
                painter = painterResource(R.drawable.privacity_foreground),
                contentDescription = "Privacy",
                modifier = Modifier
                    .height(50.dp)
                    .padding(5.dp),
                tint = Color.Gray
            )
            Text(
                text = "Privacy",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(5.dp),
                fontStyle = FontStyle.Normal
            )
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(15.dp)
                .background(Color(232, 232, 232))
        )
        Row(
            modifier = Modifier
                .padding(2.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.help_foreground),
                contentDescription = "Help",
                modifier = Modifier
                    .height(50.dp)
                    .padding(5.dp),
                tint = Color.Red
            )
            Column {
                Text(
                    text = "Help & Feedback",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(2.dp),
                    fontStyle = FontStyle.Normal
                )
                Text(
                    text = "Troublesooting tips and guides",
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
                painter = painterResource(R.drawable.info_foreground),
                contentDescription = "About",
                modifier = Modifier
                    .height(50.dp)
                    .padding(5.dp),
                tint = Color.Blue
            )
            Column {
                Text(
                    text = "About",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(2.dp),
                    fontStyle = FontStyle.Normal
                )
                Text(
                    text = "App information and documents",
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
                .height(15.dp)
                .background(Color(232, 232, 232))
        )
        Text(
            text = "Logout",
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(15.dp)
                .fillMaxWidth(),
            color = Color.Red
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .height(12.dp)
                .background(Color(232, 232, 232))
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Mi UI3"
)

@Composable
fun GreetingPreview3() {
    Laboratorio4Theme {
        CardTerciaria(R.drawable.bibliotecafondo2)
    }
}