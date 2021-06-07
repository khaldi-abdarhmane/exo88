package com.example.exo88

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import org.json.JSONObject

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val start_adhan=findViewById<Button>(R.id.start_adhan)
        val stop_adhan=findViewById<Button>(R.id.stop_adhan)
        val textView=findViewById<TextView>(R.id.textView)

        start_adhan.setOnClickListener {
            startService(Intent(baseContext,Adhan::class.java))
        }
        stop_adhan.setOnClickListener {
            stopService(Intent(baseContext,Adhan::class.java))
        }
    }


}