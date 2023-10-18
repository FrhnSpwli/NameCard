package com.example.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.namecard.ui.theme.NameCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Gray
                ) {
                    NameCard()
                }
            }
        }
    }
}

@Composable
fun NameCard() {
    var fullName by remember { mutableStateOf(TextFieldValue("")) }
    var title by remember { mutableStateOf(TextFieldValue("")) }
    var phoneNumber by remember { mutableStateOf(TextFieldValue("")) }
    var instagram by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.weight(1f))

        // Full Name and Title box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.White),
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text("Andi Farhan Sappewali")
                BasicTextField(
                    value = fullName,
                    onValueChange = { value -> fullName = value },
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text("Front End Dev")
                BasicTextField(
                    value = title,
                    onValueChange = { value -> title = value },
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Phone Number, Instagram, and Email box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.White),
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text("+62 812-4125-2656")
                BasicTextField(
                    value = phoneNumber,
                    onValueChange = { value -> phoneNumber = value },
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("@andi_farhan123")
                BasicTextField(
                    value = instagram,
                    onValueChange = { value -> instagram = value },
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("andifarhansappewali407@gmail.com")
                BasicTextField(
                    value = email,
                    onValueChange = { value -> email = value },
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun NameCardPreview() {
    NameCardTheme {
        NameCard()
    }
}
