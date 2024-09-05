package com.bigint.reminder.navigation.bottomNav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.bigint.reminder.navigation.routes.MainScreenRoutes

data class NavigationItem(
    val title : String,
    val route : MainScreenRoutes,
    val selectedIcon : ImageVector,
    val unSelectedIcon : ImageVector,
    val hasBadgeDot: Boolean = false,
    val badgeCount : Int? = null
)

val bottomNavigationItemsList = listOf(
    NavigationItem(
        title = "Home",
        route = MainScreenRoutes.Home,
        selectedIcon = Icons.Filled.Home,
        unSelectedIcon = Icons.Outlined.Home,
    ),
    NavigationItem(
        title = "Profile",
        route = MainScreenRoutes.Profile,
        selectedIcon = Icons.Filled.Person,
        unSelectedIcon = Icons.Outlined.Person,
    ),
    NavigationItem(
        title = "Notification",
        route = MainScreenRoutes.Notification,
        selectedIcon = Icons.Filled.Notifications,
        unSelectedIcon = Icons.Outlined.Notifications,
        badgeCount = 9
    ),
    NavigationItem(
        title = "Setting",
        route = MainScreenRoutes.Setting,
        selectedIcon = Icons.Filled.Settings,
        unSelectedIcon = Icons.Outlined.Settings,
        hasBadgeDot = true
    ),
)