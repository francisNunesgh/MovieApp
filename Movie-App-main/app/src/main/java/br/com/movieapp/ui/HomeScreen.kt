package br.com.movieapp.ui

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import br.com.movieapp.ui.components.navigation.BottomNavigationBar
import br.com.movieapp.ui.components.navigation.NavigationGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navHostController: NavHostController) {
    
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navHostController)
        },
        content = {
            NavigationGraph(navHostController = navHostController)
        }
    ) 
}