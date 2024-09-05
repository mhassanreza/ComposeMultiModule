package com.bigint.authentication.screens.auth

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.bigint.authentication.screens.SampleViewModel


@Composable
internal fun ForgotPasswordScreen(
  rootNavController: NavHostController,
  viewModel : SampleViewModel
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
            onValueChange = {  },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        // Reset password button
        Button(
            onClick = {
                rootNavController.navigateUp()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Reset Password")
        }
    }
}