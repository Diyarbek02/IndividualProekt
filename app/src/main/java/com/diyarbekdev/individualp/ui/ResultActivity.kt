package com.diyarbekdev.individualp.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diyarbekdev.individualp.R
import com.diyarbekdev.individualp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val correctAnswersCount = intent.getIntExtra("score", 0)


        binding.tvResult.text = getString(R.string.score_text, correctAnswersCount)

        binding.lottie.setMinAndMaxFrame(0, 370)
        binding.lottie.playAnimation()
    }
}