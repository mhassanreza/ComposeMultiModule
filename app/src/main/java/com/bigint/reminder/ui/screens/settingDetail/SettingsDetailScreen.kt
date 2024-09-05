package com.meet.bottomnavigationbarjetpackcompose.screens.setting

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.bigint.authentication.navigation.AuthGraphRoutes
import com.bigint.reminder.navigation.routes.NavGraphRoutes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsDetailScreen(
    rootNavController: NavHostController
) {
    Scaffold(
        topBar = {
            CustomSubSettingsTopAppBar(rootNavController = rootNavController)
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = "SettingsDetailScreen", modifier = Modifier.fillMaxWidth())

            // Reset password button
            Button(
                onClick = {
                    rootNavController.navigate(AuthGraphRoutes.AuthGraph) {
                        popUpTo(NavGraphRoutes.BottomMenuMainScreenGraph) { inclusive = true }
                        launchSingleTop = true
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Go to Login")
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomSubSettingsTopAppBar(rootNavController: NavHostController) {
    TopAppBar(
        title = { Text("Sub Settings") },
        navigationIcon = {
            IconButton(onClick = { rootNavController.popBackStack() }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
            }
        },
        actions = {
            IconButton(onClick = { /* Handle save or other actions here */ }) {
                Icon(imageVector = Icons.Default.Check, contentDescription = "Save")
            }
        }
    )
}