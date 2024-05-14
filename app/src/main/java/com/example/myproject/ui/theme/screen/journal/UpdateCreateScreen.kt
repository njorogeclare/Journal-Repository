package com.example.myproject.ui.theme.screen.journal

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myproject.data.CreateViewModel
import com.example.myproject.models.Create
import com.example.myproject.navigation.ROUTE_CREATE
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UpdateCreateScreen(navController: NavHostController, id: String) {

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context = LocalContext.current
        var write by remember { mutableStateOf("") }

        var currentDataRef = FirebaseDatabase.getInstance().getReference()
            .child("Creates/$id")
        currentDataRef.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val create = snapshot.getValue(Create::class.java)

                    write = create!!.write


            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
            }
        })

        Text(
            text = "My Files",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Red,
            modifier = Modifier.padding(20.dp),
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        var Write by remember{ mutableStateOf(TextFieldValue(write)) }

        OutlinedTextField(
            value = Write,
            onValueChange = { Write= it },
            label = { Text(text = "Write here*") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Repeat the above pattern for other fields: `to`, `time`, `name`, `vehicle`, `number`, `id`

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            //-----------WRITE THE UPDATE LOGIC HERE---------------//
            var createRepository = CreateViewModel(navController, context)
            createRepository.updateCreate(Write.text.trim(), id )
            navController.navigate(ROUTE_CREATE)
        }) {
            Text(text = "Update")
        }
    }
}

@Preview
@Composable
fun UpdateCreateScreenPreview() {
    UpdateCreateScreen(rememberNavController(), id = "")
}