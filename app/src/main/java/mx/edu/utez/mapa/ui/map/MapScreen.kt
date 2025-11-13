/*package mx.edu.utez.mapa.ui.map

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.android.gms.maps.model.LatLng
import kotlinx.coroutines.launch
import mx.edu.utez.mapa.viewmodel.MapViewModel
import ovh.plrapps.mapcompose.api.*
import ovh.plrapps.mapcompose.ui.MapUI

@Composable
fun MapScreen(
    viewModel: MapViewModel = viewModel()
) {
    // Colección de puntos
    val allPoints by viewModel.allTripPoints.collectAsState(initial = emptyList())

    // Agrupa por viaje
    val pointsByTrip = allPoints.groupBy { it.tripId }

    // Controlador del mapa
    val mapController = rememberMapController()
    val scope = rememberCoroutineScope()

    // Centrar la vista al primer punto que exista
    LaunchedEffect(allPoints) {
        allPoints.firstOrNull()?.let { first ->
            mapController.setView(first.latitude, first.longitude, 10.0)
        }
    }

    // Mostrar mapa
    MapUI(
        modifier = Modifier.fillMaxSize(),
        state = mapController
    )

    // Dibujar polilíneas por cada viaje
    LaunchedEffect(pointsByTrip) {
        scope.launch {
            // Limpia anteriores si recargas
            mapController.clearPolylines()
            pointsByTrip.values.forEach { tripPoints ->
                val geoPoints = tripPoints.map { point ->
                    LatLng(point.latitude, point.longitude)
                }
                mapController.addPolyline(geoPoints)
            }
        }
    }
}

*/