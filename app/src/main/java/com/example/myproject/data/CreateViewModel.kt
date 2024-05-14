package com.example.myproject.data

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavHostController
import com.example.myproject.models.Create
import com.example.myproject.models.Upload
import com.example.myproject.navigation.ROUTE_LOGIN
import com.example.myproject.navigation.ROUTE_VIEW_UPLOAD
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

class CreateViewModel(var navController: NavHostController, var context: Context) {
    var authRepository: AuthViewModel = AuthViewModel (navController,context)
    var progress: ProgressDialog

    init {
        if (!authRepository.isloggedin()) {
            navController.navigate(ROUTE_LOGIN)
            // Handle error condition here, such as displaying an error message
            Toast.makeText(context, "User not logged in", Toast.LENGTH_SHORT).show()
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }


    fun saveCreate(
        Write: String,


        ) {
        val id = System.currentTimeMillis().toString()
        val createData = Create(Write) // Added 'id' parameter
        val createRef = FirebaseDatabase.getInstance().getReference()
            .child("Creates/$id")
        progress.show()
        createRef.setValue(createData).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Saving successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "ERROR: $(it.exception!!.message)", Toast.LENGTH_SHORT).show()
            }
        }
    }


    fun viewCreate(
        create: MutableState<Create>,
        creates: SnapshotStateList<Create>
    ): SnapshotStateList<Create> {
        val ref = FirebaseDatabase.getInstance().getReference().child("Creates")

        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                creates.clear() // Clear the list passed as parameter
                for (snap in snapshot.children) {
                    val value = snap.getValue(Create::class.java)
                        create.value = value!!
                        creates.add(value)

                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
            }
        })
        return creates
    }

    fun updateCreate(
       write: String,
       id: String
    ) {

        val updateRef = FirebaseDatabase.getInstance().getReference()
            .child("Creates/$id")
        progress.show()
        val updateData = Create(write)
        updateRef.setValue(updateData).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Update successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
            }
        }
    }


    fun deleteCreate(id: String) {
        var delRef = FirebaseDatabase.getInstance().getReference()
            .child("Creates/$id")
        progress.show()
        delRef.removeValue().addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "File deleted", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun saveCreateWithImage(Write: String, filePath: Uri){
        var id = System.currentTimeMillis().toString()
        var storageReference = FirebaseStorage.getInstance().getReference().child("Uploads/$id")
        progress.show()

        storageReference.putFile(filePath).addOnCompleteListener{
            progress.dismiss()
            if (it.isSuccessful){
                // Proceed to store other data into the db
                storageReference.downloadUrl.addOnSuccessListener {
                    var imageUrl = it.toString()
                    var houseData = Upload(Write,imageUrl,id)
                    var dbRef = FirebaseDatabase.getInstance()
                        .getReference().child("Uploads/$id")
                    dbRef.setValue(houseData)
                    Toast.makeText(context, "Upload successful", Toast.LENGTH_SHORT).show()
                    navController.navigate(ROUTE_VIEW_UPLOAD)
                }
            }else{
                Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun viewUploads(upload:MutableState<Upload>, uploads:SnapshotStateList<Upload>): SnapshotStateList<Upload> {
        var ref = FirebaseDatabase.getInstance().getReference().child("Uploads")
        progress.show()
        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                progress.dismiss()
                uploads.clear()
                for (snap in snapshot.children){
                    val value = snap.getValue(Upload::class.java)
                    upload.value = value!!
                    uploads.add(value)
                }
            }
            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
            }
        })
        return uploads
    }
}





