package com.example.joinkalido

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.joinkalido.ui.theme.JoinKalidoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JoinKalidoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                        Information()
                }
            }
        }
    }
}

@Composable
fun Information(modifier: Modifier=Modifier)
{
//    val query= remember { mutableStateOf("")}
    Column()
    {
        Row(modifier = Modifier
            .background(color = Color.DarkGray)
            .padding(10.dp))
        {
            Image(painter = painterResource(id = R.drawable.ic_baseline_arrow_back_ios_24), contentDescription =null)
            Text(text = stringResource(id = R.string.string1),color=Color.White, modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally), fontSize = 18.sp)
        }
        
        Practice1()
        Spacer(modifier = Modifier.height(55.dp))

        Text(text = stringResource(id = R.string.string6), fontSize = 18.sp, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(start = 18.dp, end = 18.dp),color=Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))
        Practice2()

        Spacer(modifier = Modifier.height(16.dp))
        Practice3()
    }
}

@Composable
fun Practice1()
{
    Text(text = stringResource(id = R.string.string2), fontSize = 18.sp, modifier = Modifier.padding(18.dp))
    Text(text = stringResource(id = R.string.string3), fontSize = 16.sp, modifier = Modifier.padding(start=18.dp,end=18.dp),color=Color.Gray)
    Spacer(modifier = Modifier.height(16.dp))
    TextField(value = stringResource(id = R.string.string4), onValueChange = { }, modifier = Modifier
        .fillMaxWidth()
        .padding(18.dp))
    Button(onClick = { /*TODO*/ },shape= RoundedCornerShape(50), modifier = Modifier.padding(start=18.dp,end=18.dp),colors=ButtonDefaults.buttonColors(
        colorResource(id = R.color.teal_200))) {
        Text(text = stringResource(id = R.string.string5),color= Color.White, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally), fontSize = 18.sp)
    }
}
@Composable
fun Practice2()
{
    Row()
    {
        Button(onClick = { /*TODO*/ },shape= RoundedCornerShape(50), modifier = Modifier
        .fillMaxWidth().height(50.dp)
        .padding(start = 18.dp, end = 18.dp), colors = ButtonDefaults.buttonColors(
        colorResource(id = R.color.teal_200))) {
                Image(painter = painterResource(R.drawable.google), contentDescription = null)
                Text(text = stringResource(id = R.string.string7), modifier = Modifier.padding(start=18.dp,end=18.dp),fontSize = 18.sp)
            }

    }
}

@Composable
fun Practice3()
{
    Row(){
        Button(onClick = { /*TODO*/ },shape= RoundedCornerShape(50), modifier = Modifier
            .fillMaxWidth().height(55.dp)
            .padding(start = 18.dp, end = 18.dp), colors = ButtonDefaults.buttonColors(
            colorResource(id = R.color.black))) {
            Image(painter = painterResource(id = R.drawable.apple1) , contentDescription = null)
                Text(text = stringResource(id = R.string.string8), color = Color.White, modifier = Modifier.padding(start = 18.dp, end = 18.dp), fontSize = 18.sp)
            }
        }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JoinKalidoTheme {
        Information()
    }
}