package com.example.ekoplan
// MainActivity.kt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.ekoplan.ui.theme.EkoPlanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EkoPlanTheme {
                val navController = rememberNavController()
                val navigationViewModel: NavigationViewModel = viewModel()
                navigationViewModel.navController = navController
                AppContent(navigationViewModel)
            }
        }
    }
}


@Composable
fun AppContent(navigationViewModel: NavigationViewModel) {
    NavGraph(navigationViewModel = navigationViewModel)
}
