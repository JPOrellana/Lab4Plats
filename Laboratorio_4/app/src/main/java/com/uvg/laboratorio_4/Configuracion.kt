package com.uvg.laboratorio_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.laboratorio_4.ui.theme.Laboratorio_4Theme

class Settings: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio_4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SettingsPage()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SettingsPreview() {
    Laboratorio_4Theme {
        SettingsPage()
    }
}


@Composable
fun SettingsPage(){
    Surface {
        val prof = painterResource(id = R.drawable.usuario)
        val mail = painterResource(id = R.drawable.mail)
        val notif = painterResource(id = R.drawable.notifi)
        val help = painterResource(id = R.drawable.interrogacion)
        val about = painterResource(id = R.drawable.exclamacion)
        val priv = painterResource(id = R.drawable.privacidad)

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth())
        {
            Row(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth())
            {
                Text(text = "Configuración",
                    style = TextStyle(color = Color.Black, fontSize = 26.sp, fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(20.dp))

                Text(text = "       ")
            }

            Column(horizontalAlignment = Alignment.Start)
            {
                Divider(color = Color.Gray, thickness = 1.dp)

                Row {
                    Image(painter = prof,
                        contentDescription = "profile settings logo",
                        modifier = Modifier.size(40.dp).absoluteOffset(0.dp, 15.dp))

                    Text(text = "Editar Perfil",
                        style = TextStyle(color = Color.Black, fontSize = 20.sp),
                        modifier = Modifier.padding(20.dp))
                }

                Divider(color = Color.Gray, thickness = 1.dp)

                Row {
                    Image(painter = mail,
                        contentDescription = "email settings logo",
                        modifier = Modifier.size(40.dp).absoluteOffset(0.dp, 15.dp))

                    Text(text = "Correos Electrónicos",
                        style = TextStyle(color = Color.Black, fontSize = 20.sp),
                        modifier = Modifier.padding(20.dp))
                }

                Divider(color = Color.Gray, thickness = 1.dp)

                Row {
                    Image(painter = notif,
                        contentDescription = "notifications settings logo",
                        modifier = Modifier.size(40.dp).absoluteOffset(0.dp, 15.dp))

                    Text(text = "Notificaciones",
                        style = TextStyle(color = Color.Black, fontSize = 20.sp),
                        modifier = Modifier.padding(20.dp))
                }

                Divider(color = Color.Gray, thickness = 1.dp)

                Row {
                    Image(painter = priv,
                        contentDescription = "privacy settings logo",
                        modifier = Modifier.size(40.dp).absoluteOffset(0.dp, 15.dp))

                    Text(text = "Privacidad",
                        style = TextStyle(color = Color.Black, fontSize = 20.sp),
                        modifier = Modifier.padding(20.dp))
                }

                Divider(color = Color.LightGray, thickness = 20.dp)

                Row {
                    Image(painter = help,
                        contentDescription = "help logo",
                        modifier = Modifier.size(40.dp).absoluteOffset(0.dp, 15.dp))

                    Column {
                        Text(text = "Ayuda y Comentarios",
                            style = TextStyle(color = Color.Black, fontSize = 20.sp),
                            modifier = Modifier.padding(horizontal = 20.dp).padding(top = 10.dp))

                        Text(text = "Solución de problemas y Guías",
                            style = TextStyle(color = Color.Black, fontSize = 15.sp),
                            modifier = Modifier.padding(horizontal = 20.dp).padding(bottom = 10.dp))
                    }
                }

                Divider(color = Color.Gray, thickness = 1.dp)

                Row {
                    Image(painter = about,
                        contentDescription = "About logo",
                        modifier = Modifier.size(40.dp).absoluteOffset(0.dp, 15.dp))

                    Column {
                        Text(text = "Información",
                            style = TextStyle(color = Color.Black, fontSize = 20.sp),
                            modifier = Modifier.padding(horizontal = 20.dp).padding(top = 10.dp))

                        Text(text = "Información y Documentación de la App",
                            style = TextStyle(color = Color.Black, fontSize = 15.sp),
                            modifier = Modifier.padding(horizontal = 20.dp).padding(bottom = 10.dp))
                    }
                }

                Divider(color = Color.LightGray, thickness = 20.dp)

                Text(text = "Cerrar Sesión",
                    style = TextStyle(color = Color.Red, fontSize = 20.sp, FontWeight.Bold),
                    modifier = Modifier.padding(20.dp),
                    textAlign = TextAlign.Center)

                Divider(color = Color.Gray, thickness = 1.dp)

                Divider(color = Color.LightGray, thickness = 500.dp)
            }
        }
    }
}

