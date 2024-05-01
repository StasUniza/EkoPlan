package com.example.ekoplan
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


class NavigationViewModel : ViewModel() {
    var navController: NavHostController? by mutableStateOf(null)


    fun navigateTo(destination: String) {
        navController?.navigate(destination)
    }

    fun navigateUp() {
        navController?.navigateUp()
    }
}
