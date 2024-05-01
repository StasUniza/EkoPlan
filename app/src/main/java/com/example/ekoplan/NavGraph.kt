// NavGraph
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun NavGraph(navigationViewModel: NavigationViewModel) {
    navigationViewModel.navController?.let { navController ->
        NavHost(navController = navController, startDestination = "buttonScreen") {
            composable("buttonScreen") { ButtonScreen(navigationViewModel) }
            composable("expensesScreen") { ExpensesScreen(navigationViewModel) }
            composable("addExpensesScreen") { AddExpensesScreen(navigationViewModel) }
        }
    }
}

