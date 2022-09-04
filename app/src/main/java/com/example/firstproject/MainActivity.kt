package com.example.firstproject

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstproject.ui.theme.FirstProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")
                    //  GreedingWithText("happy birthday !!!", "Vu Thanh Thao")
                    DefaultPreview()
                    //BirthdayGreedingWithImage(getString(R.string.happy_birthday_text), "THẢO IU CỦA QUANG")
                }
            }
        }
    }
}
@Composable
fun BirthdayGreedingWithImage(message: String, From: String) {
    val image = painterResource(id = R.drawable.androidparty)
    Box {
        Image(painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop

        )
        GreedingWithText(message, From)
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}



@Composable
fun GreedingWithText(message: String, from: String) {
    Column {
        Text(
            text = message,
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.End)
                .padding(start = 30.dp, end = 200.dp)
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.End)
                .padding(start = 0.dp, end = 0.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstProjectTheme {
        //Greeting("Android")
        BirthdayGreedingWithImage(stringResource(R.string.happy_birthday_text), stringResource(R.string.vo_iu_cua_anh_text))
        //GreedingWithText("happy birthday", "VỢ IU CỦA AN ")
    }
}