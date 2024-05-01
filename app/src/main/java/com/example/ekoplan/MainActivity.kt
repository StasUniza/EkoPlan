// MainActivity.kt
package com.example.ekoplan
import NavGraph
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

import com.example.ekoplan.ui.theme.EkoPlanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EkoPlanTheme{
                AppContent()
            }

        }
    }
}

@Composable
fun AppContent() {
    val navController = rememberNavController()
    NavGraph(navController = navController)
}
