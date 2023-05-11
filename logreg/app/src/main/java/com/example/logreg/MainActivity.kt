package com.example.logreg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.logreg.ui.login.LoginActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnClickGoMain(view : View){

        val intent = Intent(this, LoginActivity::class.java )
        startActivity(intent)
    }

    fun OnClickGoMain2(view : View){

        val intent = Intent(this, Register::class.java )
        startActivity(intent)


    }
}