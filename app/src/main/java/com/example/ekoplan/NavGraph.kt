import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController  // Import pre správny typ

@Composable
fun NavGraph(navController: NavHostController) {  // Použitie správneho typu
    NavHost(navController = navController, startDestination = "buttonScreen") {
        composable("buttonScreen") { ButtonScreen(navController) }
        composable("expensesScreen") { ExpensesScreen(navController) }
        composable("addExpensesScreen") { AddExpensesScreen() }
    }
}
