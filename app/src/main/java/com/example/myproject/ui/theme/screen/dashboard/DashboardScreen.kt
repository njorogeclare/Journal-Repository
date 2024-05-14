//package com.example.myproject.ui.theme.screen.dashboard
//
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.OutlinedButton
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextButton
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.RectangleShape
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.example.myproject.R
//import com.example.myproject.navigation.ROUTE_ABOUT
//import com.example.myproject.navigation.ROUTE_CALL
//import com.example.myproject.navigation.ROUTE_CONTACT
//import com.example.myproject.navigation.ROUTE_HOME
//import com.example.myproject.navigation.ROUTE_JOURNAL
//import com.example.myproject.navigation.ROUTE_LOCATION
//import com.example.myproject.navigation.ROUTE_LOGOUT
//import com.example.myproject.navigation.ROUTE_SURVIVORS
//
//
//@Composable
//fun DashboardScreen(navController: NavHostController) {
//    val scrollState = rememberScrollState()
//    Column (
//        modifier = Modifier
//            .verticalScroll(state = scrollState)
//            .background(color = Color.Yellow)
//    ){
//        Box {
////            Image(painter = painterResource(id = R.drawable.pl6), contentDescription = ".", contentScale = ContentScale.FillBounds,
////                modifier = Modifier.matchParentSize())
//        }
//        var selectedTab by remember { mutableStateOf("Home") }
//
//        Surface(color = Color.Yellow) {
//            Row(
//                modifier = Modifier
//                    .padding(10.dp)
//                    .fillMaxWidth()
//                    .fillMaxSize()
//                    .fillMaxHeight()
//
//
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.mm),
//                    contentDescription = "",
//                    Modifier.size(60.dp)
//                )
//
//                Spacer(modifier = Modifier.height(10.dp))
//
//                Row {
//                    com.example.myproject.ui.theme.screen.home.NavigationButton(
//                        "Home",
//                        selectedTab == "Home"
//                    ) {
//                        selectedTab = "Home"
//                        navController.navigate(ROUTE_HOME) // Replace "ROUTE_HOME" with the actual route name
//                    }
//                    com.example.myproject.ui.theme.screen.home.NavigationButton(
//                        "About Us",
//                        selectedTab == "About Us"
//                    ) {
//                        selectedTab = "About Us"
//                        navController.navigate(ROUTE_ABOUT) // Replace "ROUTE_ABOUT" with the actual route name
//                    }
//                    com.example.myproject.ui.theme.screen.home.NavigationButton(
//                        "Contact",
//                        selectedTab == "Contact"
//                    ) {
//                        selectedTab = "Contact"
//                        navController.navigate(ROUTE_CONTACT) // Replace "ROUTE_CONTACT" with the actual route name
//                    }
//
//                }
//            }
//
//            Text(
//                text = "DASHBOARD",
//                style = MaterialTheme.typography.headlineMedium,
//                fontWeight = FontWeight.Bold,
//                fontFamily = FontFamily.Serif,
//                color = Color.Black,
//                modifier = Modifier
//                    .padding(top = 80.dp)
//                    .padding(start = 60.dp)
//                    .padding(bottom = 80.dp),
//                fontSize = 40.sp
//            )
//        }
//        OutlinedButton(
//            onClick = {
//                navController.navigate(ROUTE_CALL)
//            },
//            border = BorderStroke(0.dp, Color.Yellow),
//            shape = (RectangleShape),
//            modifier = Modifier
//                .padding(horizontal = 110.dp)
//                .padding(top = 0.dp, start = 0.dp)
////            .width(10.dp)
////            .height(10.dp)
////
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.redo),
//                contentDescription = "",
//                Modifier.size(100.dp)
//            )
//        }
//        Text(
//            text = "EMERGENCY",
//            color = Color.Red,
//            modifier = Modifier.padding(top = 0.dp, start = 130.dp),
//            fontSize = 20.sp
//        )
//        Text(
//            text = "CALL",
//            color = Color.Red,
//            modifier = Modifier.padding(top = 0.dp, start = 150.dp),
//            fontSize = 20.sp
//        )
//
//
//        OutlinedButton(
//            onClick = {
//                navController.navigate(ROUTE_LOCATION)
//            },
//            border = BorderStroke(0.dp, Color.Yellow),
//            shape = (RectangleShape),
//            modifier = Modifier
//                .padding(horizontal = 100.dp)
//                .padding(top = 30.dp, start = 0.dp)
////            .width(15.dp)
////            .height(15.dp)
//                .padding(start = 6.dp)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.mafu),
//                contentDescription = "",
//                Modifier.size(100.dp)
//            )
//        }
//        Text(
//            text = "MY LOCATION",
//            color = Color.Black,
//            modifier = Modifier.padding(top = 10.dp, start = 130.dp),
//            fontSize = 20.sp
//        )
//////    Spacer(modifier = Modifier.height(100.dp))
//        OutlinedButton(
//            onClick = {
//                navController.navigate(ROUTE_JOURNAL) },
//            border = BorderStroke(1.dp, Color.Yellow),
//            shape = (RectangleShape),
//            modifier = Modifier
//                .padding(top = 50.dp, start = 90.dp)
////            .width(15.dp)
////            .height(15.dp)
//                .padding(start = 16.dp)
//            ) {
//            Image(
//                painter = painterResource(id = R.drawable.beauty),
//                contentDescription = "",
//                Modifier.size(100.dp)
//            )
//        }
//        Text(
//            text = "MY JOURNAL",
//            color = Color.Black,
//            modifier = Modifier.padding(top = 20.dp, start = 130.dp),
//            fontSize = 20.sp
//        )
//        OutlinedButton(
//            onClick = { navController.navigate(ROUTE_SURVIVORS) },
//            border = BorderStroke(1.dp, Color.Yellow),
//            shape = (RectangleShape),
//            modifier = Modifier
//                .padding(top = 60.dp, start = 130.dp)
////            .width(15.dp)
////            .height(15.dp)
//                .padding(start = 6.dp)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.gaols),
//                contentDescription = "",
//                Modifier.size(100.dp)
//            )
//        }
//        Text(
//            text = "OUR STORY",
//            color = Color.Black,
//            modifier = Modifier.padding(top = 30.dp, start = 120.dp),
//            fontSize = 20.sp
//        )
//
//    OutlinedButton(
//        onClick = {
//            navController.navigate(ROUTE_LOGOUT)
//        },
//        border = BorderStroke(1.dp, Color.Black),
//        shape = (RectangleShape),
//        modifier = Modifier
//            .padding(top = 70.dp, start = 120.dp)
//            .width(5.dp)
//            .height(5.dp)
//            .padding(start = 6.dp)
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.yess),
//            contentDescription = "",
//            Modifier.size(100.dp)
//        )
//    }
//    Text(
//        text = "LOG OUT",
//        color = Color.Black,
//        modifier = Modifier.padding(top = 80.dp, start = 120.dp),
//        fontSize = 20.sp
//    )
//
//
//    }
//
//}
//@Composable
//fun NavigationButton(text: String, isSelected: Boolean, onClick: () -> Unit) {
//    TextButton(onClick = onClick) {
//        Text(
//            text = text,
//            style = MaterialTheme.typography.bodyMedium,
//            color = if (isSelected) MaterialTheme.colorScheme.primary else Color.Black
//        )
//    }
//
//}
//
//@Preview
//@Composable
//fun DashboardScreenPreview() {
//    DashboardScreen(rememberNavController())
//
//}
//
//
//
//
