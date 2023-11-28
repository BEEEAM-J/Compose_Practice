package com.beeeam.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.beeeam.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun TextCell(text: String, modifier: Modifier = Modifier) {
    val cellModifier = Modifier
        .padding(4.dp)
        .size(100.dp, 100.dp)
        .border(width = 4.dp, color = Color.Black)

    Text(
        text = text,
        cellModifier.then(modifier),
        fontSize = 70.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun MainScreen() {
//    Row {
//        TextCell(text = "1")
//        TextCell(text = "2")
//        TextCell(text = "3")
//    }
//    Column {
//        TextCell(text = "1")
//        TextCell(text = "2")
//        TextCell(text = "3")
//    }

//    Column {
//        Row {
//            TextCell(text = "1")
//            TextCell(text = "4")
//            TextCell(text = "7")
//        }
//        Row {
//            TextCell(text = "2")
//            TextCell(text = "5")
//            TextCell(text = "8")
//        }
//        Row {
//            TextCell(text = "3")
//            TextCell(text = "6")
//        }
//        Row {
//            TextCell(text = "9")
//            TextCell(text = "10")
//            TextCell(text = "11")
//        }
//    }

//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        modifier = Modifier.size(width = 400.dp, height = 200.dp)
//    ) {
//        TextCell(text = "1")
//        TextCell(text = "2")
//        TextCell(text = "3")
//    }

//    Column(
//        horizontalAlignment = Alignment.End,
//        modifier = Modifier.size(width = 200.dp, height = 400.dp)
//    ) {
//        TextCell(text = "1")
//        TextCell(text = "2")
//        TextCell(text = "3")
//    }

//    Row(
//        horizontalArrangement = Arrangement.End,
//        modifier = Modifier.size(width = 400.dp, height = 200.dp)
//    ) {
//        TextCell("1")
//        TextCell("2")
//        TextCell("3")
//    }

//    Column(
//        modifier = Modifier.height(400.dp),
//        verticalArrangement = Arrangement.Bottom
//    ) {
//        TextCell("1")
//        TextCell("2")
//        TextCell("3")
//    }

    Column(
        modifier = Modifier.size(width = 1000.dp, height = 1000.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(
            modifier = Modifier.width(1000.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            TextCell("1")
            TextCell("2")
            TextCell("3")
        }
        Row(
            modifier = Modifier.width(1000.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            TextCell("4")
            TextCell("5")
            TextCell("6")
        }
        Row(
            modifier = Modifier.width(1000.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            TextCell("7")
            TextCell("8")
            TextCell("9")
        }
    }
}

// @Composable
// fun TestLabelBtn() {
//    val modifier = Modifier
//        .size(width = 41.dp, height = 26.dp)
//        .padding(start = 6.dp, end = 6.dp, top = 6.dp, bottom = 6.dp)
//
//    Button(
//        onClick = { },
//    ) {
//        Text(
//            fontSize = 12.sp,
//            text = "label",
//
//        )
//    }
// }

@Preview
@Composable
fun Preview() {
    ComposePracticeTheme {
        MainScreen()
//        TestLabelBtn()
    }
}
