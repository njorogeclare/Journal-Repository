//package com.example.myproject.ui.theme.screen.mylocation
//
//import android.widget.Toast
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material3.Button
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.OutlinedTextField
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
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.text.style.TextDecoration
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.example.myproject.data.LocationViewModel
//import com.example.myproject.models.Location
//import com.example.myproject.navigation.ROUTE_VIEW_LOCATION
//import com.google.firebase.database.DataSnapshot
//import com.google.firebase.database.DatabaseError
//import com.google.firebase.database.FirebaseDatabase
//import com.google.firebase.database.ValueEventListener
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun UpdateLocationScreen(navController: NavHostController, id: String) {
//    Column(modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally) {
//        var context = LocalContext.current
//        var fromValue by remember { mutableStateOf("") }
//        var toValue by remember { mutableStateOf("") }
//        var timeValue by remember { mutableStateOf("") }
//        var nameValue by remember { mutableStateOf("") }
//        var vehicleValue by remember { mutableStateOf("") }
//        var numberValue by remember { mutableStateOf("") }
//        var idValue by remember { mutableStateOf("") }
//
//        var currentDataRef = FirebaseDatabase.getInstance().getReference()
//            .child("Locations/$id")
//        currentDataRef.addValueEventListener(object: ValueEventListener{
//            override fun onDataChange(snapshot: DataSnapshot) {
//                val location = snapshot.getValue(Location::class.java)
//                if (location != null) {
//                    fromValue = location.from
//                    toValue = location.to
//                    timeValue = location.time
//                    nameValue = location.name
//                    vehicleValue = location.vehicle
//                    numberValue = location.number
//                    idValue = location.id
//                }
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
//            }
//        })
//
//        Text(
//            text = "My Location",
//            fontSize = 30.sp,
//            fontFamily = FontFamily.Cursive,
//            color = Color.Red,
//            modifier = Modifier.padding(20.dp),
//            fontWeight = FontWeight.Bold,
//            textDecoration = TextDecoration.Underline
//        )
//
//        OutlinedTextField(
//            value = fromValue,
//            onValueChange = { fromValue = it },
//            label = { Text(text = "Destination from *") },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        // Repeat the above pattern for other fields: `to`, `time`, `name`, `vehicle`, `number`, `id`
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(onClick = {
//            //-----------WRITE THE UPDATE LOGIC HERE---------------//
//            var locationRepository = LocationViewModel(navController, context)
//            locationRepository.updateLocation(
//                id = idValue, // Pass the id parameter here
//                from = fromValue.trim(),
//                to = toValue.trim(),
//                time = timeValue.trim(),
//                name = nameValue.trim(),
//                vehicle = vehicleValue.trim(),
//                number = numberValue.trim()
//            )
//            navController.navigate(ROUTE_VIEW_LOCATION)
//        }) {
//            Text(text = "Update")
//        }
//    }
//}
//
//@Preview
//@Composable
//fun UpdateLocationScreenPreview() {
//    UpdateLocationScreen(rememberNavController(), id = "")
//}