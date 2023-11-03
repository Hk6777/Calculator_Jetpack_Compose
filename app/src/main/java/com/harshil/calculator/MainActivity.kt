package com.harshil.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.harshil.calculator.ui.theme.CalculatorTheme
import com.harshil.calculator.ui.theme.LightGray
import com.harshil.calculator.ui.theme.Orange


@ExperimentalComposeUiApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                val viewModel by viewModels<CalcViewModel>()
//                val state = viewModel.state
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {


                    Greeting(viewModel)
                }
            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Greeting(viewModel: CalcViewModel) {


    val buttonSpacing = 8.dp

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(16.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {

                CalcButton(
                    symbols = "AC",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f)
                ) {

//                    viewModel.onAction(CalculatorAction.Clear)
                }
                CalcButton(
                    symbols = "Del",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                CalcButton(
                    symbols = "/",
                    color = Orange,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
//                    viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {

                CalcButton(
                    symbols = "7",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
//                    viewModels.onAction(CalculatorState.Clear)
                }
                CalcButton(
                    symbols = "8",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                CalcButton(
                    symbols = "9",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                CalcButton(
                    symbols = "x",
                    color = Orange,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
//                    viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {

                CalcButton(
                    symbols = "4",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
//                    viewModels.onAction(CalculatorState.Clear)
                }
                CalcButton(
                    symbols = "5",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                CalcButton(
                    symbols = "6",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                CalcButton(
                    symbols = "-",
                    color = Orange,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
//                    viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {

                CalcButton(
                    symbols = "1",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
//                    viewModels.onAction(CalculatorState.Clear)
                }
                CalcButton(
                    symbols = "2",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                CalcButton(
                    symbols = "3",
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {

                }
                CalcButton(
                    symbols = "+",
                    color = Orange,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                ) {
//                    viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculatorTheme {

//        Greeting()
    }
}