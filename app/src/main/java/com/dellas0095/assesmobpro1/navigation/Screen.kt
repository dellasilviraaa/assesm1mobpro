package com.dellas0095.assesmobpro1.navigation

sealed class Screen (val route: String) {
    data object Home: Screen("MainScreen")
    data object About: Screen("aboutScreen")
}