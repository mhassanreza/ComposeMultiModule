package com.bigint.reminder.navigation.bottomNav

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.bigint.reminder.navigation.routes.MainScreenRoutes
import com.bigint.reminder.ui.screens.mainBottomMenu.home.CharacterDetailsScreen
import com.bigint.reminder.ui.screens.mainBottomMenu.home.CharacterEpisodeScreen
import com.bigint.reminder.ui.screens.mainBottomMenu.home.HomeScreen
import com.bigint.reminder.ui.screens.mainBottomMenu.notification.NotificationScreen
import com.bigint.reminder.ui.screens.mainBottomMenu.profile.ProfileScreen
import com.bigint.reminder.ui.screens.mainBottomMenu.settings.SettingScreen
import com.bigint.reminder.ui.theme.RickPrimary

@Composable
fun BottomMenuScreenNavGraph(
    rootNavController: NavHostController,
    homeNavController: NavHostController,
    innerPadding: PaddingValues
) {

//    route = GraphRoutes.MainScreenGraph,
    NavHost(
        navController = homeNavController,
        startDestination = MainScreenRoutes.Home
    ) {
        composable<MainScreenRoutes.Home> {
            Surface(
                modifier = Modifier.padding(innerPadding), color = RickPrimary
            ) {
                HomeScreen(onCharacterSelected = { characterId ->
                    rootNavController.navigate("character_details/$characterId")
                })
            }
        }
        composable<MainScreenRoutes.Profile> {
            ProfileScreen(innerPadding = innerPadding)
        }
        composable<MainScreenRoutes.Notification> {
            NotificationScreen(rootNavController = rootNavController, innerPadding = innerPadding)
        }
        composable<MainScreenRoutes.Setting> {
            SettingScreen(rootNavController = rootNavController, innerPadding = innerPadding)
        }
    }

}