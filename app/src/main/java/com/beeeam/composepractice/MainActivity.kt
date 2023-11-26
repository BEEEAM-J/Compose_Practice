package com.beeeam.composepractice

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.beeeam.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Composable1()
                }
            }
        }
    }
}

// @Composable
// fun DemoScreen() {
//    var textState by rememberSaveable { mutableStateOf("") }
//
//    val onTextChange = { text: String ->
//        textState = text
//    }
//
//    MyTextField(textState = textState, onTextChange = onTextChange)
// }
//
// @OptIn(ExperimentalMaterial3Api::class)
// @Composable
// fun MyTextField(textState: String, onTextChange: (String) -> Unit) {
//    TextField(
//        value = textState,
//        onValueChange = { onTextChange(it) }
//    )
// }

// @Preview
// @Composable
// fun Preview() {
//    ComposePracticeTheme {
//        DemoScreen()
//    }
// }

// @Composable
// fun FunctionA() {
//    var switchState by remember { mutableStateOf(true) }
//
//    val onSwitchChange = { value: Boolean ->
//        switchState = value
//    }
//
//    FunctionB(
//        switchState = switchState,
//        onSwitchChange = { onSwitchChange(it) }
//    )
// }
//
// @Composable
// fun FunctionB(switchState: Boolean, onSwitchChange: (Boolean) -> Unit) {
//    Switch(
//        checked = switchState,
//        onCheckedChange = onSwitchChange
//    )
// }
//
// @Preview
// @Composable
// fun PreView() {
//    ComposePracticeTheme {
//        Column {
//            FunctionA()
//        }
//    }
// }

val LocalColor = staticCompositionLocalOf { Color(0xFFffdbcf) }

@Composable
fun Composable1() {
    var color = if (isSystemInDarkTheme()) {
        Color(0xFFa08d87)
    } else {
        Color(0xFFffdbcf)
    }
    Column {
        Composable2()

        CompositionLocalProvider(LocalColor provides color) {
            Composable3()
        }
    }
}

@Composable
fun Composable2() {
    Composable4()
}

@Composable
fun Composable3() {
    Composable5()
}

@Composable
fun Composable4() {
    Composable6()
}

@Composable
fun Composable5() {
    Composable7()
    Composable8()
}

@Composable
fun Composable6() {
    Text("Composable6")
}

@Composable
fun Composable7() {
}

@Composable
fun Composable8() {
    Text("Composable8", modifier = Modifier.background(LocalColor.current))
}

@Preview
@Composable
fun DefaultPreview() {
    ComposePracticeTheme {
        Composable1()
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DarkPreview() {
    ComposePracticeTheme {
        Composable1()
    }
}
