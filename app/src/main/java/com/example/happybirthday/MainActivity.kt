package com.example.happybirthday

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = "Happy Birthday Sam!",
                        from = "From Emma"
                    )
                }
            }
        }
    }

}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true )
@Preview(showBackground = true, showSystemUi = true, name = "Dipankar" )
@Composable
fun GreetingImagePreview() {
    HappyBirthdayTheme {
        GreetingImage(
            message = stringResource(R.string.happy_birthday_text),
            from = stringResource(R.string.signature_text),
//            modifier = Modifier.padding(8.dp).background(color = Color.Blue)
        )
    }
}
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 90.sp,
            lineHeight = 112.sp,
            color = Color.Red,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(color = Color.LightGray)
                .alpha(0.5F)
                .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
        )
        Text(
            text = from,
            fontSize = 30.sp,
            lineHeight = 35.sp,
            modifier = Modifier
                .background(color = Color.DarkGray)
                .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally)
                .alpha(0.5F)
        )
    }
}

@Preview(showBackground = true )
@Preview(showBackground = true, showSystemUi = true, name = "Dipankar" )
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            GreetingText(
                message = "Happy Birthday Sam!",
                from = "From Emma",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}