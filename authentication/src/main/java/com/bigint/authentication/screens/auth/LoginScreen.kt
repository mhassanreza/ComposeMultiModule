package com.bigint.authentication.screens.auth

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.bigint.authentication.navigation.AuthScreensRoute
import com.bigint.authentication.screens.SampleViewModel


@Composable
fun LoginScreen(
    rootNavController: NavController,
    viewModel: SampleViewModel,
    onSuccessLoginOrSignup: (comingFrom: AuthScreensRoute) -> Unit
) {
    Log.d("", "Login authNavGraph: ${viewModel.valueOfSharedVM}")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Email field

        TextField(
            value = "",
            onValueChange = { },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        // Email field
        TextField(
            value = "",
            onValueChange = { },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth()
        )

        // Login button
        Button(
            onClick = {
                onSuccessLoginOrSignup(AuthScreensRoute.Login)
//                rootNavController.navigate(AuthGraphRoutes.MainScreenGraph) {
//                    popUpTo(AuthScreensRoute.Login) { inclusive = true }
//                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Login")
        }

        // Forgot password button
        TextButton(
            onClick = {
                rootNavController.navigate(AuthScreensRoute.Forgot)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Forgot password?")
        }

        // Signup button
        TextButton(
            onClick = {
                rootNavController.navigate(AuthScreensRoute.SignUp)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Sign up")
        }
    }
}