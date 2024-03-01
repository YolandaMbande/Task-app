package com.example.coloredcolumnsapp


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.style.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

@Composable
fun ComposableInfoScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(0.5f)
                        .background(Color(0xFFEADDFF)),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    ComposableCard("Text composable", "Displays text and follows the recommended Material Design guidelines.")
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(0.5f)
                        .background(Color(0xFFD0BCFF)),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    ComposableCard("Image composable", "Creates a composable that lays out and draws a given Painter class object.")
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(0.5f)
                        .background(Color(0xFFB69DF8)),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    ComposableCard("Row composable", "A layout composable that places its children in a horizontal sequence.")
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(0.5f)
                        .background(Color(0xFFF6EDFF)),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    ComposableCard("Column composable", "A layout composable that places its children in a vertical sequence.")
                }
            }
        }
    )
}

@Composable
fun ComposableCard(name: String, description: String) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 8.dp,
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = name,
                modifier = Modifier.padding(bottom = 16.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = description,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun ComposableInfoScreenPreview() {
    ComposableInfoScreen()
}
