package com.wbh.test

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
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


        //print in console log the email
        Log.d("Email", email?.text.toString())

        //print in console log the email
        Log.d("password", password?.text.toString())


        // 3 sec for the pic for display
        animation?.setEnterFadeDuration(3000)
        // 3 sec for the pic for changed
        animation?.setExitFadeDuration(1000)
        // start the animation
        animation?.start()
    }
}
