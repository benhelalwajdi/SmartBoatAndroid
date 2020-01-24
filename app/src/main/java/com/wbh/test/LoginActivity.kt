package com.wbh.test

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // declaration variable
        // declaration Image view on layout
        var myImage:ImageView = findViewById(R.id.animation)
        // declaration the animation drawable for change the image in the layout
        var animation:AnimationDrawable? = myImage.background as AnimationDrawable?
        // dec the email text field
        var email:EditText? = findViewById(R.id.username)
        // dec the password text field
        var password:EditText? = findViewById(R.id.password)
        // dec button
        var btn:Button = findViewById(R.id.button)

        // 3 sec for the pic for display
        animation?.setEnterFadeDuration(3000)
        // 3 sec for the pic for changed
        animation?.setExitFadeDuration(1000)
        // start the animation
        animation?.start()


        val Button:Button = findViewById(R.id.animation3)
        val Button2:Button = findViewById(R.id.animation2)

        Button.setOnClickListener {
            val animation2: Animation? = AnimationUtils.loadAnimation(this@LoginActivity,R.anim.scale)
            myImage.startAnimation(animation2)
        }

        Button2.setOnClickListener {
            val animation2: Animation? = AnimationUtils.loadAnimation(this@LoginActivity,R.anim.alpha)
            myImage.startAnimation(animation2)

        }


        // Event click button
        btn.setOnClickListener {
            //print in console log the email
            Log.d("Email", email?.text.toString())
            //print in console log the email
            Log.d("password", password?.text.toString())
            if((email!= null)&&(password!= null)){
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                Log.d("Email && password","Password and Email is Null")
            }
        }
    }
}
