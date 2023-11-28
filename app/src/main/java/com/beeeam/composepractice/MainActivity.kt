package com.beeeam.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
        .border(width = 5.dp, color = Color.Black)

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
//    Box {
//        val width = 200.dp
//        val height = 200.dp
//
//        TextCell("1", Modifier.size(width, height))
//        TextCell("2", Modifier.size(width, height))
//        TextCell("3", Modifier.size(width, height))
//    }

//    Box(
//        contentAlignment = Alignment.CenterEnd,
//        modifier = Modifier.size(400.dp, 400.dp)
//    ) {
//        TextCell("1", Modifier.size(width = 200.dp, height = 200.dp))
//    }

//    Box(
//        modifier = Modifier.size(width = 500.dp, height = 500.dp)
//    ) {
//        Text("Top Start", Modifier.align(Alignment.TopStart))
//        Text("Top Center", Modifier.align(Alignment.TopCenter))
//        Text("Top Bottom", Modifier.align(Alignment.TopEnd))
//        Text("Center Start", Modifier.align(Alignment.CenterStart))
//        Text("Center ", Modifier.align(Alignment.Center))
//        Text("Center End", Modifier.align(Alignment.CenterEnd))
//        Text("Bottom Start", Modifier.align(Alignment.BottomStart))
//        Text("Bottom Center", Modifier.align(Alignment.BottomCenter))
//        Text("Bottom End", Modifier.align(Alignment.BottomEnd))
//    }

//    Box(
//        modifier = Modifier
//            .size(200.dp)
//            .clip(CircleShape)
//            .background(Color.Blue)
//    )
//    Box(
//        modifier = Modifier
//            .size(200.dp)
//            .clip(RoundedCornerShape(30.dp))
//            .background(Color.Blue)
//    )

    Box(
        modifier = Modifier
            .size(200.dp)
            .clip(CutCornerShape(30.dp))
            .background(Color.Blue)
    )
}

@Preview
@Composable
fun Preview() {
    ComposePracticeTheme {
        MainScreen()
    }
}
