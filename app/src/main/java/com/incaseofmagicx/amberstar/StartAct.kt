package com.incaseofmagicx.amberstar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    fun start(view: View) {
        Intent(applicationContext, GameplayAS::class.java).also { startActivity(it) }
        finish()
    }
}