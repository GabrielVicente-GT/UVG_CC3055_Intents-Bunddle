package com.example.intents_bunddle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSumando.setOnClickListener{
            val intent: Intent = Intent(this, ActividadSumar::class.java)
            startActivityForResult(intent,1)
        }
        btnRestando.setOnClickListener{
            val intent: Intent = Intent(this, ActividadRestar::class.java)
            startActivityForResult(intent,1)
        }
        btnMult.setOnClickListener{
            val intent: Intent = Intent(this, ActividadMultiplicar::class.java)
            startActivityForResult(intent,1)
        }
        btnDiv.setOnClickListener{
            val intent: Intent = Intent(this, ActividadDividir::class.java)
            startActivityForResult(intent,1)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == RESULT_OK){
            if(requestCode == 1){
                val bundle = data?.extras
                if(bundle!=null){
                    val finalmente = bundle.getString("r_final")
                    txtResultado.text = finalmente
                }
            }
        }
    }
}