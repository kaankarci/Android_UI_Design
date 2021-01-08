package com.kk.arneca_ui_design

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buy_page(view: View){
        val intent=Intent(applicationContext,Buying::class.java)
        startActivity(intent)
    }


   
}