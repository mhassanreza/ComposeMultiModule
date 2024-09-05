package com.bigint.reminder.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.bigint.reminder.navigation.routes.NavGraphRoutes
import com.bigint.reminder.navigation.routes.SettingScreenRoute
import com.meet.bottomnavigationbarjetpackcompose.screens.setting.SettingsDetailScreen

fun NavGraphBuilder.settingNavGraph(rootNavController: NavHostController) {
    navigation<NavGraphRoutes.SettingGraph>(
        startDestination = SettingScreenRoute.SettingDetail
    ) {
        composable<SettingScreenRoute.SettingDetail> {
            SettingsDetailScreen(rootNavController = rootNavController)
        }
    }
}