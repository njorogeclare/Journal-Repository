package com.example.myproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.myproject.navigation.AppNavHost
import com.example.myproject.ui.theme.MyProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavHost()

                }
            }
        }
    }
}
//    private lateinit var binding: ActivityMainBinding
//    private lateinit var fusedLocationClient: FusedLocationProviderClient
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//
//
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
//
//        binding.btnGetLocation.setOnClickListener {
//            requestLocationPermission.launch(
//                arrayOf(
//                    Manifest.permission.ACCESS_FINE_LOCATION,
//                    Manifest.permission.ACCESS_COARSE_LOCATION
//                )
//            )
//        }
//
//        binding.btnCall.setOnClickListener {
//            val mobileNo = binding.txtMobileNo.text.toString()
//            val intent = Intent(Intent.ACTION_CALL)
//            intent.data = Uri.parse("tel:$mobileNo")
//            if (ActivityCompat.checkSelfPermission(
//                    this@MainActivity,
//                    Manifest.permission.CALL_PHONE
//                ) != PackageManager.PERMISSION_GRANTED
//            ) {
//                ActivityCompat.requestPermissions(
//                    this@MainActivity,
//                    arrayOf(Manifest.permission.CALL_PHONE),
//                    1
//                )
//            } else {
//                startActivity(intent)
//            }
//        }
//
//        createLocationRequest()
//
//
//    }
//
//    @SuppressLint("MissingPermission")
//    private val requestLocationPermission =
//        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
//            if (permissions[Manifest.permission.ACCESS_FINE_LOCATION] == true &&
//                permissions[Manifest.permission.ACCESS_COARSE_LOCATION] == true
//            ) {
//                Toast.makeText(this@MainActivity, "Location access granted", Toast.LENGTH_SHORT)
//                    .show()
//                if (isLocationEnabled()) {
//                    fusedLocationClient.lastLocation
//                        .addOnSuccessListener { location ->
//                            val lat = location.latitude
//                            val lon = location.longitude
//                            val locationInfo = "Latitude: $lat\nLongitude: $lon"
//                            binding.txtGetLocation.text = locationInfo
//                        }
//                } else {
//                    Toast.makeText(
//                        this@MainActivity,
//                        "Please turn on the location",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//            } else {
//                Toast.makeText(this@MainActivity, "No location access", Toast.LENGTH_SHORT)
//                    .show()
//            }
//        }
//
//    private fun isLocationEnabled(): Boolean {
//        val locationRequest = LocationRequest.create().apply {
//            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
//        }
//        val builder = LocationSettingsRequest.Builder().addLocationRequest(locationRequest)
//        val client: SettingsClient = LocationServices.getSettingsClient(this)
//        val task = client.checkLocationSettings(builder.build())
//        return try {
//            task.addOnSuccessListener {
//                true
//            }
//            false
//        } catch (e: ResolvableApiException) {
//            false
//        }
//    }
//
//    private fun createLocationRequest() {
//        val locationRequest = LocationRequest.create().apply {
//            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
//            interval = 10000
//        }
//        val builder = LocationSettingsRequest.Builder().addLocationRequest(locationRequest)
//        val client = LocationServices.getSettingsClient(this)
//        val task = client.checkLocationSettings(builder.build())
//        task.addOnSuccessListener {
//            // Location settings are satisfied, can initialize location requests here
//        }
//        task.addOnFailureListener { exception ->
//            if (exception is ResolvableApiException) {
//                try {
//                    exception.startResolutionForResult(this, 911)
//                } catch (sendEx: Exception) {
//                    // Ignore the error
//                }
//            }
//        }
//    }

