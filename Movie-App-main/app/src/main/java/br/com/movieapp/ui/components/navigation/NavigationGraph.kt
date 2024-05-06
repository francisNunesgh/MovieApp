package br.com.movieapp.ui.components.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = BottomNavItem.PopularMovies.route
    ) {
        composable(BottomNavItem.PopularMovies.route) {

        }
        composable(BottomNavItem.MovieSearch.route) {

        }
        composable(BottomNavItem.FavoritesMovies.route) {

        }

    }
}