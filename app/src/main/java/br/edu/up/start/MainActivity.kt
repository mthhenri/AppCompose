package br.edu.up.start

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Card("Título do cartão")
        }
    }

    @Composable
    private fun Card(titulo: String) {
        Column {
            Text(
                text = titulo,
                fontSize = 50.sp,
                color = Color(176, 11, 105)
            )
            Text(text = "oi")
        }
    }

    @Preview
    @Composable
    fun CardPreview(){
        Card("Título do cartão")
    }

}