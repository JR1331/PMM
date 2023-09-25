/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.TarjetaPresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.R
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

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
                        stringResource(R.string.fullname_text),
                        stringResource(R.string.title_text),
                        stringResource(R.string.number),
                        stringResource(R.string.contact),
                        stringResource(R.string.mail)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(name: String, title: String, number: String, contact: String, mail: String, modifier: Modifier = Modifier) {
    // Create a column so that texts don't overlap
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Column {
            Image(painter = painterResource(id = R.drawable.img1),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.5F,
                modifier = Modifier
                    .size(200.dp)

            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = name,
                fontSize = 30.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 16.dp)
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = title,
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .padding(end = 16.dp)


            )
        }

    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Row(

            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()

        ) {
            Image(
                painter = painterResource(id = R.drawable.tfno),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.5F,
                modifier = Modifier
                    .size(25.dp)


            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = number,
                fontSize = 15.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier


            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.link),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.5F,
                modifier = Modifier
                    .size(25.dp)

            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = contact,
                fontSize = 15.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier


            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.mail),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.5F,
                modifier = Modifier
                    .size(25.dp)

            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = mail,
                fontSize = 15.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier


            )
        }
    }
}

@Composable
fun GreetingImage(name: String, title: String, number: String, contact: String, mail: String, modifier: Modifier = Modifier) {
    // Create a box to overlap image and texts
    Box(modifier) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            name = name,
            title = title,
            number = number,
            contact = contact,
            mail = mail,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = false)
@Composable
private fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingImage(
            stringResource(R.string.fullname_text),
            stringResource(R.string.title_text),
            stringResource(R.string.number),
            stringResource(R.string.contact),
            stringResource(R.string.mail)
        )
    }
}
