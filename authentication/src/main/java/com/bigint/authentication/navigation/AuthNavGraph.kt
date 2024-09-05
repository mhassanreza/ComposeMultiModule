package com.bigint.authentication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bigint.authentication.screens.SampleViewModel
import com.bigint.authentication.screens.auth.ForgotPasswordScreen
import com.bigint.authentication.screens.auth.LoginScreen
import com.bigint.authentication.screens.auth.SignupScreen
import kotlinx.serialization.Serializable

sealed class AuthGraphRoutes() {
    @Serializable
    data object AuthGraph : AuthGraphRoutes()
}

sealed class AuthScreensRoute() {
    @Serializable
    data object Login : AuthScreensRoute()

    @Serializable
    data object SignUp : AuthScreensRoute()

    @Serializable
    data object Forgot : AuthScreensRoute()
}

fun NavGraphBuilder.authNavGraph(
    rootNavController: NavHostController,
    onSuccessLoginOrSignup: (comingFrom: AuthScreensRoute) -> Unit
) {
    navigation<AuthGraphRoutes.AuthGraph>(
        startDestination = AuthScreensRoute.Login
    ) {
        composable<AuthScreensRoute.Login> {
            val viewModel =
                it.sharedViewModel<SampleViewModel>(rootNavController = rootNavController)
            viewModel.valueOfSharedVM = 11111;

            LoginScreen(
                rootNavController = rootNavController,
                viewModel = viewModel,
                onSuccessLoginOrSignup = onSuccessLoginOrSignup
            )
        }
        composable<AuthScreensRoute.SignUp> {
            val viewModel =
                it.sharedViewModel<SampleViewModel>(rootNavController = rootNavController)
            SignupScreen(
                rootNavController = rootNavController,
                viewModel = viewModel,
                onSuccessLoginOrSignup = onSuccessLoginOrSignup
            )
        }
        composable<AuthScreensRoute.Forgot> {
            val viewModel =
                it.sharedViewModel<SampleViewModel>(rootNavController = rootNavController)
            ForgotPasswordScreen(rootNavController = rootNavController, viewModel = viewModel)
        }
    }
}

@Composable
inline fun <reified T : ViewModel> NavBackStackEntry.sharedViewModel(rootNavController: NavHostController): T {
    val navGraphRoute = destination.parent?.route ?: return viewModel()
    val parentEntry = remember(this) {
        rootNavController.getBackStackEntry(navGraphRoute)
    }
    return viewModel(parentEntry)
}