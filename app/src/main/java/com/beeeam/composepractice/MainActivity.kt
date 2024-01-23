package com.beeeam.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.beeeam.composepractice.ui.theme.ComposePracticeTheme
import kotlinx.coroutines.launch

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
                    MainScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreen() {
//    val scrollState = rememberScrollState()
//    val coroutineScope = rememberCoroutineScope()
//    Box(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Column(
//            modifier = Modifier
//                .verticalScroll(scrollState),
//        ) {
//            repeat(100) { index ->
//                Text(
//                    modifier = Modifier.fillMaxWidth(),
//                    text = index.toString()
//                )
//            }
//        }
//        Button(
//            onClick = {
//                coroutineScope.launch {
//                    scrollState.animateScrollTo(scrollState.maxValue)
//                }
//            },
//            modifier = Modifier.align(Alignment.BottomCenter)
//        ) {}
//    }

//    val coroutineScope = rememberCoroutineScope()
//    val listState = rememberLazyListState()
//    val itemList = mutableListOf<Int>()
//    repeat(100) {
//        itemList.add(it)
//    }
//    Box(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        LazyColumn(
//            state = listState,
//        ) {
//            items(items = itemList) { content ->
//                Text(
//                    modifier = Modifier.fillMaxWidth(),
//                    text = content.toString(),
//                )
//            }
//        }
//        Button(
//            onClick = {
//                coroutineScope.launch {
//                    listState.animateScrollToItem(0)
//                }
//            },
//            modifier = Modifier
//                .align(Alignment.BottomCenter)
//                .padding(bottom = 20.dp),
//        ) {
//            Text("Scroll To Top")
//        }
//    }

    val phones = listOf(
        "Apple iPhone 12", "Google Pixel 4", "Samsung Galaxy 6s", "OnePlus 7",
        "Apple iPhone 7", "Google Pixel 6", "Samsung Galaxy Z Flip", "OnePlus 9 Pro", "Apple iPhone 13",
        "Google Pixel 4a", "Apple iPhone 8", "Samsung Galaxy S23", "Samsung Galaxy S24", "Apple iPhone 14",
        "Apple iPhone 15 Pro", "Google Pixel 4a", "Samsung Galaxy Z Flip 4", "Samsung Galaxy Z Flip 5"
    )
    val groupedPhone = phones.groupBy { it.substringBefore(' ') }
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        LazyColumn {
            groupedPhone.forEach { (manufacturer, phone) ->
                stickyHeader {
                    Box(
                        modifier = Modifier
                            .background(Color.Black)
                            .fillMaxWidth(),
                    ) {
                        Text(
                            modifier = Modifier.padding(15.dp),
                            text = manufacturer,
                            fontSize = 26.sp,
                            color = Color.White,
                        )
                    }
                }
                items(items = phone) {
                    Text(
                        text = it,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    ComposePracticeTheme {
        MainScreen()
    }
}
