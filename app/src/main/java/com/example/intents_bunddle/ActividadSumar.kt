package com.example.intents_bunddle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_actividad_sumar.*

class ActividadSumar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_sumar)
        btnRegresar.setOnClickListener {

            val valorA_edittext: EditText = valorA
            val valorB_edittext: EditText = valorB

            val valorA_string: String = valorA_edittext.text.toString()
            val valorB_string: String = valorB_edittext.text.toString()

            val Operando_A:Double = valorA_string.toDouble()
            val Operando_B:Double = valorB_string.toDouble()

            val operacion: Double = Operando_A+Operando_B

            val resultado_operacion: String = operacion.toString()

            val intent: Intent = Intent(this,MainActivity::class.java)
            intent.putExtra("r_final",resultado_operacion)
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}