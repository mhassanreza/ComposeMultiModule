package com.bigint.reminder.navigation

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.bigint.authentication.navigation.AuthGraphRoutes
import com.bigint.authentication.navigation.AuthScreensRoute
import com.bigint.authentication.navigation.authNavGraph
import com.bigint.reminder.navigation.graphs.notificationNavGraph
import com.bigint.reminder.navigation.graphs.settingNavGraph
import com.bigint.reminder.navigation.routes.NavGraphRoutes
import com.bigint.reminder.ui.screens.mainBottomMenu.bottomMenu.BottomMenuMainScreen
import com.bigint.reminder.ui.screens.mainBottomMenu.home.CharacterDetailsScreen
import com.bigint.reminder.ui.theme.RickPrimary

@Composable
fun RootNavGraph(isAuth: Boolean) {
    val rootNavController = rememberNavController()
    NavHost(
        navController = rootNavController,
        startDestination = if (isAuth) NavGraphRoutes.BottomMenuMainScreenGraph else AuthGraphRoutes.AuthGraph
    ) {
        composable<NavGraphRoutes.BottomMenuMainScreenGraph> {
            BottomMenuMainScreen(rootNavController = rootNavController)
        }
        authNavGraph(rootNavController = rootNavController) {
            // why we need this? because we shouldn't pass multiple routes to the composable function to ignore complexity
            if (it == AuthScreensRoute.SignUp) {
                Log.d("", "SignUp RootNavGraph: OnSuccessLoginClicked")
            } else if (it == AuthScreensRoute.Login) {
                Log.d("", "Login RootNavGraph: OnSuccessLoginClicked")
            }
            rootNavController.navigate(NavGraphRoutes.BottomMenuMainScreenGraph) {
                popUpTo(AuthGraphRoutes.AuthGraph) { inclusive = true }
                launchSingleTop = true
            }
        }
        notificationNavGraph(rootNavController = rootNavController)
        settingNavGraph(rootNavController = rootNavController)


        composable(
            route = "character_details/{characterId}",
            arguments = listOf(navArgument("characterId") {
                type = NavType.IntType
            })
        ) { backStackEntry ->
            val characterId: Int =
                backStackEntry.arguments?.getInt("characterId") ?: -1
            CharacterDetailsScreen(
                characterId
            ) {
                val userName = "Hassan Raza Muhammad Hanif"
                rootNavController.navigate("character_episodes?userName=$userName&characterId=$it")
            }
        }
        composable(
            "character_episodes?userName={userName}&characterId={characterId}",
            arguments = listOf(navArgument("characterId") {
                type = NavType.IntType
            }, navArgument("userName") {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            val userName: String =
                backStackEntry.arguments?.getString("userName") ?: "No Name"
            val characterId: Int =
                backStackEntry.arguments?.getInt("characterId") ?: -1
//            CharacterEpisodeScreen(
//                ktorClient = ktorClient,
//                characterId = characterId,
//                name = userName
//            )
        }
    }
}