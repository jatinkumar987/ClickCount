package com.example.firstproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe =findViewById<Button>(R.id.mybutton)
        val textbutton =findViewById<TextView>(R.id.textView)
        var clickCount =0

        btnClickMe.setOnClickListener {
            clickCount=clickCount+1
            //btnClickMe.text="haha you clicked me!"
            textbutton.text=clickCount.toString()
            Toast.makeText(this,"hey i'm a tost",Toast.LENGTH_LONG).show()
        }


    }
}