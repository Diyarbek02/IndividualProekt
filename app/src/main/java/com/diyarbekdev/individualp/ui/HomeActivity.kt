package com.diyarbekdev.individualp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import com.diyarbekdev.individualp.R
import com.diyarbekdev.individualp.databinding.ActivityHomeBinding
import com.diyarbekdev.individualp.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btn_cours = findViewById<Button>(R.id.btn_cours)
        val btn_tests = findViewById<Button>(R.id.btn_tests)

        btn_cours.setOnClickListener {
            val intent = (Intent(this, MainActivity::class.java))
            startActivity(intent)
        }

        btn_tests.setOnClickListener {
            val intent = (Intent(this, TestActivity::class.java))
            startActivity(intent)
        }
    }
}