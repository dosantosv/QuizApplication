package com.example.quizapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapplication.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnter.setOnClickListener { enter() }
    }

    private fun enter() : Boolean {
        if (binding.textName.text != null || binding.textName.text != "") {
            val username : String = binding.textName.text.toString()
            val user = User(username)
            val intent =
            return true
        }
        return false
    }
}