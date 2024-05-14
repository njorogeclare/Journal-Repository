package com.example.myproject.data
import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavController
import com.example.myproject.models.User
//import com.example.myproject.navigation.ROUTE_DASHBOARD
import com.example.myproject.navigation.ROUTE_HOME
import com.example.myproject.navigation.ROUTE_JOURNAL
import com.example.myproject.navigation.ROUTE_LOGIN
import com.example.myproject.navigation.ROUTE_SIGNUP
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel(var navController: NavController, var context: Context){

    var mAuth:FirebaseAuth =FirebaseAuth.getInstance()
    val progress:ProgressDialog=ProgressDialog(context)
    init {

        progress.setTitle("Loading")
        progress.setMessage("PLease Wait.....")
    }

    fun SignupScreen(email:String,pass:String,confirmpass:String,fullname:String,age:String,gender:String,location:String,address:String) {
// progress.show()
        if (email.isBlank() || pass.isBlank() || confirmpass.isBlank() || fullname.isBlank() || age.isBlank() || gender.isBlank() || location.isBlank() || address.isBlank()) {
            //progress.dismiss()
            Toast.makeText(context, "Please fill the details above", Toast.LENGTH_LONG).show()
            return
        } else if (pass != confirmpass) {
            Toast.makeText(context, "Password does not match", Toast.LENGTH_LONG).show()
            return
        } else {
            mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                if (it.isSuccessful) {
                    val userdata = User(email, pass, mAuth.currentUser!!.uid)
                    val regRef = FirebaseDatabase.getInstance().getReference()
                        .child("Users/" + mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {

                        if (it.isSuccessful) {
                            Toast.makeText(context, "Registered Successfully", Toast.LENGTH_LONG)
                                .show()
                            navController.navigate(ROUTE_LOGIN)
                        } else {
                            Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG)
                                .show()
                            navController.navigate(ROUTE_HOME)
                        }
                    }
                } else {
                    navController.navigate(ROUTE_SIGNUP)
                }

            }
        }

    }
    fun LoginScreen(email: String,password: String) {
        progress.show()

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Successfully Logged in", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_JOURNAL)
//                navController.navigate(ROUTE_REGISTER)TO TAKE YOU TO A DIIFFERNT PAGE
            } else {
                Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_LOGIN)
            }
        }

    }

    fun isloggedin():Boolean{
return mAuth.currentUser !=null
    }
}

//fun logout(){
//    mAuth.signOut()
//    navController.navigate(ROUTE_LOGIN)
//}
//fun isloggedin():Boolean{
//    return mAuth.currentUser !=null
//}
//
