package com.example.myfirstcomposedemo.ui.Screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.myfirstcomposedemo.Util.Action

@Composable
fun TaskScreen(
    navigationToListScreens: (Action) -> Unit

) {
    Scaffold(
        topBar = {
                 TaskAppBar(navigationToListScreens = navigationToListScreens)
        },
        content = {}
    )
}