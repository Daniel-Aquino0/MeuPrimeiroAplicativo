package com.example.murphyneles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        ButtonTouch.setOnClickListener(this)
        TextNumber.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.ButtonTouch || v?.id == R.id.TextNumber) {
            TextNumber.text = RandomNumber() .toString()
        }
    }

    fun RandomNumber(): Int {
        return Random.nextInt(100) + 1
    }


}