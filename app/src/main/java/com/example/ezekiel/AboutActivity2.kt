package com.example.ezekiel

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ezekiel.ui.theme.EzekielTheme
import com.example.mid.R

class AboutActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting2()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting2() {
    
    Column (

        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(18.dp),


        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
            

    ){

        Row(
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxWidth()

        ) {
            Text(text = "Ezekiel")

            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "Mburu")

            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "Kiarie")

    }

        Spacer(modifier = Modifier.height(40.dp))


        Text(text = "Another", fontSize = 30.sp,
            modifier = Modifier.background(Color.Gray))



        Text(text = "Ezekiel", fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .background(Color.Yellow)


                )


    Spacer(modifier = Modifier.width(10.dp))



        val kk = AnnotatedString("click here to go to home", spanStyle = SpanStyle(Color.Blue))
        val ee = LocalContext.current

        ClickableText(text = kk, onClick = {

            ee.startActivity(Intent(ee,MainActivity::class.java))
        })
        
        val zz = LocalContext.current
        Text(text = "Click here",
            modifier = Modifier
                .clickable {

                    zz.startActivity(Intent(zz, MainActivity::class.java))
                }

            )

        Image(painter = painterResource(id = R.drawable.writing), contentDescription ="" )


        val img = LocalContext.current
        Text(text = "About",
            modifier = Modifier
                .clickable {

                    img.startActivity(Intent(img, ImageActivity2::class.java))
                }


            )

        val inp = LocalContext.current
        Text(text = "Input",
            modifier = Modifier
                .clickable {

                    inp.startActivity(Intent(inp, InputActivity2::class.java))
                }



            )
        }


}


