package com.example.contadordeclics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    // Inicialización de contadores
    private var contador1 = 0
    private var contador2 = 0
    private var contador3 = 0
    private var contador4 = 0

    // Inicialización de TextViews
    private lateinit var textViewCounter1: TextView
    private lateinit var textViewCounter2: TextView
    private lateinit var textViewCounter3: TextView
    private lateinit var textViewCounter4: TextView
    private lateinit var textViewGlobalCounter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configura la Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)  // Establece la toolbar como ActionBar
        supportActionBar?.title = "MultiContador"  // Establece el título

        // Referencias a los TextViews
        textViewCounter1 = findViewById(R.id.textViewCounter1)
        textViewCounter2 = findViewById(R.id.textViewCounter2)
        textViewCounter3 = findViewById(R.id.textViewCounter3)
        textViewCounter4 = findViewById(R.id.textViewCounter4)
        textViewGlobalCounter = findViewById(R.id.textViewGlobalCounter)

        // Referencias a los botones
        val buttonIncrement1 = findViewById<Button>(R.id.buttonIncrement1)
        val buttonReset1 = findViewById<Button>(R.id.buttonReset1)
        val buttonIncrement2 = findViewById<Button>(R.id.buttonIncrement2)
        val buttonReset2 = findViewById<Button>(R.id.buttonReset2)
        val buttonIncrement3 = findViewById<Button>(R.id.buttonIncrement3)
        val buttonReset3 = findViewById<Button>(R.id.buttonReset3)
        val buttonIncrement4 = findViewById<Button>(R.id.buttonIncrement4)
        val buttonReset4 = findViewById<Button>(R.id.buttonReset4)
        val buttonResetAll = findViewById<Button>(R.id.buttonResetAll)

        // Listeners para los botones de incremento y reset
        buttonIncrement1.setOnClickListener {
            contador1++
            updateCounters()
        }

        buttonReset1.setOnClickListener {
            contador1 = 0
            updateCounters()
        }

        buttonIncrement2.setOnClickListener {
            contador2++
            updateCounters()
        }

        buttonReset2.setOnClickListener {
            contador2 = 0
            updateCounters()
        }

        buttonIncrement3.setOnClickListener {
            contador3++
            updateCounters()
        }

        buttonReset3.setOnClickListener {
            contador3 = 0
            updateCounters()
        }

        buttonIncrement4.setOnClickListener {
            contador4++
            updateCounters()
        }

        buttonReset4.setOnClickListener {
            contador4 = 0
            updateCounters()
        }

        buttonResetAll.setOnClickListener {
            resetAllCounters()
        }
    }

    // Función para actualizar todos los contadores en pantalla
    private fun updateCounters() {
        textViewCounter1.text = contador1.toString()
        textViewCounter2.text = contador2.toString()
        textViewCounter3.text = contador3.toString()
        textViewCounter4.text = contador4.toString()

        // Actualizar el contador global (suma de todos los contadores)
        val contadorGlobal = contador1 + contador2 + contador3 + contador4
        textViewGlobalCounter.text = contadorGlobal.toString()
    }

    // Función para reiniciar todos los contadores a 0
    private fun resetAllCounters() {
        contador1 = 0
        contador2 = 0
        contador3 = 0
        contador4 = 0
        updateCounters()
    }
}
