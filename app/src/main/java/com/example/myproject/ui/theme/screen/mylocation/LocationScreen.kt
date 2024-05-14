//package com.example.myproject.ui.theme.screen.mylocation
//
//
//import android.app.Service
//import android.content.Intent
//import android.os.IBinder
//import android.util.Log
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
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.OutlinedButton
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.ImeAction
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.example.myproject.R
//import com.example.myproject.data.LocationViewModel
//import com.example.myproject.navigation.ROUTE_VIEW_LOCATION
//
//class TrackingService : Service() {
//    override fun onCreate() {
//        super.onCreate()
//        Log.d(TAG, "Service onCreate")
//        initializeTracking()
//    }
//
//    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//        Log.d(TAG, "Service onStartCommand")
//        startTracking()
//        return START_STICKY
//    }
//
//    override fun onBind(intent: Intent?): IBinder? {
//        return null
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d(TAG, "Service onDestroy")
//        stopTracking()
//    }
//    private fun initializeTracking() {
//        Log.d(TAG, "Initializing tracking logic...")
//    }
//    private fun startTracking() {
//        Log.d(TAG, "Starting tracking...")
//    }
//    private fun stopTracking() {
//        Log.d(TAG, "Stopping tracking...")
//    }
//    companion object {
//        private const val TAG = "TrackingService"
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LocationScreen(navController: NavHostController) {
//    val scrollState = rememberScrollState()
//Column(
//    modifier = Modifier
//        .verticalScroll(state = scrollState)
//        .background(color = Color.Black)
//) {
//
//    Box {
////            Image(painter = painterResource(id = R.drawable.pl6), contentDescription = ".", contentScale = ContentScale.FillBounds,
////                modifier = Modifier.matchParentSize())
//    }
//    var selectedTab by remember { mutableStateOf("Home") }
//
//    Surface(color = Color.Black) {
//        Row(
//            modifier = Modifier
//                .padding(10.dp)
//                .fillMaxWidth()
//                .fillMaxSize()
//                .fillMaxHeight()
//        ) {
//            Spacer(modifier = Modifier.height(10.dp))
//
//            var name by remember {mutableStateOf(TextFieldValue(""))
//            }
//
//            Image(
//                painter = painterResource(id = R.drawable.hioo),
//                contentDescription = "",
//                Modifier
//                    .padding(top = 0.dp)
//                    .padding(start = 0.dp)
//                    .fillMaxWidth()
//            )
//        }
//        Text(text = "I'M HERE!",
//            modifier = Modifier.padding(top = 200.dp, start = 130.dp),
//            color = Color.White,
//            fontWeight = FontWeight.ExtraBold,
//            fontSize = 30.sp)
//    }
//    Text(text = "Are you meeting a new person? Or are you unsure about your upcoming meet up?  Share the meet up details to ensure your safety.     WE VALUE YOU",
//        color = Color.White,
//        modifier = Modifier.padding(top = 40.dp),
//        fontSize = 15.sp)
//
//    Text(text = "Activate mobile tracking:",
//        color = Color.White,
//        modifier = Modifier.padding(top = 30.dp),
//        fontSize = 18.sp)
//
//
//    var from by remember { mutableStateOf(TextFieldValue("")) }
//    var to by remember { mutableStateOf(TextFieldValue("")) }
//    var time by remember { mutableStateOf(TextFieldValue("")) }
//    var name by remember { mutableStateOf(TextFieldValue(""))}
//    var vehicle by remember { mutableStateOf(TextFieldValue(""))}
//    var number by remember { mutableStateOf(TextFieldValue(""))}
//    var id by remember { mutableStateOf(TextFieldValue(""))}
//    val context= LocalContext.current
//    Column(modifier = Modifier
////        .fillMaxSize(),
//        .padding(top = 100.dp)
//        .background(Color.Black),
//        horizontalAlignment = Alignment.CenterHorizontally){
//
//        Spacer(modifier = Modifier.height(0.dp))
//        OutlinedTextField(
//            value = from, onValueChange = { from = it },
//            label = { Text(text = "Destination (from)",
//                color = Color.White) },
//            textStyle = TextStyle(color = Color.White),
//
//            keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(5.dp),
//
//            )
//
//        OutlinedTextField(value =to , onValueChange = {to=it},
//            label = { Text(text = "Destination (to) ",
//                color = Color.White) },
//            textStyle = TextStyle(color = Color.White),
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(5.dp)
//        )
//        OutlinedTextField(value =time , onValueChange = {
//            time=it},
//            label = { Text(text = "Time of Arrival",
//                color = Color.White) },
//            textStyle = TextStyle(color = Color.White),
//
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(5.dp)
//        )
//        OutlinedTextField(value =name , onValueChange = {
//            name=it},
//            label = { Text(text = "Name of the person you're meeting",
//                color = Color.White) },
//            textStyle = TextStyle(color = Color.White),
//
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(5.dp)
//        )
//        OutlinedTextField(value =vehicle , onValueChange = {
//            vehicle=it},
//            label = { Text(text = "Vehicle number plate",
//                color = Color.White) },
//            textStyle = TextStyle(color = Color.White),
//
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(5.dp)
//        )
//        OutlinedTextField(value =number, onValueChange = {
//            number=it},
//            label = { Text(text = "Phone number of the person",
//                color = Color.White) },
//            textStyle = TextStyle(color = Color.White),
//
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(5.dp)
//        )
//        OutlinedTextField(value =id, onValueChange = {
//            id=it},
//            label = { Text(text = "ID of the person",
//                color = Color.White) },
//            textStyle = TextStyle(color = Color.White),
//
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(5.dp)
//
//        )
//
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        OutlinedButton(onClick = {
//            val locationRepository = LocationViewModel(navController,context)
//            locationRepository.saveLocation(
//                from.text.trim(),
//                to.text.trim(),
//                time.text.trim(),
//                name.text.trim(),
//                vehicle.text.trim(),
//                number.text.trim(),
//                id.text.trim(),
//            )
//            navController.navigate(ROUTE_VIEW_LOCATION)
//
//
//        }) {
//            Text(text = "SUBMIT")
//
//        }
//
//    }
//
//}
//
//}
//
//
//
//
//@Preview
//@Composable
//fun LocationScreenPreview() {
//    LocationScreen(navController= rememberNavController())
////    ScrollableDefaults(navController = rememberNavController())
//}
//
//
//
//
//
//
//
//
