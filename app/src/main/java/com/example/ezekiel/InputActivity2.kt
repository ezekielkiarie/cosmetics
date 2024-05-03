@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.ezekiel

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ezekiel.ui.theme.EzekielTheme
import com.example.mid.R


class InputActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)

@Composable
fun input() {


    Box(modifier = Modifier
        .fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.lion),
            contentDescription =" ",
            modifier = Modifier
                .fillMaxSize(),

            contentScale = ContentScale.Crop


            )

    }



    Column (
        modifier = Modifier
            .fillMaxSize()

    ){

        var name by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(value = name,
            onValueChange = {name = it},
            label = {Text (text = "Name")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "")},


            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                cursorColor = Color.White,




            )


            )

Spacer(modifier = Modifier.height(20.dp))

        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(value = email,
            onValueChange = {email = it},
            label = {Text(text = "Enter Email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},

            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                cursorColor = Color.White,




            )


            )

        Spacer(modifier = Modifier.height(20.dp))

        var password by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(value = password,
            onValueChange = {password = it},
            label = {Text (text = "Enter password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "")},


            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                cursorColor = Color.White



            )
        )


        Spacer(modifier = Modifier.height(20.dp))

        var phone by remember {
            mutableStateOf(TextFieldValue(""))
        }

        OutlinedTextField(value = phone,
            onValueChange = {phone = it},
            label = {Text (text = "Enter phone number")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "")},



            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                cursorColor = Color.White,



            )
        )





        val home = LocalContext.current
        Text(text = "Click if forgot password",
            modifier = Modifier
                .clickable {

                    home.startActivity(Intent(home, MainActivity::class.java))
                }

        )







    }


    LazyColumn() {
        item {
            Column {

            }

        }

    }



}
