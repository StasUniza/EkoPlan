// ButtonScreen.kt
import androidx.compose.foundation.layout.*
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.ekoplan.ui.theme.EkoPlanTheme



// ButtonScreen.kt
@Composable
fun ButtonScreen(navigationViewModel: NavigationViewModel) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { navigationViewModel.navigateTo("expensesScreen") }) {
            Text("Prejsť na výdavky", style = MaterialTheme.typography.labelLarge)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navigationViewModel.navigateTo("addExpensesScreen") }) {
            Text("Pridaj výdavky", style = MaterialTheme.typography.labelLarge)
        }
    }
}


// Například pro PreviewButtonScreen:
@Preview(showBackground = true, name = "Button Screen Preview")
@Composable
fun PreviewButtonScreen() {
    val mockNavViewModel = NavigationViewModel() // Toto by mělo být idealně mock
    EkoPlanTheme {
        ButtonScreen(mockNavViewModel)
    }
}
