package com.example.myproject.navigation


//import com.example.myproject.ui.theme.screen.about.AboutScreen
//import com.example.myproject.ui.theme.screen.contact.ContactScreen
//import com.example.myproject.ui.theme.screen.mylocation.LocationScreen
import ViewUploadsScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myproject.ui.theme.screen.home.HomeScreen
import com.example.myproject.ui.theme.screen.journal.CreateScreen
import com.example.myproject.ui.theme.screen.journal.Pic
import com.example.myproject.ui.theme.screen.journal.UpdateCreateScreen
import com.example.myproject.ui.theme.screen.journal.ViewCreateScreen
import com.example.myproject.ui.theme.screen.login.LoginScreen
import com.example.myproject.ui.theme.screen.sign_up.SignupScreen


@Composable
fun AppNavHost(modifier: Modifier =Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_HOME) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
//        composable(ROUTE_FRONT) {
//            FrontScreen(navController)
//        }
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
//        composable(ROUTE_DASHBOARD) {
//            DashboardScreen(navController)
//        }
        composable(ROUTE_JOURNAL) {
            Pic(navController)
        }
        composable(ROUTE_CREATE) {
            CreateScreen(navController)
        }
//        composable(ROUTE_CALL) {
////            CallScreen(navController)
//        }
//        composable(ROUTE_LOCATION) {
//            LocationScreen(navController)
//        }
//        composable(ACCESS_FINE_LOCATION) {
//            LocationScreen(navController)
//        }
//        composable(ACCESS_COURSE_LOCATION) {
//            LocationScreen(navController)
//        }
//        composable(ROUTE_VIEW_LOCATION) {
//            ViewLocationScreen(navController)
//        }
        composable(ROUTE_VIEW_CREATE) {
            ViewCreateScreen(navController)
        }
//        composable(ROUTE_ABOUT) {
//            AboutScreen(navController)
//        }
//        composable(ROUTE_CONTACT) {
//            ContactScreen(navController)
//        }
//        composable("$ROUTE_UPDATE_LOCATION/{id}"){
//                passedData ->
//            UpdateLocationScreen(
//                navController,passedData.arguments?.getString("id")!!)
//
//        }
        composable("$ROUTE_UPDATE_CREATE/{id}"){
                passedData ->
            UpdateCreateScreen(
                navController,passedData.arguments?.getString("id")!!)

        }
        composable(ROUTE_VIEW_UPLOAD) {
            ViewUploadsScreen(navController)
        }
    }
}