package com.example.littlelemonlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemonlogin.ui.theme.LittleLemonLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        LoginScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {
    Image(painter = painterResource(id = R.drawable.littlelemonlogo),
        contentDescription = "Logo Image",
        modifier = Modifier.padding(all = 10.dp)
    )
    TextField(value = "" , onValueChange = {},
        label = { Text(text = "Username") },
        modifier = Modifier.padding(all = 10.dp)
    )
    TextField(value = "" , onValueChange = {}, label = { Text(text = "Password") })
    Button(onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            Color(0xFF495E57)
        )
    ) {
        Text(text = "Login", color = Color(0xFFEDEFEE))
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LittleLemonLoginTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LoginScreen()
            }
        }
    }
}
