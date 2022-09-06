package com.example.myfirstcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.ExperimentalMaterialApi


import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myfirstcomposedemo.navigation.SetUpNavigation
import com.example.myfirstcomposedemo.ui.theme.MyFirstComposeDemoTheme
import com.example.myfirstcomposedemo.ui.viewmodels.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalMaterialApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navHostController: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                navHostController = rememberNavController()

                SetUpNavigation(
                    navHostController = navHostController,
                    sharedViewModel
                )

            }
        }
    }
}


