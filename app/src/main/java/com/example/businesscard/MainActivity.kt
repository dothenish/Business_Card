package com.example.businesscard

import android.graphics.drawable.Drawable
import android.icu.text.IDNA.Info
import android.media.tv.TvContract.Channels.Logo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import java.util.Objects

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painterResource(id = R.drawable.android_logo),
            contentDescription = "Android Logo",
            modifier = Modifier.size(88.dp)
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Nisha Farhani Khirul Fozi",
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontWeight = FontWeight.Light,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(24.dp))
        ContactInfo(icon = Icons.Default.Call, info = "+60 179 413 110")
        ContactInfo(icon = Icons.Default.Share, info = "@dothenish")
        ContactInfo(icon = Icons.Default.Email, info = "farhanifozi@gmail.com")
    }
}

@Composable
fun ContactInfo(
    icon: ImageVector,
    info: String,
    modifier: Modifier = Modifier
) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(8.dp),
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = modifier.size(24.dp),
            tint = Color.Green
        )
        Spacer(modifier = modifier.width(8.dp))
        Text(
            text = info,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}
