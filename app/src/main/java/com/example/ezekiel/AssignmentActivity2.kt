package com.example.ezekiel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ezekiel.ui.theme.EzekielTheme
import com.example.mid.R

class AssignmentActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Asino()

        }
    }
}
@Preview(showBackground = true)

@Composable
fun Asino() {
  LazyColumn {
      item {

          Column(
              horizontalAlignment = Alignment.CenterHorizontally,

              modifier = Modifier
                  .padding()
                  .background(Color.White)
                  .fillMaxSize()
          ) {


              Row(

                  horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                  verticalAlignment = Alignment.CenterVertically,

                  modifier = Modifier
                      .fillMaxWidth(),



              ) {

                  Icon(imageVector = Icons.Default.Person, contentDescription = "")


                  Column {
                      Text(text = "Current Location")

                      Row {

                          Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                          Text(text = "Denpasar, Bali", fontWeight = FontWeight.Bold)

                      }
                  }


                  Image(painter = painterResource(id = R.drawable.lion), contentDescription ="",
                      modifier = Modifier
                          .size(20.dp)
                          .clip(RoundedCornerShape(100))

                  )

              }

              Row (


                  horizontalArrangement = Arrangement.Absolute.SpaceBetween7
//                  verticalAlignment = Alignment.CenterVertically,

              ){
                  Column {
                      Row (
                          modifier = Modifier
                              .padding()
                              .background(Color.White)
                              .shadow(elevation = 10.dp)
                              .padding(10.dp)
                      ){


                          Image(imageVector = Icons.Default.Home,
                              contentDescription ="",

                          )
                          Text(text = "Hotels")
                      }

                      Spacer(modifier = Modifier.height(15.dp))

                      Row (
                          horizontalArrangement = Arrangement.SpaceBetween,


                          modifier = Modifier
                              .padding()
                              .background(Color.White)
                              .shadow(elevation = 10.dp)
                              .padding(10.dp)

                      ) {


                          Image(imageVector = Icons.Default.ShoppingCart,
                              contentDescription ="",
                          )
                          Text(text = "Shop")
                      }
                      Spacer(modifier = Modifier.height(15.dp))

                      Row (
                          horizontalArrangement = Arrangement.SpaceBetween,

                          modifier = Modifier
                              .padding()
                              .background(Color.White)
                              .shadow(elevation = 10.dp)
                              .padding(10.dp)

                      ){


                          Image(imageVector = Icons.Default.Email,
                              contentDescription ="",
                          )
                          Text(text = "Email")
                      }



                  }


                  Spacer(modifier = Modifier.width(100.dp))

                  Column {

                      Row (
                          horizontalArrangement = Arrangement.SpaceBetween,


                          modifier = Modifier
                              .padding()
                              .background(Color.White)
                              .shadow(elevation = 10.dp)
                              .padding(10.dp)
                      ){


                          Image(imageVector = Icons.Default.Place,
                              contentDescription ="",
                          )
                          Text(text = "Area")
                      }
                      Spacer(modifier = Modifier.height(15.dp))

                      Row (
                          horizontalArrangement = Arrangement.SpaceBetween,


                          modifier = Modifier
                              .padding()
                              .background(Color.White)
                              .shadow(elevation = 10.dp)
                              .padding(10.dp)

                      ){


                          Image(imageVector = Icons.Default.Notifications,
                              contentDescription ="",
                          )
                          Text(text = "Notify")
                      }
                      Spacer(modifier = Modifier.height(15.dp))


                      Row (
                          horizontalArrangement = Arrangement.SpaceBetween,


                          modifier = Modifier
                              .padding()
                              .background(Color.White)
                              .shadow(elevation = 10.dp)
                              .padding(10.dp)
                      ){


                          Image(imageVector = Icons.Default.DateRange,
                              contentDescription ="",
                          )
                          Text(text = "Date")
                      }
                      Spacer(modifier = Modifier.height(15.dp))





                  }


              }
              Row (
                  horizontalArrangement = Arrangement.SpaceBetween,
                  modifier = Modifier
                      .padding()
              ){

                  Image(painter = painterResource(id =R.drawable.writing ),
                      contentDescription ="",
                      modifier = Modifier
                          .size(50.dp)
                          .clip(RoundedCornerShape(10)),

                  )
                  
                  Spacer(modifier = Modifier.width(50.dp))

                  Image(painter = painterResource(id =R.drawable.images ),
                      contentDescription ="",
                      modifier = Modifier
                          .size(50.dp)
                          .clip(RoundedCornerShape(10)),

                      )

              }


              }


              }
         }

      }





