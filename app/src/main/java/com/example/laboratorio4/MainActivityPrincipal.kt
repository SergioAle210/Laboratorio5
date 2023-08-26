package com.example.laboratorio4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivityPrincipal : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardMenuPrincipal()
                }
            }
        }
    }
}

@Composable
fun CardMenuPrincipal(){
    val context = LocalContext.current
    Column (
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier.fillMaxWidth())
        {
            Text(
                text = "Menú Principal",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(7.dp)
                    .fillMaxWidth(),
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold
            )
            Icon(
                painter = painterResource(R.drawable.house_foreground),
                contentDescription = "Principal",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .padding(1.dp)
                    .align(alignment = Alignment.CenterStart),
                tint = Color.DarkGray
            )
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .background(Color(232, 232, 232))
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {
                    val intent = Intent(context, MainActivity::class.java)
                    context.startActivity(intent)
                },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.campuscentral_foreground),
                    contentDescription = "Campus",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(5.dp)
                )
                Text(
                    text = "Campus Central",
                    color = Color.White,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(10.dp),
                    fontStyle = FontStyle.Italic
                )
            }
            Button(
                onClick = {
                    val intent = Intent(context, MainActivity2::class.java)
                    context.startActivity(intent)
                },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.uniqueperson_foreground),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(5.dp),
                    tint = Color.Black
                )
                Text(
                    text = "My Profile",
                    color = Color.Black,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(10.dp),
                    fontStyle = FontStyle.Italic
                )

            }
            Button(
                onClick = {
                    val intent = Intent(context, MainActivity3::class.java)
                    context.startActivity(intent)
                },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.geargreen),
                    contentDescription = "Settings",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(5.dp),
                    tint = Color.White
                )
                Text(
                    text = "Settings",
                    color = Color.White,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(10.dp),
                    fontStyle = FontStyle.Italic
                )
            }
            Button(
                onClick = {
                    val intent = Intent(context, MainActivity4::class.java)
                    context.startActivity(intent)
                },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.call_foreground),
                    contentDescription = "Settings",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(5.dp),
                    tint = Color.Black
                )
                Text(
                    text = "Emergency Contacts",
                    color = Color.Black,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(10.dp),
                    fontStyle = FontStyle.Italic
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Mi UIPrincipal"
)

@Composable
fun GreetingPreviewPrincipal() {
    Laboratorio4Theme {
        CardMenuPrincipal()
    }
}