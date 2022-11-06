package net.iessochoa.jesusayala.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btAgenda = findViewById<Button>(R.id.btAgenda)
        btAgenda.setOnClickListener {
            val intent = Intent(this,AgendaActivity::class.java)
            startActivity(intent)
        }

        val btReceta = findViewById<Button>(R.id.btReceta)
        btReceta.setOnClickListener {
            val intent = Intent(this,RecetaActivity::class.java)
            startActivity(intent)
        }
    }
}