package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var firstOrSecond = 1
        var operation = ""
        var end = 0
        var colorOfEnd = ""

        setContent {
            CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    var number by rememberSaveable() { mutableStateOf("") }
                    var number1 by rememberSaveable() { mutableStateOf("") }
                    var number2 by rememberSaveable() { mutableStateOf("") }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Spacer(modifier = Modifier.height(64.dp))
                        if(colorOfEnd == "Cyan"){
                            Text(text = "$number", fontSize = 64.sp, color  = Color.Cyan)
                        }
                        else{
                            Text(text = "$number", fontSize = 64.sp)
                        }
                        Spacer(modifier = Modifier.height(64.dp))

                        Row() {
                            Button(onClick = {
                                if (firstOrSecond == 1) {
                                    number1 += "1"
                                    number = number1
                                } else {
                                    number2 += "1"
                                    number = number2
                                }
                                colorOfEnd = "Cyan"
                            }, modifier = Modifier.padding(8.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Cyan)) {
                                Text(text = "1", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                if (firstOrSecond == 1) {
                                    number1 += "2"
                                    number = number1
                                } else {
                                    number2 += "2"
                                    number = number2
                                }
                            }, modifier = Modifier.padding(8.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)) {
                                Text(text = "2", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                if (firstOrSecond == 1) {
                                    number1 += "3"
                                    number = number1
                                } else {
                                    number2 += "3"
                                    number = number2
                                }
                            }, modifier = Modifier.padding(8.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)) {
                                Text(text = "3", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                firstOrSecond = 2
                                operation = "/"

                            }, modifier = Modifier.padding(8.dp)) {
                                Text(text = "/", fontSize = 64.sp)
                            }
                        }
                        Row() {
                            Button(onClick = {
                                if (firstOrSecond == 1) {
                                    number1 += "4"
                                    number = number1
                                }
                                else {
                                    number2 += "4"
                                    number = number2
                                }

                            }, modifier = Modifier.padding(8.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow)) {
                                Text(text = "4", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                if (firstOrSecond == 1) {
                                    number1 += "5"
                                    number = number1
                                }
                                else {
                                    number2 += "5"
                                    number = number2
                                }
                            }, modifier = Modifier.padding(8.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)) {
                                Text(text = "5", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                if (firstOrSecond == 1) {
                                    number1 += "6"
                                    number = number1
                                }
                                else {
                                    number2 += "6"
                                    number = number2
                                }
                            }, modifier = Modifier.padding(8.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta)) {
                                Text(text = "6", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                firstOrSecond = 2
                                operation = "*"
                            }, modifier = Modifier.padding(8.dp),colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray)) {
                                Text(text = "*", fontSize = 64.sp)
                            }
                        }
                        Row() {
                            Button(onClick = {
                                if (firstOrSecond == 1) {
                                    number1 += "7"
                                    number = number1
                                }
                                else {
                                    number2 += "7"
                                    number = number2
                                }
                            }, modifier = Modifier.padding(8.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)) {
                                Text(text = "7", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                if (firstOrSecond == 1) {
                                    number1 += "8"
                                    number = number1
                                }
                                else {
                                    number2 += "8"
                                    number = number2
                                }
                            }, modifier = Modifier.padding(8.dp)) {
                                Text(text = "8", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                if (firstOrSecond == 1) {
                                    number1 += "9"
                                    number = number1
                                }
                                else {
                                    number2 += "9"
                                    number = number2
                                }
                            }, modifier = Modifier.padding(8.dp)) {
                                Text(text = "9", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                firstOrSecond = 2
                                operation = "-"

                            }, modifier = Modifier.padding(8.dp)) {
                                Text(text = "-", fontSize = 64.sp)
                            }
                        }
                        Row() {
                            Button(onClick = {
                                firstOrSecond = 1
                                number1 = ""
                                number2 = ""
                                number = ""
                            }, modifier = Modifier.padding(8.dp)) {
                                Text(text = "C", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                if (firstOrSecond == 1) {
                                    number1 += "0"
                                    number = number1
                                }
                                else {
                                    number2 += "0"
                                    number = number2
                                }
                            }, modifier = Modifier.padding(8.dp)) {
                                Text(text = "0", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                when(operation) {
                                    "/" -> {
                                        end = number1.toInt() / number2.toInt()
                                        number = end.toString()
                                    }
                                    "*" -> {
                                        end = number1.toInt() * number2.toInt()
                                        number = end.toString()
                                    }
                                    "-" -> {
                                        end = number1.toInt() - number2.toInt()
                                        number = end.toString()
                                    }
                                    "+" -> {
                                        end = number1.toInt() + number2.toInt()
                                        number = end.toString()
                                    }
                                }
                            }, modifier = Modifier.padding(8.dp)) {
                                Text(text = "=", fontSize = 64.sp)
                            }
                            Button(onClick = {
                                firstOrSecond = 2
                                operation = "+"

                            }, modifier = Modifier.padding(8.dp)) {
                                Text(text = "+", fontSize = 64.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalculatorTheme {
        Greeting("Android")
    }
}