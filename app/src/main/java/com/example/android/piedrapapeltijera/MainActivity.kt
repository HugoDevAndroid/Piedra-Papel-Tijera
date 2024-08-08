package com.example.android.piedrapapeltijera

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.android.piedrapapeltijera.ui.MainScreen
import com.example.android.piedrapapeltijera.ui.theme.PiedraPapelTijeraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PiedraPapelTijeraTheme {
                MainScreen()
            }
        }
    }
}
