package com.example.myproject.ui.theme.screen.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myproject.R
import com.example.myproject.navigation.ROUTE_LOGIN
import com.example.myproject.navigation.ROUTE_SIGNUP

//import androidx.compose.material3.ButtonColors

@Composable
fun HomeScreen(navController: NavHostController) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .verticalScroll(state = scrollState)
            .background(color = Color.Black)
    ) {

        Box {
//            Image(painter = painterResource(id = R.drawable.pl6), contentDescription = ".", contentScale = ContentScale.FillBounds,
//                modifier = Modifier.matchParentSize())
        }
        var selectedTab by remember { mutableStateOf("Home") }

        Surface(color = Color.Black) {
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .fillMaxSize()
                    .fillMaxHeight()


            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.mm),
//                    contentDescription = "",
//                    Modifier.size(60.dp)
//                )

                Spacer(modifier = Modifier.height(10.dp))

//                Row {
//                    NavigationButton("Home", selectedTab == "Home") {
//                        selectedTab = "Home"
//                        navController.navigate(ROUTE_HOME) // Replace "ROUTE_HOME" with the actual route name
//                    }
//                    NavigationButton("About Us", selectedTab == "About Us") {
//                        selectedTab = "About Us"
//                        navController.navigate(ROUTE_ABOUT) // Replace "ROUTE_ABOUT" with the actual route name
//                    }
//                    NavigationButton("Contact", selectedTab == "Contact") {
//                        selectedTab = "Contact"
//                        navController.navigate(ROUTE_CONTACT) // Replace "ROUTE_CONTACT" with the actual route name
//                    }
//                }


            }
            Text(
                text = "My Journal",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                color = Color.Yellow,
                modifier = Modifier
                    .padding(top = 70.dp)
                    .padding(start = 80.dp)
                    .padding(bottom = 80.dp),
                fontSize = 50.sp
            )
            Spacer(modifier = Modifier.height(100.dp))
        }

        Image(
            painter = painterResource(id = R.drawable.power),
            contentDescription = "",
            Modifier
                .padding(top = 0.dp)
                .padding(start = 0.dp)
        )

        Text(
            text = "Welcome to the realm of our journal application",
            Modifier
                .padding(top = 10.dp)
                .padding(start = 10.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Yellow
        )
        Text(
            text = "where the beauty of your innermost thoughts is celebrated and preserved with utmost care ",
            Modifier
                .padding(top = 30.dp)
                .padding(start = 0.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Yellow
        )
//        Text(
//            text = " From breaking glass ceilings to shattering ",
//            Modifier
//                .padding(top = 20.dp)
//                .padding(start = 0.dp),
//            fontSize = 18.sp,
//            fontWeight = FontWeight.Normal,
//            color = Color.Black
//        )
//        Text(
//            text = "stereotypes, the journey towards domestic",
//            Modifier
//                .padding(top = 10.dp)
//                .padding(start = 10.dp),
//            fontSize = 18.sp,
//            fontWeight = FontWeight.Normal,
//            color = Color.Black
//        )
//        Text(
//            text = "violence and femicide is far from over.",
//            Modifier
//                .padding(top = 5.dp)
//                .padding(start = 5.dp),
//            fontSize = 18.sp,
//            fontWeight = FontWeight.Normal,
//            color = Color.Black
//        )
        Text(
            text = "Join us on this enchanting journey, where the beauty of your words awaits to be discovered and cherished for eternity. ",
            Modifier
                .padding(top = 5.dp)
                .padding(start = 0.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Yellow
        )
        OutlinedCard(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.scrim,
                contentColor = Color.White,


                ),
            border = BorderStroke(1.dp, Color.Black),
            modifier = Modifier
                .size(width = 300.dp, height = 200.dp)
                .padding(top = 50.dp, start = 50.dp)
        ) {

            OutlinedButton(
                onClick = { navController.navigate(ROUTE_SIGNUP) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Create an account",
                    color = Color.Yellow,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Text(
                text = "Already have an account?",
                modifier = Modifier
                    .padding(start = 30.dp, top = 10.dp, bottom = 20.dp),
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                color = Color.Yellow

            )
            OutlinedButton(
                onClick = { navController.navigate(ROUTE_LOGIN) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Log In",
                    color = Color.Yellow
                )
            }

        }

    }

}
@Composable
fun NavigationButton(text: String, isSelected: Boolean, onClick: () -> Unit) {
    TextButton(onClick = onClick) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            color = if (isSelected) MaterialTheme.colorScheme.primary else Color.Black
        )
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())

}







