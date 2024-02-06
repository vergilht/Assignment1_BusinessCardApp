package com.example.assignment1_businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment1_businesscardapp.ui.theme.Assignment1_BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1_BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xFF073042)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.profile_picture)
        Image(
            painter = image,
            contentDescription = "Profile Picture",
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
                .padding(bottom = 16.dp)
        )
        Text(text = "Vergil Phan", color = Color.White, fontSize = 32.sp)
        Text(text = "Android Developer", color = Color(0xFF3ddc84))
    }

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .padding(start = 70.dp)
        ) {
            val phone = painterResource(id = R.drawable.phone)
            Icon(
                painter = phone,
                contentDescription = null,
                modifier = Modifier.padding(8.dp).size(30.dp)
            )
            Text(
                text = "+1 (123) 456 7890",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
        Divider(
            modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .padding(start = 70.dp)
        ) {
            val email = painterResource(id = R.drawable.email)
            Icon(painter = email, contentDescription = null, modifier = Modifier.padding(8.dp).size(30.dp))
            Text(
                text = "@vergilphan",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
        Divider(
            modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .padding(start = 70.dp)
        ) {
            val linkedin = painterResource(id = R.drawable.home)
            Icon(painter = linkedin, contentDescription = null, modifier = Modifier.padding(8.dp).size(30.dp))
            Text(
                text = "123 1st St, Calgary, AB",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Assignment1_BusinessCardAppTheme {
        BusinessCard()
    }
}