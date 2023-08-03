package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MyTag", "Checing code execution")
        val greetingView=findViewById<TextView>(R.id.tvWelcomeMessage)
        val enterName=findViewById<EditText>(R.id.tvEnterName)
        val submitButton=findViewById<Button>(R.id.btnSubmit)
        val offerbutton=findViewById<Button>(R.id.btnOffer)
        var enteredName=""
        submitButton.setOnClickListener {
            enteredName = enterName.text.toString()
            if(enteredName=="")
            {
              Toast.makeText(this@MainActivity, "Please enter name !", Toast.LENGTH_SHORT).show()
            }
            else {
                val message = "Welcome $enteredName"
                Log.i("MyTag", message)
                greetingView.text = message
                Log.i("MyTag", "Finishing code execution Mainactivity")
                enterName.text.clear()
            }
        }
        offerbutton.setOnClickListener()
        {
            val intent= Intent(this, SecondActivity::class.java)
            intent.putExtra("User", enteredName)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MyTag", "ManinActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag", "ManinActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag", "ManinActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag", "ManinActivity: onStop")
    }
}

