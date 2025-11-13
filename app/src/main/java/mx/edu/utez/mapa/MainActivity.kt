package mx.edu.utez.mapa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import mx.edu.utez.mapa.data.ui.AppNavigation
import mx.edu.utez.mapa.ui.theme.MapaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MapaTheme {
                AppNavigation()
            }
        }
    }
}