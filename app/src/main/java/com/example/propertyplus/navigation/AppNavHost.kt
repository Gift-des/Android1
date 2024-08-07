package com.example.propertyplus.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.ui.theme.screens.about.AboutScreen
import com.example.propertyplus.ui.theme.screens.details.DetailsScreen
import com.example.propertyplus.ui.theme.screens.home.HomeScreen
import com.example.propertyplus.ui.theme.screens.home.SplashScreen
import com.example.propertyplus.ui.theme.screens.property.PropertyScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }
        composable(ROUT_DETAIL) {
            DetailsScreen(navController = navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }
        composable(ROUT_PROPERTY) {
            PropertyScreen(navController = navController)
        }

    }
}