package com.example.font_task

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var txt: TextView
    private lateinit var btnBungee_spice: Button
    private lateinit var btnBungee_tint : Button
    private lateinit var btnPacifico :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       initView()
    }
    private fun initView() {

        txt=findViewById(R.id.txt);
        btnPacifico=findViewById(R.id.btnPacifico);
        btnBungee_tint=findViewById(R.id.btnBungee_tint);
        btnBungee_spice=findViewById(R.id.btnBungee_spice);

        btnPacifico.setOnClickListener {
            val typeface = ResourcesCompat.getFont(this, R.font.pacifico)
            txt.typeface = typeface
        }

        btnBungee_tint.setOnClickListener {
            val typeface = ResourcesCompat.getFont(this, R.font.bungeetint_regular)
            txt.typeface = typeface
        }

        btnBungee_spice.setOnClickListener {
            val typeface = ResourcesCompat.getFont(this, R.font.bungeespice_regular)
            txt.typeface = typeface
        }
    }
}