package com.example.myproject.ui.theme.screen.journal


//import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myproject.R
import com.example.myproject.navigation.ROUTE_CREATE
import com.example.myproject.navigation.ROUTE_VIEW_CREATE

//import androidx.compose

//import com.example.newproject.R
//import com.example.newproject.navigation.ROUTE_ABOUT
//import com.example.newproject.navigation.ROUTE_ADD_PRODUCT
//import com.example.newproject.navigation.ROUTE_VIEW_PRODUCT

    @Composable
    fun Pic(navController: NavHostController) {
        Column(
            modifier = Modifier
                .background(color = Color.Black)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LocalContext.current
            //  var productdata=productviewmodel(navController,context)

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .height(1000.dp)
            ) {
//                Image(
//                    painter = painterResource(
//                        id = R.drawable.gabby
//                    ),
//                    contentDescription = ""
//                )
            }
        }
        Text(text = "MY JOURNAL",
            Modifier.padding(top = 30.dp, start = 60.dp),
            fontFamily = FontFamily.Cursive, fontSize = 40.sp, fontWeight = FontWeight.SemiBold, color = Color.White
        )
        Text(text = "Your personal sanctuary",
            Modifier.padding(top = 150.dp, start = 15.dp),
            fontFamily = FontFamily.Serif, fontSize = 30.sp, fontWeight = FontWeight.SemiBold, color = Color.White
        )
        Text(text = "to jot down every inner musing, capture cherished moments, and release all your tension and fears",
            Modifier.padding(top = 230.dp, start = 15.dp),
            fontFamily = FontFamily.Default, fontSize = 20.sp, fontWeight = FontWeight.SemiBold, color = Color.White

        )

        OutlinedButton(
            onClick = {
                navController.navigate(ROUTE_CREATE)
            },
            border = BorderStroke(0.dp, Color.Black),
            shape = (RectangleShape),
            modifier = Modifier
                .padding(top = 450.dp)
                .width(155.dp)
                .height(150.dp)
                .padding(start = 25.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.pink
                ),
                contentDescription = "",
                Modifier
                    .size(600.dp)
                    .width(100.dp),

                )

        }
        Text(
            text = "Create",
            color = Color.Black,
            modifier = Modifier.padding(top = 490.dp, start = 73.dp),
            fontSize = 15.sp
        )
        OutlinedButton(
            onClick = {
                navController.navigate(ROUTE_VIEW_CREATE)
            },
            border = BorderStroke(0.dp, Color.Black),
            shape = (RectangleShape),
            modifier = Modifier
                .padding(top = 450.dp, start = 200.dp)
                .width(155.dp)
                .height(150.dp)
                .padding(start = 25.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.pink
                ),
                contentDescription = "",
                Modifier
                    .size(600.dp)
                    .width(100.dp),

                )
        }
        Text(
            text = "My files",
            color = Color.Black,
            modifier = Modifier.padding(top = 490.dp, start = 270.dp),
            fontSize = 15.sp
        )

    }



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PicPreview(){
    Pic(navController = rememberNavController())
    //FilledCard(navController = rememberNavController() )
}

