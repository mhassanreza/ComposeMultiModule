package com.bigint.reminder.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.bigint.reminder.navigation.routes.NavGraphRoutes
import com.bigint.reminder.navigation.routes.NotificationScreenRoute
import com.bigint.reminder.ui.screens.notificationDetail.NotificationDetailScreen

fun NavGraphBuilder.notificationNavGraph(rootNavController: NavHostController) {
    navigation<NavGraphRoutes.NotificationGraph>(
        startDestination = NotificationScreenRoute.NotificationDetail
    ) {
        composable<NotificationScreenRoute.NotificationDetail> {
            NotificationDetailScreen(rootNavController = rootNavController)
        }
    }
}