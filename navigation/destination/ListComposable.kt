package com.example.myfirstcomposedemo.navigation.destination

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.myfirstcomposedemo.Util.Constants.LIST_ARGUMENTS_KEY
import com.example.myfirstcomposedemo.Util.Constants.LIST_SCREEN
import com.example.myfirstcomposedemo.ui.Screens.List.ListScreen
import com.example.myfirstcomposedemo.ui.viewmodels.SharedViewModel


@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigateToTaskScreens: (Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENTS_KEY) {
            type = NavType.StringType
        })
    ) {
        ListScreen(navigateToTaskScreens,
        sharedViewModel)
    }
}
