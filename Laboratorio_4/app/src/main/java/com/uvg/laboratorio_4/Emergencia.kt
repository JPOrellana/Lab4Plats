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
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.laboratorio_4.ui.theme.Laboratorio_4Theme
import com.uvg.laboratorio_4.ui.theme.Laboratorio_4Theme

class Emergency : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio_4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EmergencyContacts()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun EmergencyPreview() {
    Laboratorio_4Theme {
        EmergencyContacts()
    }
}

@Composable
fun EmergencyContacts()
{
    Surface {
        val alert = painterResource(id = R.drawable.emergencia)

        val clinic = painterResource(id = R.drawable.uvg)


        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth())
        {
            Row(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth())
            {

                Text(text = "Contactos de Emergencia",
                    style = TextStyle(color = Color.Black, fontSize = 26.sp, FontWeight.Bold),
                    modifier = Modifier.padding(20.dp))

                Text(text = "  ")
            }

            Divider(color = Color.Gray, thickness = 1.dp)

            Row {
                Image(painter = alert,
                    contentDescription = "emergency logo",
                    modifier = Modifier.size(40.dp).absoluteOffset(0.dp, 15.dp))

                Column {
                    Text(text = "Emergencias",
                        style = TextStyle(color = Color.Black, fontSize = 20.sp, FontWeight.Bold),
                        modifier = Modifier.padding(horizontal = 20.dp).padding(top = 10.dp))

                    Text(text = "Si se presenta un incidente o un percance " +
                            "por favor marca el número de emergencia y rápidamente te apoyaremos",
                        style = TextStyle(color = Color.Black, fontSize = 15.sp),
                        modifier = Modifier.padding(horizontal = 20.dp).padding(bottom = 10.dp))
                }
            }

            Box (modifier = Modifier
                .width(325.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color(21, 115, 32)))
            {
                Text(text = "Llamar a 5978-1736",
                    style = TextStyle(color = Color.White, fontSize = 16.sp, FontWeight.Bold),
                    modifier = Modifier.padding(horizontal = 50.dp).padding(vertical = 10.dp))
            }

            Divider(color = Color.White, thickness = 10.dp)

            Divider(color = Color.Gray, thickness = 1.dp)

            Row {
                Image(painter = clinic,
                    contentDescription = "Clinics logo",
                    modifier = Modifier.size(40.dp).absoluteOffset(0.dp, 15.dp))

                Column {
                    Text(text = "Clínica UVG",
                        style = TextStyle(color = Color.Black, fontSize = 20.sp, FontWeight.Bold),
                        modifier = Modifier.padding(horizontal = 20.dp).padding(top = 10.dp))

                    Text(text = "La Clínica UVG, presta los siguientes servicios:",
                        style = TextStyle(color = Color.Black, fontSize = 15.sp),
                        modifier = Modifier.padding(horizontal = 20.dp).padding(bottom = 10.dp))

                    Text(text = "° Atención a Emergencias",
                        style = TextStyle(color = Color.Black, fontSize = 15.sp),
                        modifier = Modifier
                            .padding(horizontal = 30.dp)
                            .padding(bottom = 10.dp))

                    Text(text = "° Atención Primaria a Enfermedades Comunes",
                        style = TextStyle(color = Color.Black, fontSize = 15.sp),
                        modifier = Modifier.padding(horizontal = 30.dp).padding(bottom = 10.dp))

                    Text(text = "° Plan Educacional sobre Enfermedades",
                        style = TextStyle(color = Color.Black, fontSize = 15.sp),
                        modifier = Modifier.padding(horizontal = 30.dp).padding(bottom = 10.dp))

                    Text(text = "Horario de Atención: 7:00a.m. a 8:30a.m.",
                        style = TextStyle(color = Color.Black, fontSize = 15.sp),
                        modifier = Modifier.padding(horizontal = 20.dp).padding(bottom = 10.dp))

                    Text(text = "Campus Central Edificio F119-120",
                        style = TextStyle(color = Color.Black, fontSize = 15.sp),
                        modifier = Modifier.padding(horizontal = 20.dp).padding(bottom = 10.dp))
                }
            }

            Box (modifier = Modifier.width(325.dp).clip(RoundedCornerShape(10.dp)).background(color = Color(21, 115, 32)))
            {

                Text(text = "Llamar a 2507-1500 ex 21312",
                    style = TextStyle(color = Color.White, fontSize = 16.sp, FontWeight.Bold),
                    modifier = Modifier.padding(horizontal = 50.dp).padding(vertical = 10.dp))
            }

            Divider(color = Color.White, thickness = 10.dp)

            Divider(color = Color.Gray, thickness = 1.dp)

        }
    }
}


