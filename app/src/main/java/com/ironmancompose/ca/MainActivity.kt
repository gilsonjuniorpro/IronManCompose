package com.ironmancompose.ca

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                NewsStory()
            }
        }
    }
}

@Composable
fun NewsStory() {
    val image = +imageResource(R.drawable.ironman)

    MaterialTheme {
        Column(
                crossAxisSize = LayoutSize.Expand,
                modifier = Spacing(16.dp)
        ) {
            Greeting("Iron Man")

            HeightSpacer(16.dp)

            Container(expanded = true, height = 180.dp) {
                Clip(shape = RoundedCornerShape(8.dp)) {
                    DrawImage(image)
                }
            }

            HeightSpacer(16.dp)

            Text("Genius. Billionaire. Playboy. Philanthropist.",
                    style = (+themeTextStyle { body2 }).withOpacity(0.67f))
            Text("Tony Stark's confidence is only matched by his high-flying " +
                    "abilities as the hero called Iron Man.",
                    style = (+themeTextStyle { h6 }).withOpacity(0.47f))
            Text("Inventor Tony Stark applies his genius for high-tech solutions " +
                    "to problems as Iron Man, the armored Avenger.",
                    style = (+themeTextStyle { body2 }).withOpacity(0.27f))

            HeightSpacer(16.dp)

            Text("Having created a wondrous suit of armor to keep himself alive, " +
                    "Tony has revised it dozens of times, each version with increased " +
                    "capabilities, faster operation, reduced energy usage, and adaptability " +
                    "to the greatest threats the universe has to offer.",
                    maxLines = 2, overflow = TextOverflow.Ellipsis,
                    style = (+themeTextStyle { h6 }).withOpacity(0.67f))
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row{
        Text("$name",
                overflow = TextOverflow.Ellipsis,
                style = (+themeTextStyle { h6 }).withOpacity(0.67f))
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        NewsStory()
    }
}
