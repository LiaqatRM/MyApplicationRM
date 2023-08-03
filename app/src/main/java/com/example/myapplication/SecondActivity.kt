package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val username=intent.getStringExtra("User")
        val textView=findViewById<TextView>(R.id.tvOffer)
        val message= "$username, This offer is only for you enjoy the food! "
        textView.text= message
    }
    override fun onStart() {
        super.onStart()
        Log.i("MyTag", "SecondActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag", "SecondActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag", "SecondActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag", "SecondActivity: onStop")
    }
}