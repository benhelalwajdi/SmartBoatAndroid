package com.wbh.test

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.Constraints

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

        val parent : androidx.constraintlayout.widget.ConstraintLayout = findViewById(R.id.parent_layout)
        val animation: AnimationDrawable? = parent.background as AnimationDrawable?

        // 3 sec for the pic for display
        animation?.setEnterFadeDuration(3000)
        // 3 sec for the pic for changed
        animation?.setExitFadeDuration(1000)
        // start the animation
        animation?.start()

        //prepare the boat list todo
        /* TODO */

    }
}
