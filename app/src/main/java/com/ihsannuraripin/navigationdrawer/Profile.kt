package com.ihsannuraripin.navigationdrawer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ihsannuraripin.navigationdrawer.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnback.setOnClickListener {
            val  intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}