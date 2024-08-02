package com.example.quizapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapplication.databinding.ActivityQuestionBinding

class QuestionActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityQuestionBinding
    private var _numberPage = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        getQuestionsToNumberPage()
    }

    private fun getQuestionsToNumberPage()
    {
        val questionPageOne = MockQuestions.responseOne.values.toList()
        val questionPageTwo = MockQuestions.responseTwo.values.toList()
        val questionPageThree = MockQuestions.responseThree.values.toList()
        val questionPageFour = MockQuestions.responseFour.values.toList()

        when (_numberPage) {
            1 -> {
                _binding.textQuestion.text = MockQuestions.questionOne
                _binding.radiobtnResponse1.text = questionPageOne[0].toString()
                _binding.radiobtnResponse2.text = questionPageOne[1].toString()
                _binding.radiobtnResponse3.text = questionPageOne[2].toString()
                _binding.radiobtnResponse4.text = questionPageOne[3].toString()
            }
            2 -> {
                _binding.textQuestion.text = MockQuestions.questionTwo
                _binding.radiobtnResponse1.text = questionPageTwo[0].toString()
                _binding.radiobtnResponse2.text = questionPageTwo[1].toString()
                _binding.radiobtnResponse3.text = questionPageTwo[2].toString()
                _binding.radiobtnResponse4.text = questionPageTwo[3].toString()
            }
            3 -> {
                _binding.textQuestion.text = MockQuestions.questionThree
                _binding.radiobtnResponse1.text = questionPageThree[0].toString()
                _binding.radiobtnResponse2.text = questionPageThree[1].toString()
                _binding.radiobtnResponse3.text = questionPageThree[2].toString()
                _binding.radiobtnResponse4.text = questionPageThree[3].toString()
            }
            4 -> {
                _binding.textQuestion.text = MockQuestions.questionThree
                _binding.radiobtnResponse1.text = questionPageFour[0].toString()
                _binding.radiobtnResponse2.text = questionPageFour[1].toString()
                _binding.radiobtnResponse3.text = questionPageFour[2].toString()
                _binding.radiobtnResponse4.text = questionPageFour[3].toString()
            }
        }
    }
}