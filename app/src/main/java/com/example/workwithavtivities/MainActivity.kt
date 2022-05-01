package com.example.workwithavtivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun PassActivity2(view : View)
    {   val data = txtData.text.toString()
        val intent=Intent(applicationContext,SeconActivity::class.java)
        intent.putExtra("data",data)
        startActivity(intent)
    }
}