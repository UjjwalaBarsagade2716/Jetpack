package com.example.myfirstcomposedemo.navigation.destination

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.myfirstcomposedemo.Util.Action
import com.example.myfirstcomposedemo.Util.Constants
import com.example.myfirstcomposedemo.Util.Constants.LIST_ARGUMENTS_KEY
import com.example.myfirstcomposedemo.Util.Constants.LIST_SCREEN
import com.example.myfirstcomposedemo.Util.Constants.TASK_ARGUMENTS_KEY
import com.example.myfirstcomposedemo.Util.Constants.TASK_SCREEN
import com.example.myfirstcomposedemo.navigation.Screens
import com.example.myfirstcomposedemo.ui.Screens.task.TaskScreen


fun NavGraphBuilder.taskComposable(
    navigateToListScreens: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENTS_KEY) {
            type = NavType.IntType
        })
    ) { navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(TASK_ARGUMENTS_KEY)
        Log.d("taskComposable", taskId.toString())
        TaskScreen(navigationToListScreens = navigateToListScreens)
    }
}

