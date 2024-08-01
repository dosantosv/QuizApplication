package com.example.quizapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapplication.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        _binding.btnEnter.setOnClickListener { enter() }
    }

    private fun enter() : Boolean {
        if (_binding.textName.text != null || _binding.textName.text != "") {
            val username : String = _binding.textName.text.toString()
            val user = User(username)
            val intent =
            return true
        }
        return false
    }
}