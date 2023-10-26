package com.example.dominos

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dominos.ui.theme.DominosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DominosTheme {
                DominosApp()
            }
        }
    }
}
@Preview
@Composable
fun DominosApp() {
    DominosWithButtonAndImage(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}
@Composable
fun DominosWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable.domino_0
        2 -> R.drawable.domino_1
        3 -> R.drawable.domino_2
        4 -> R.drawable.domino_3
        5 -> R.drawable.domino_4
        6 -> R.drawable.domino_5
        7 -> R.drawable.domino_6
        8 -> R.drawable.domino_7
        9 -> R.drawable.domino_8
        10 -> R.drawable.domino_9
        11 -> R.drawable.domino_10
        12 -> R.drawable.domino_11
        13 -> R.drawable.domino_12
        14 -> R.drawable.domino_13
        15 -> R.drawable.domino_14
        16 -> R.drawable.domino_15
        17 -> R.drawable.domino_16
        18 -> R.drawable.domino_17
        19 -> R.drawable.domino_18
        20 -> R.drawable.domino_19
        21 -> R.drawable.domino_20
        22 -> R.drawable.domino_21
        23 -> R.drawable.domino_22
        24 -> R.drawable.domino_23
        25 -> R.drawable.domino_24
        26 -> R.drawable.domino_25
        27 -> R.drawable.domino_26
        else -> R.drawable.domino_27
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = result.toString()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { result = (0..27).random() }) {
            Text(stringResource(R.string.roll))
        }
    }
}