package com.example.myproject.ui.theme.screen.sign_up

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myproject.data.AuthViewModel
import com.example.myproject.navigation.ROUTE_LOGIN


//import com.example.firebaseauth.data.AuthViewModel
//import com.example.firebaseauth.navigation.ROUTE_LOGIN
//import com.example.firebaseauth.navigation.ROUTE_REGISTER
@Composable
fun SignupScreen(navController: NavHostController) {
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
//               Image(painter = painterResource(id = R.drawable.mm),
//                   contentDescription ="",
//                   Modifier.size(60.dp))

               Spacer(modifier = Modifier.height(10.dp))

//               Row {
//                   NavigationButton("Home", selectedTab == "Home") {
//                       selectedTab = "Home"
//                       navController.navigate("ROUTE_HOME") // Replace "ROUTE_HOME" with the actual route name
//                   }
//                   NavigationButton("About Us", selectedTab == "About Us") {
//                       selectedTab = "About Us"
//                       navController.navigate("ROUTE_ABOUT") // Replace "ROUTE_ABOUT" with the actual route name
//                   }
//                   NavigationButton("Contact", selectedTab == "Contact") {
//                       selectedTab = "Contact"
//                       navController.navigate("ROUTE_CONTACT") // Replace "ROUTE_CONTACT" with the actual route name
//                   }
//               }


           }
           Text(
               text = "My Journal",
               style = MaterialTheme.typography.headlineMedium,
               fontWeight = FontWeight.Bold,
               color = Color.Yellow,
               fontFamily = FontFamily.Cursive,
               modifier = Modifier
                   .padding(top = 70.dp)
                   .padding(start = 80.dp)
                   .padding(bottom = 80.dp),
               fontSize = 50.sp
           )
           Spacer(modifier = Modifier.height(100.dp))

       }
       var email by remember { mutableStateOf(TextFieldValue("")) }
       var pass by remember { mutableStateOf(TextFieldValue("")) }
       var confirmpass by remember { mutableStateOf(TextFieldValue("")) }
       var fullname by remember { mutableStateOf(TextFieldValue("")) }
       var age by remember { mutableStateOf(TextFieldValue("")) }
       var gender by remember { mutableStateOf(TextFieldValue("")) }
       var location by remember { mutableStateOf(TextFieldValue(""))}
       var address by remember { mutableStateOf(TextFieldValue(""))}

       var username by remember { mutableStateOf(TextFieldValue(""))}
       var context= LocalContext.current
       Column(modifier = Modifier
//        .fillMaxSize(),
           .padding(top = 5.dp)
           .background(Color.Black),
           horizontalAlignment = Alignment.CenterHorizontally){
           Text(text = "Create your account",
               color = Color.Yellow,
               fontFamily = FontFamily.Cursive,
               fontSize = 30.sp)
           Spacer(modifier = Modifier.height(20.dp))

           OutlinedTextField(
               value = email, onValueChange = { email = it },
               label = { Text(text = "Enter Email") },
               textStyle = TextStyle(color = Color.White),

               keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(5.dp),

               )
//        Spacer(modifier = Modifier.height(10.dp))

           OutlinedTextField(value =pass , onValueChange = {pass=it},
               label = { Text(text = "Enter password") },
               textStyle = TextStyle(color = Color.White),
               keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(5.dp)
           )
//        Spacer(modifier = Modifier.height(20.dp))
           OutlinedTextField(value =confirmpass , onValueChange = {
               confirmpass=it},
               label = { Text(text = "Enter Confirm Password") },
               textStyle = TextStyle(color = Color.White),
               keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(5.dp)
           )
           OutlinedTextField(
               value = fullname, onValueChange = { fullname = it },
               label = { Text(text = "Enter Full Name") },
               textStyle = TextStyle(color = Color.White),
               keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(5.dp),

               )
           OutlinedTextField(
               value = age, onValueChange = { age = it },
               label = { Text(text = "Enter Age") },
               textStyle = TextStyle(color = Color.White),
               keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(5.dp),

               )
//        Spacer(modifier = Modifier.height(10.dp))

           OutlinedTextField(value =gender , onValueChange = {gender=it},
               label = { Text(text = "Gender") },
               textStyle = TextStyle(color = Color.White),
               keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(5.dp)
           )
//        Spacer(modifier = Modifier.height(20.dp))
           OutlinedTextField(value =location , onValueChange = {
               location=it},
               label = { Text(text = "Enter Location") },
               textStyle = TextStyle(color = Color.White),
               keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(5.dp)
           )
           OutlinedTextField(value =address , onValueChange = {
               address=it},
               label = { Text(text = "Enter Address") },
               textStyle = TextStyle(color = Color.White),
               keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(5.dp)
           )
           Spacer(modifier = Modifier.height(20.dp))

           OutlinedButton(onClick = {
               val myregister= AuthViewModel(navController,context)
               myregister.SignupScreen(email.text.trim(),pass.text.trim(),
                   confirmpass.text.trim(),fullname.text.trim(),age.text.trim(),gender.text.trim(), location.text.trim(),address.text.trim())
               navController.navigate(ROUTE_LOGIN) }) {
               Text(text = "Sign Up")
           }
           Spacer(modifier = Modifier.height(20.dp))


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
fun SignupScreenPreview() {
    SignupScreen(rememberNavController())

}







