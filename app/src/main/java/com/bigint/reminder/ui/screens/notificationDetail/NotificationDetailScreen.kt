package com.bigint.reminder.ui.screens.notificationDetail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun NotificationDetailScreen(
    rootNavController: NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "NotificationDetailScreen", modifier = Modifier.fillMaxWidth())

        // Reset password button
        Button(
            onClick = {
                rootNavController.navigateUp()

            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Back to main screen")
        }
    }
}