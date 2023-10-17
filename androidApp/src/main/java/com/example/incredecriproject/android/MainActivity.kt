package com.example.incredecriproject.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.incredecriproject.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    Final()


                }
            }
        }
    }
}
@Composable
fun Final(){
    var displayText =remember {
        mutableStateOf(0) }
    Column {

        DisplayText(display = displayText)
        Row {

            button1(displayText)
            Text("           ")
            button2(displayText)
        }

    }}
@Composable
fun DisplayText(display:MutableState<Int>)
{
    Text(text=display.value.toString())
}
@Composable
fun GreetingView(text: String) {
    Text(text = text)
}
@Composable
fun button1(display: MutableState<Int>)
{
    Button(onClick = {display.value += 1}) {
        //val d=display.value.toInt()+1
        Text("Increment")
        //display.value=d.toString()
      //DisplayText(display.value)
    }

}
@Composable
fun button2(display: MutableState<Int>)
{

    Button(onClick = {display.value-=1  }) {
        //if(display.value!=-0)
        Text("Decrement")
            }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        //GreetingView("Hello, Android!")
    }
}
