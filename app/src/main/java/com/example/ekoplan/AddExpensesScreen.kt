// AddExpensesScreen.kt

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.material3.Icon
import androidx.navigation.compose.rememberNavController
import com.example.ekoplan.ui.theme.EkoPlanTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddExpensesScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        TopAppBar(title = { Text("AddExpenses") },
            navigationIcon = {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            }
            )
    }



    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("Pridať nové výdavky", style = MaterialTheme.typography.labelLarge)
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewAddExpensesScreen () {
    val navController = rememberNavController()
        EkoPlanTheme {
            AddExpensesScreen(navController)
        }
}