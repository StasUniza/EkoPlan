package com.example.ekoplan
// ExpensesScreen.kt
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.ekoplan.ui.theme.EkoPlanTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExpensesScreen(navigationViewModel: NavigationViewModel) {
    Box(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text("Expenses") },
            navigationIcon = {
                IconButton(onClick = { navigationViewModel.navigateUp() }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            }
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 56.dp),
            contentAlignment = Alignment.Center
        ) {
            Text("Toto sú vaše výdavky", style = MaterialTheme.typography.labelLarge)
        }
    }



}


@Preview(showBackground = true)
@Composable
fun PreviewExpensesScreen() {
    val navController = NavigationViewModel()
    EkoPlanTheme {
        ExpensesScreen(navController)
    }
}
