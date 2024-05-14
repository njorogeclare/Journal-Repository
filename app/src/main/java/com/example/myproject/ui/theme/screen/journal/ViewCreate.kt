package com.example.myproject.ui.theme.screen.journal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myproject.data.CreateViewModel
import com.example.myproject.models.Create
import com.example.myproject.navigation.ROUTE_UPDATE_CREATE

@Composable
fun ViewCreateScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        val context = LocalContext.current
        val createRepository = CreateViewModel(navController, context)
        val emptyCreateState = remember { mutableStateOf(Create("")) }
        val emptyCreateListState = remember { mutableStateListOf<Create>() }

        val create = createRepository.viewCreate(emptyCreateState, emptyCreateListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "My Files",
                fontSize = 60.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(create){
                    CreateItem(
                        write= it.write,
                        navController = navController,
                        createRepository = createRepository
                    )
                }
            }
        }
    }

}



@Composable
fun CreateItem(
    write:String,
    navController: NavHostController, createRepository: CreateViewModel,
) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = write)
        Button(onClick = {
            val id = ""
            createRepository.deleteCreate(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            val id = ""
            navController.navigate(ROUTE_UPDATE_CREATE+"/$id")
        }) {
            Text(text = "Update")
        }
    }

}

@Preview
@Composable
fun ViewCreatePreview() {
    ViewCreateScreen(rememberNavController())

}