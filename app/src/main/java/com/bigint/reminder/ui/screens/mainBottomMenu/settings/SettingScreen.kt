package com.bigint.reminder.ui.screens.mainBottomMenu.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.bigint.reminder.navigation.routes.SettingScreenRoute


@Composable
fun SettingScreen(rootNavController: NavHostController, innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Setting Screen",
            fontSize = 40.sp,
            color = Color.Black
        )
        Button(
            onClick = {
                rootNavController.navigate(SettingScreenRoute.SettingDetail)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Setting Detail Screen")
        }
    }
}
