//package com.example.myproject.ui.theme.screen.frontpage
//
////import androidx.compose.material3.AlertDialogDefaults.containerColor
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.OutlinedButton
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.example.myproject.R
//import com.example.myproject.navigation.ROUTE_HOME
//
////import com.example.newproject.R
////import com.example.newproject.navigation.ROUTE_ABOUT
////import com.example.newproject.navigation.ROUTE_ADD_PRODUCT
////import com.example.newproject.navigation.ROUTE_VIEW_PRODUCT
//
//@Composable
//fun FrontScreen(navController: NavHostController){
////    Image(painter = painterResource(id = R.drawable.mickey), contentDescription = "image",
////        contentScale = ContentScale.FillBounds,
////        modifier = Modifier.fillMaxSize().fillMaxWidth())
//    Column(modifier = Modifier
//        .background(color = Color.Yellow)
//        .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally) {
//        var context= LocalContext.current
//        //  var productdata=productviewmodel(navController,context)
//
//
//
//        Image(painter = painterResource(id = R.drawable.mother),
//            contentDescription = "mama",
//
//
//            modifier = Modifier.padding(all = 50.dp))
//        Spacer(modifier = Modifier.height(100.dp))
//
//
//        OutlinedButton(
//            onClick = { navController.navigate(ROUTE_HOME) },
////            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text(
//                text = "GET STARTED",
//                color = Color.Black,
//                fontWeight = FontWeight.SemiBold
//            )
//        }
//
//
//
//    }
//}
//
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun FrontScreenPreview(){
//    FrontScreen(rememberNavController())
//}