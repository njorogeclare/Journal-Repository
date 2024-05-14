//package com.example.myproject.ui.theme.screen.mylocation
//
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateListOf
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.example.myproject.data.LocationViewModel
//import com.example.myproject.models.Location
//import com.example.myproject.navigation.ROUTE_UPDATE_LOCATION
//
//
//
//
//@Composable
//fun ViewLocationScreen(navController:NavHostController) {
//    Column(modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally) {
//
//        val context = LocalContext.current
//        val locationRepository = LocationViewModel(navController, context)
//        val emptyLocationState = remember { mutableStateOf(Location("","","","","","","")) }
//        val emptyLocationListState = remember { mutableStateListOf<Location>() }
//
//        val location = locationRepository.viewLocation(emptyLocationState, emptyLocationListState)
//
//
//        Column(
//            modifier = Modifier
//                .fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(text = "My Location",
//                fontSize = 30.sp,
//                fontFamily = FontFamily.Cursive,
//                color = Color.Red)
//
//            Spacer(modifier = Modifier.height(20.dp))
//
//            LazyColumn(){
//                items(location){
//                    LocationItem(
//                        from = it.from,
//                        to = it.to,
//                        time = it.time,
//                        name = it.name,
//                        vehicle = it.vehicle,
//                        number = it.number,
//                        id = it.id,
//                        navController = navController,
//                        locationRepository = locationRepository
//                    )
//                }
//            }
//        }
//    }
//
//}
//
//
//
//@Composable
//fun LocationItem(
//    from: String, to: String, time: String, name: String, vehicle: String, number: String, id:String,
//    navController: NavHostController, locationRepository: LocationViewModel,
//) {
//
//    Column(modifier = Modifier.fillMaxWidth()) {
//        Text(text = from)
//        Text(text = to)
//        Text(text = time)
//        Text(text = name)
//        Text(text = vehicle)
//        Text(text = number)
//        Text(text = id)
//        Button(onClick = {
//            locationRepository.deleteLocation(id)
//        }) {
//            Text(text = "Delete")
//        }
//        Button(onClick = {
//            navController.navigate(ROUTE_UPDATE_LOCATION+"/$id")
//        }) {
//            Text(text = "Update")
//        }
//    }
//
//}
//
//@Preview
//@Composable
//fun ViewLocationPreview() {
//    ViewLocationScreen(rememberNavController())
//
//}