package com.beeeam.composepractice.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.beeeam.composepractice.NavRoutes

@Composable
fun Welcome(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(
                text = "Welcome",
            )
            Button(onClick = {
                navController.navigate(NavRoutes.Profile.route)
            }) {
                Text(text = "Profile")
            }
        }
    }
}

@Preview
@Composable
fun WelcomePreview() {
//    Welcome()
}
