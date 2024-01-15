package com.techmania.mathgame

import android.content.Intent
import android.media.VolumeShaper.Operation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var addition : Button
    lateinit var subtraction: Button
    lateinit var multiplication: Button

    var flag = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addition= findViewById(R.id.buttonAdd)
        subtraction= findViewById(R.id.buttonSub)
        multiplication = findViewById(R.id.buttonMulti)

        addition.setOnClickListener {
            desiredOperation("add")
        }
        subtraction.setOnClickListener {
            desiredOperation("sub")
        }
        multiplication.setOnClickListener {
            desiredOperation("mul")
        }
    }
    fun desiredOperation(operation: String){
        val intent = Intent(this@MainActivity,GameActivity::class.java)
        intent.putExtra("operation",operation)
        startActivity(intent)
    }
}