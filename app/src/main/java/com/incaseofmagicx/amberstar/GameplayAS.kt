package com.incaseofmagicx.amberstar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.isVisible
import androidx.core.view.marginLeft
import androidx.core.view.marginStart
import androidx.core.view.marginTop
import kotlinx.android.synthetic.main.activity_gameplay_as.*
import kotlin.random.Random

class GameplayAS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gameplay_as)
        var score = 0
        star.setOnClickListener {
            starTxt.isVisible = false
            val x = Random.nextInt(10, 800)
            val y = Random.nextInt(10, 1800)
            score++
            var s: ImageView = findViewById(R.id.star);
            s.x = x.toFloat();
            s.y = y.toFloat();
            if (score==30){
                star.isVisible = false
                Intent(applicationContext, FinalAct::class.java).also { startActivity(it) }
                finish()
            }

        }
    }
}