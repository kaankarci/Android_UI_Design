package com.kk.arneca_ui_design

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Buying : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buying)
    }

    fun back(view: View){
            val intent= Intent(applicationContext,MainActivity::class.java)

            startActivity(intent)

    }
}