package mx.edu.utez.mapa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ejemplo.miappgps.ui.AppNavigation
import com.ejemplo.miappgps.ui.theme.TuTemaDeAppTheme // Asegúrate de usar tu tema
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TuTemaDeAppTheme {
                AppNavigation()
            }
        }
    }
}