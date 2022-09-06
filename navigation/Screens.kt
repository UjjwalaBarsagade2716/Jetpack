package com.example.myfirstcomposedemo.navigation

import androidx.navigation.NavHostController
import com.example.myfirstcomposedemo.Util.Action
import com.example.myfirstcomposedemo.Util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {

    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }

/*@inclusive->remove our textComposable from back stack */

    }
    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}