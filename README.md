# ComposeMultiModule

<body>

<p>This repository showcases a multi-module Android application built with modern development tools and libraries. It demonstrates key concepts such as Jetpack Compose, Hilt Dependency Injection, Ktor, type-safe navigation arguments, and more. This project uses the <a href="https://rickandmortyapi.com/" target="_blank">Rick and Morty API</a> for learning purposes.</p>


<h2>Features</h2>
<ul>
    <li><strong>Jetpack Compose UI</strong>: Declarative UI development with Jetpack Compose.</li>
    <li><strong>Navigation Component</strong>: Supports nested graphs and bottom navigation with type-safe arguments.</li>
    <li><strong>Multi-Module Architecture</strong>: Clean separation of features and concerns across multiple modules.</li>
    <li><strong>Ktor</strong>: Lightweight networking with Ktor for making API requests.</li>
    <li><strong>Shared ViewModel</strong>: State sharing between screens using shared ViewModel instances.</li>
    <li><strong>Hilt Dependency Injection</strong>: Simplified DI setup with Hilt for managing dependencies.</li>
    <li><strong>Kotlinx Serialization</strong>: JSON serialization and deserialization using Kotlinx Serialization.</li>
    <li><strong>Coil</strong>: Image loading with Coil for seamless image handling.</li>
    <li><strong>Nested Graphs</strong>: authentication Flow (login, register) with bottom navigation flow after successful login.</li>
</ul>

<h2>Project Structure</h2>
<ul>
    <li><strong>app</strong>: Main application module, contains shared resources and app-level configurations.</li>
    <li><strong>network</strong>: Module dedicated to handling API calls using Ktor.</li>
    <li><strong>auth</strong>: Contains the authentication flow (Login, Register, Forgot Password) and navigation logic.</li>
    <li><strong>storage</strong>: Manages data storage with SharedPreferences and Room for persistent data.</li>
</ul>

<h2>Libraries Used</h2>
<ul>
    <li><a href="https://developer.android.com/jetpack/compose" target="_blank">Jetpack Compose</a> - Modern UI toolkit for building native UI.</li>
    <li><a href="https://ktor.io/" target="_blank">Ktor</a> - Framework for building connected applications.</li>
    <li><a href="https://developer.android.com/training/dependency-injection/hilt-android" target="_blank">Hilt</a> - Dependency Injection library for Android.</li>
    <li><a href="https://developer.android.com/guide/navigation" target="_blank">Navigation Component</a> - Handling in-app navigation with type-safe args.</li>
    <li><a href="https://github.com/Kotlin/kotlinx.serialization" target="_blank">Kotlinx Serialization</a> - Kotlin serialization for data handling.</li>
    <li><a href="https://coil-kt.github.io/coil/" target="_blank">Coil</a> - Image loading library for Android.</li>
</ul>

<h2>Installation</h2>
<ol>
    <li>Clone the repository:</li>
    <li>Open the project in Android Studio.</li>
    <li>Build and run the project on your Android emulator or device.</li>
</ol>

<h2>How to Use</h2>
<ol>
    <li><strong>Login</strong>: The app begins with a login screen. Once authenticated, the user is redirected to the main app with bottom navigation.</li>
    <li><strong>API Integration</strong>: The app communicates with a sample API using Ktor. The response is parsed using Kotlinx Serialization.</li>
    <li><strong>Bottom Navigation</strong>: Post-login, the app shows the bottom navigation with different tabs.</li>
    <li><strong>Image Loading</strong>: Images are loaded seamlessly using Coil.</li>
<li><strong>Authentication Module</strong>: To use the authentication module in your project, include the following code inside your root graph. Customize the design and logic according to your needs:</li>
</ol>

<pre><code>authNavGraph(rootNavController = rootNavController) {
    if (it == AuthScreensRoute.SignUp) {
        Log.d("", "SignUp OnSuccessLoginClicked")
    } else if (it == AuthScreensRoute.Login) {
        Log.d("", "Login OnSuccessSignupClicked")
    }
    rootNavController.navigate(NavGraphRoutes.BottomMenuMainScreenGraph) {
        popUpTo(AuthGraphRoutes.AuthGraph) { inclusive = true }
        launchSingleTop = true
    }
}
</code></pre>


</body>
