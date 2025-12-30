package org.example.project

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Arrays for random text generation
val terminosInformatica = arrayOf(
    "Actualizar", "Reparar", "Modificar", "Solucionar", "Instalar", "Configurar",
    "Depurar", "Compilar", "Optimizar", "Implementar", "Desplegar", "Sincronizar",
    "Cifrar", "Monitorizar", "Respaldar", "Restaurar", "Documentar", "Integrar",
    "Probar", "Automatizar", "Diagnosticar", "Programar", "Ejecutar", "Analizar",
    "Simular", "Virtualizar", "Encriptar", "Parchear", "Escanear", "Auditar"
)
val objetosTecnologicos = arrayOf(
    "El servidor", "Los puertos", "La base de datos", "El sistema operativo", "La red",
    "El router", "El firewall", "La aplicación", "El software", "El hardware",
    "El disco duro", "La memoria RAM", "El procesador", "El sistema", "El servicio",
    "La API", "La nube", "La cuenta de usuario", "El panel de control", "El repositorio",
    "El código fuente", "El proyecto", "La web", "El backend", "El frontend",
    "El dispositivo", "La impresora", "El portátil", "El servidor web", "La máquina virtual"
)

// Function to generate random button text
fun generateRandomButtonText(): String {
    val termino = terminosInformatica.random()
    val objeto = objetosTecnologicos.random()
    return "$termino $objeto"
}

@Composable
fun RandomlyAlignedScreen(title: String, buttons: @Composable () -> Unit) {
    val horizontalAlignments = listOf(Alignment.Start, Alignment.CenterHorizontally, Alignment.End)

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = title,
            modifier = Modifier.align(horizontalAlignments.random()),
            style = MaterialTheme.typography.headlineMedium
        )
        Column(modifier = Modifier.align(horizontalAlignments.random())) {
            buttons()
        }
    }
}
