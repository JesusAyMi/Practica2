package net.iessochoa.jesusayala.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AgendaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        val btAceptar = findViewById<Button>(R.id.btAceptar)
        val btCancelar = findViewById<Button>(R.id.btCancelar)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellidos = findViewById<EditText>(R.id.etApellidos)
        var tvNuevoContacto = findViewById<TextView>(R.id.tvNuevoContacto)

        btAceptar.setOnClickListener {
            if (!etNombre.text.isEmpty() && !etApellidos.text.isEmpty()){

                val nombreApellidos = "${etNombre.text}  ${etApellidos.text}"
                tvNuevoContacto.text = nombreApellidos

            }else {
                Toast.makeText(this, "Introduce nombre y apellidos",
                    Toast.LENGTH_SHORT).show()
            }
        }

        btCancelar.setOnClickListener{
            btCancelar.setOnClickListener() { finish() }
        }
    }
}