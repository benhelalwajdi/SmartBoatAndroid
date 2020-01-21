package com.wbh.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var appName = "Smart Boat"

        var textUI = findViewById(R.id.text) as TextView
        var ButtonUI = findViewById(R.id.button) as TextView

        ButtonUI.setOnClickListener {
            textUI.text = appName
            println("dd")
            var intent = Intent (this@MainActivity, HomeActivity::class.java)
            intent.putExtra("name",appName)
            startActivity(intent)
        }*/


    }
}
