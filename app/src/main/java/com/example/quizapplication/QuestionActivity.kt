package com.example.quizapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapplication.databinding.ActivityQuestionBinding

class QuestionActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(_binding.root)
    }
}