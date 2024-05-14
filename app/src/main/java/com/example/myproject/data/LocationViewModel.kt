package com.example.myproject.data
//
////import androidx.compose.ui.tooling.data.EmptyGroup.location
////import com.example.newproject.models.Upload
////import com.example.newproject.navigation.ROUTE_LOGIN
//import android.app.ProgressDialog
//import android.content.Context
//import android.widget.Toast
//import androidx.compose.runtime.MutableState
//import androidx.compose.runtime.snapshots.SnapshotStateList
//import androidx.navigation.NavHostController
//import com.example.myproject.models.Location
//import com.example.myproject.navigation.ROUTE_LOCATION
//import com.google.firebase.database.DataSnapshot
//import com.google.firebase.database.DatabaseError
//import com.google.firebase.database.FirebaseDatabase
//import com.google.firebase.database.ValueEventListener
//
//class LocationViewModel(var navController: NavHostController, var context: Context) {
//    var authRepository: AuthViewModel
//    var progress: ProgressDialog
//
//    init {
//        authRepository = AuthViewModel(navController, context)
//        if (!authRepository.isloggedin()) {
//            navController.navigate(ROUTE_LOCATION)
//            // Handle error condition here, such as displaying an error message
//            Toast.makeText(context, "User not logged in", Toast.LENGTH_SHORT).show()
//        }
//        progress = ProgressDialog(context)
//        progress.setTitle("Loading")
//        progress.setMessage("Please wait...")
//    }
//
//
//    fun saveLocation(
//        from: String,
//        to: String,
//        time: String,
//        name: String,
//        vehicle: String,
//        number: String,
//        trim: String,
//
//        ) {
//        val id = System.currentTimeMillis().toString()
//        val locationData = Location(from, to, time, name, vehicle, number, id) // Added 'id' parameter
//        val locationRef = FirebaseDatabase.getInstance().getReference()
//            .child("Locations/$id")
//        progress.show()
//        locationRef.setValue(locationData).addOnCompleteListener { task ->
//            progress.dismiss()
//            if (task.isSuccessful) {
//                Toast.makeText(context, "Saving successful", Toast.LENGTH_SHORT).show()
//            } else {
//                val errorMessage = task.exception?.message ?: "Unknown error"
//                Toast.makeText(context, "ERROR: $errorMessage", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//
//
//    fun viewLocation(
//        location: MutableState<Location>,
//        Locations: SnapshotStateList<Location>
//    ): SnapshotStateList<Location> {
//        val ref = FirebaseDatabase.getInstance().getReference().child("Locations")
//
//        ref.addValueEventListener(object : ValueEventListener {
//            override fun onDataChange(snapshot: DataSnapshot) {
//                Locations.clear() // Clear the list passed as parameter
//                for (snap in snapshot.children) {
//                    val value = snap.getValue(Location::class.java)
//                    if (value != null) {
//                        location.value = value
//                        Locations.add(value)
//                    }
//                }
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                // Handle cancellation, perhaps show a toast
//                // Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
//            }
//        })
//        return Locations
//    }
//
//    fun updateLocation(
//        id: String, // Add id parameter here
//        from: String,
//        to: String,
//        time: String,
//        name: String,
//        vehicle: String,
//        number: String
//    ) {
//        val updateRef = FirebaseDatabase.getInstance().getReference()
//            .child("Locations/$id")
//        progress.show()
//        val updateData = Location(from, to, time, name, vehicle, number, id)
//        updateRef.setValue(updateData).addOnCompleteListener { task ->
//            progress.dismiss()
//            if (task.isSuccessful) {
//                Toast.makeText(context, "Update successful", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(context, task.exception?.message, Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//
//
//    fun deleteLocation(id: String) {
//        var delRef = FirebaseDatabase.getInstance().getReference()
//            .child("Locations/$id")
//        progress.show()
//        delRef.removeValue().addOnCompleteListener {
//            progress.dismiss()
//            if (it.isSuccessful) {
//                Toast.makeText(context, "Location deleted", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//
//
//
//}
//
//operator fun Unit.not(): Boolean {
//    TODO("Not yet implemented")
//}
////    fun saveProductWithImage(productName:String, productQuantity:String, productPrice:String, filePath: Uri){
////        var id = System.currentTimeMillis().toString()
////        var storageReference = FirebaseStorage.getInstance().getReference().child("Uploads/$id")
////        progress.show()
////
////        storageReference.putFile(filePath).addOnCompleteListener{
////            progress.dismiss()
////            if (it.isSuccessful){
////                // Proceed to store other data into the db
////                storageReference.downloadUrl.addOnSuccessListener {
////                    var imageUrl = it.toString()
////                    var houseData = Upload(productName,productQuantity,
////                        productPrice,imageUrl,id)
////                    var dbRef = FirebaseDatabase.getInstance()
////                        .getReference().child("Uploads/$id")
////                    dbRef.setValue(houseData)
////                    Toast.makeText(context, "Upload successful", Toast.LENGTH_SHORT).show()
////                    navController.navigate(ROUTE_VIEW_UPLOAD)
////                }
////            }else{
////                Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
////            }
////        }
////    }
////
////
////    fun viewUploads(upload:MutableState<Upload>, uploads:SnapshotStateList<Upload>): SnapshotStateList<Upload> {
////        var ref = FirebaseDatabase.getInstance().getReference().child("Uploads")
////
////        progress.show()
////        ref.addValueEventListener(object : ValueEventListener {
////            override fun onDataChange(snapshot: DataSnapshot) {
////                progress.dismiss()
////                uploads.clear()
////                for (snap in snapshot.children){
////                    val value = snap.getValue(Upload::class.java)
////                    upload.value = value!!
////                    uploads.add(value)
////                }
////            }
////
////            override fun onCancelled(error: DatabaseError) {
////                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
////            }
////        })
////        return uploads
////    }
////}