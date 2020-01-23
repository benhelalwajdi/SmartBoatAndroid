package com.wbh.test

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //declaration Image view on layout
        var myImage:ImageView = findViewById(R.id.animation)

        //declaration the animation drawable for change the image in the layout
        var animation:AnimationDrawable? = myImage.background as AnimationDrawable?


        // 3 sec for the pic for display
        animation?.setEnterFadeDuration(3000)
        // 3 sec for the pic for changed
        animation?.setExitFadeDuration(1000)
        //start the animation
        animation?.start()

    }
}
