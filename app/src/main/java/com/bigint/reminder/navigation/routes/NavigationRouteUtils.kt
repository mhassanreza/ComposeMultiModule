package com.bigint.reminder.navigation.routes

import kotlinx.serialization.Serializable

sealed class NavGraphRoutes() {
    @Serializable
    data object RootGraph : NavGraphRoutes()
    @Serializable
    data object BottomMenuMainScreenGraph : NavGraphRoutes()
    @Serializable
    data object NotificationGraph : NavGraphRoutes()
    @Serializable
    data object SettingGraph : NavGraphRoutes()
}

sealed class MainScreenRoutes() {
    @Serializable
    data object Home : MainScreenRoutes()
    @Serializable
    data object Profile : MainScreenRoutes()
    @Serializable
    data object Notification : MainScreenRoutes()
    @Serializable
    data object Setting : MainScreenRoutes()
}

sealed class SettingScreenRoute() {
    @Serializable
    data object SettingDetail : SettingScreenRoute()
}

sealed class NotificationScreenRoute() {
    @Serializable
    data object NotificationDetail : NotificationScreenRoute()
}
