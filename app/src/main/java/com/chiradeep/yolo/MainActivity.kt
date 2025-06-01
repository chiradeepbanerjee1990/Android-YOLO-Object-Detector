package com.chiradeep.yolo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.chiradeep.yolo.detection.ObjectDetector
import com.chiradeep.yolo.ui.theme.AndroidYOLOObjectDetectorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            ShowWelcomeMessage()
        }
        ObjectDetector().initializeModel(
            modelPath = "yolov5s.onnx",
            context = this
        )
    }
}

@Composable
fun ShowWelcomeMessage() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                horizontalAlignment = Alignment.Start
            ) {
                ShowSimpleImageView(modifier = Modifier.padding(all = 2.dp))

            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 0.dp, end = 0.dp, top = 20.dp, bottom = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ShowSimpleTextView(
                    name = "Chiradeep",
                    modifier = Modifier.padding(
                        start = 40.dp,
                        end = innerPadding.calculateEndPadding(LayoutDirection.Ltr),
                        top = innerPadding.calculateTopPadding(),
                        bottom = innerPadding.calculateBottomPadding()
                    )
                )

            }



        }
    )
}

// This is a Preview Function
@Composable
@Preview(showBackground = true, showSystemUi = true, name = "My Layout")
fun ShowPreview() {
    ShowWelcomeMessage()
}

// This is an actual implementation function

@Composable
fun ShowSimpleImageView(modifier: Modifier) {
    Image(
        contentDescription = "Sample Profile Image",
        painter = painterResource(id = R.drawable.profile_pic),
        modifier = modifier.padding(16.dp)
    )
}

@Composable
fun ShowSimpleTextView(name: String, modifier: Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        color = Color.Black
    )
}

