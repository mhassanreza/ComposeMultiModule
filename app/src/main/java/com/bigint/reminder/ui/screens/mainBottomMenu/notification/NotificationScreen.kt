package com.bigint.reminder.ui.screens.mainBottomMenu.notification

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
import com.bigint.reminder.navigation.routes.NotificationScreenRoute


@Composable
fun NotificationScreen(rootNavController: NavHostController, innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(Color.Yellow),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Notification Screen",
            fontSize = 40.sp,
            color = Color.Black
        )
        Button(
            onClick = {
                rootNavController.navigate(NotificationScreenRoute.NotificationDetail)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Notification Detail Screen")
        }
    }
}