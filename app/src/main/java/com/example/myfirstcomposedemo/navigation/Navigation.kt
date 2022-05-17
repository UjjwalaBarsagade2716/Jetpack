package com.example.myfirstcomposedemo.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.myfirstcomposedemo.Util.Constants
import com.example.myfirstcomposedemo.navigation.destination.listComposable
import com.example.myfirstcomposedemo.navigation.destination.taskComposable
import com.example.myfirstcomposedemo.ui.viewmodels.SharedViewModel

/*Remember all screens
* */

@ExperimentalMaterialApi
@Composable
fun SetUpNavigation(navHostController: NavHostController,  sharedViewModel: SharedViewModel) {

    val screen = remember(navHostController) {
        Screens(navController = navHostController)
    }

    NavHost(
        navController = navHostController,
        startDestination = Constants.LIST_SCREEN,
    ) {
        listComposable(
            navigateToTaskScreens = screen.task,
            sharedViewModel =sharedViewModel
        )
        taskComposable (
            navigateToListScreens = screen.list
        )
    }
}