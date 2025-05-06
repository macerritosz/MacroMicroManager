package com.wpi.cs4518.macroMicromanager

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MacroScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0x9b9b9b9b ))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Gray
            ),
            elevation = CardDefaults.cardElevation(8.dp),
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight()
        ) {
            Column(
                Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text("Macro Micromanager", fontSize = 32.sp, fontWeight = FontWeight.Bold)

                Spacer(Modifier.height(20.dp))
                Text("( 4/30/25 )", fontSize = 20.sp, color = Color.LightGray)

                Spacer(Modifier.height(8.dp))

                Text("Fats: 78% | Carbs: 120% | Protein: 58%", fontSize = 20.sp)

                Spacer(Modifier.height(12.dp))

                repeat(4) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(96.dp)
                            .background(Color.White, RoundedCornerShape(8.dp))
                            .padding(8.dp)
                            .border(1.dp, Color.LightGray, RoundedCornerShape(8.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Emojis") // Replace with emoji row as needed
                    }
                    Spacer(Modifier.height(32.dp))
                }

                Button(
                    onClick = {/* Open Popup*/},
                    modifier = Modifier.padding(top = 12.dp)
                ) {
                    Text("Edit Details")
                }
            }
        }
    }
}
