package com.example.myproject.ui.theme.screen.login

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
import androidx.compose.foundation.text.KeyboardOptions
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
import com.example.myproject.navigation.ROUTE_JOURNAL

//import com.example.myproject.data.AuthViewModel
//import com.example.firebaseauth.data.AuthViewModel
//import com.example.firebaseauth.navigation.ROUTE_HOME
//import com.example.firebaseauth.navigation.ROUTE_REGISTER
//import com.example.myproject.navigation.ROUTE_REGISTER

@Composable
fun LoginScreen(navController: NavHostController) {
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
//            Image(painter = painterResource(id = R.drawable.mm),
//                contentDescription ="",
//                Modifier.size(60.dp))

            Spacer(modifier = Modifier.height(10.dp))

//            Row {
//                NavigationButton("Home", selectedTab == "Home") { selectedTab = "Home" }
//                NavigationButton("About Us", selectedTab == "About Us") { selectedTab = "About Us" }
//                NavigationButton("Log In", selectedTab == "Contact") { selectedTab = "Contact" }
//            }

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
    var password by remember { mutableStateOf(TextFieldValue("")) }

    var context= LocalContext.current
    Column(modifier = Modifier
//        .fillMaxSize(),
        .padding(top = 170.dp)
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Log In",
            color = Color.Yellow,
            fontFamily = FontFamily.Serif,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = email, onValueChange = { email = it },
            label = { Text(text = "Enter email") },

            keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),

            )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = password, onValueChange = { password = it },
            label = { Text(text = "Enter Password") },

            keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),

            )
//

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(onClick = {
            val mylogin= AuthViewModel(navController, context)
            mylogin.LoginScreen(email.text.trim(),password.text.trim())
            navController.navigate(ROUTE_JOURNAL)
        }) {
            Text(text = "Log In")
        }
        Spacer(modifier = Modifier.height(20.dp))


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
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())

}






