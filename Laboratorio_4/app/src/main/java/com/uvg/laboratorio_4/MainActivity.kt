package com.uvg.laboratorio_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.laboratorio_4.ui.theme.Laboratorio_4Theme



class Campus : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio_4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CampusInfo()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CampusInfoPreview() {
    Laboratorio_4Theme {
        CampusInfo()
    }
}

@Composable
fun CampusInfo() {
    Surface {
        Column {
            Campus_Central()
            Featured()
            ServiciosyRecursos()
        }
    }
}

@Composable
fun Campus_Central(){
    val campus = painterResource(id = R.drawable.uvg)
    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Row ()
        {
            Text(text = "Campus Central",
                style = TextStyle(color = Color.Black, fontSize = 30.sp, fontWeight = FontWeight.Bold), modifier = Modifier.padding(20.dp))
        }
        Image(painter = campus,
            contentDescription = "Front Page Image", contentScale = ContentScale.Crop, modifier = Modifier.height(200.dp))
    }
}

@Composable
fun Featured(){
    Text(text = "Destacados",
        style = TextStyle(color = Color.Gray, fontSize = 25.sp, fontWeight = FontWeight.Bold), modifier = Modifier.padding(20.dp))

    Row (modifier = Modifier.fillMaxWidth().size(180.dp), horizontalArrangement = Arrangement.SpaceBetween)
    {
        Service(modifier = Modifier.weight(1f))
        News(modifier = Modifier.weight(1f))
    }
}

@Composable
fun Service(modifier: Modifier = Modifier){
    val sn = painterResource(id = R.drawable.uvg5)

    Column (modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = sn, contentDescription = "SNI", modifier = Modifier.size(110.dp))

        Box(modifier = Modifier.width(180.dp)
            .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
            .background(color = Color(21, 115, 32)))
        {
            Text(text = "Service Now",
                style = TextStyle(color = Color.White, fontSize = 15.sp),
                modifier = Modifier.padding(15.dp))
        }
    }
}

@Composable
fun News(modifier: Modifier = Modifier){
    val news = painterResource(id = R.drawable.uvg1)

    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = news,
            contentDescription = "News Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.width(180.dp).height(100.dp).clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)))

        Box(modifier = Modifier.width(180.dp).clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp)).background(color = Color.DarkGray))
        {
            Text(text = "Actualidad UVG",
                style = TextStyle(color = Color.White, fontSize = 15.sp),
                modifier = Modifier.padding(15.dp))
        }    }
}


@Composable
fun ServiciosyRecursos() {
    Text(text = "Servicios y Recursos",
        style = TextStyle(color = Color.Gray, fontSize = 25.sp, fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(20.dp))

    Row (modifier = Modifier.fillMaxWidth().size(180.dp),
        horizontalArrangement = Arrangement.SpaceBetween)
    {
        DirectorioServicios(modifier = Modifier.weight(1f))
        Biblios(modifier = Modifier.weight(1f))
    }
}

@Composable
fun DirectorioServicios(modifier: Modifier = Modifier) {
    val services = painterResource(id = R.drawable.uvg3)

    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = services, contentDescription = "Student Services Image", contentScale = ContentScale.Crop, modifier = Modifier.width(180.dp).height(100.dp).clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)))

        Box(modifier = Modifier.width(170.dp).clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp)).background(color = Color(21, 115, 32)).padding(10.dp))
        {
            Text(text = "Directorio de Servicios Estudiantiles", style = TextStyle(color = Color.White, fontSize = 15.sp))
        }
    }
}

@Composable
fun Biblios(modifier: Modifier = Modifier) {
    val bib = painterResource(id = R.drawable.uvg4)

    Column (modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = bib, contentDescription = "Library Image",
            modifier = Modifier.height(100.dp))

        Box(modifier = Modifier.width(180.dp).clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp)).background(color = Color.DarkGray).padding(10.dp))
        {
            Text(text = "Portal Web Bibliotecas UVG",
                style = TextStyle(color = Color.White, fontSize = 15.sp))
        }
    }
}