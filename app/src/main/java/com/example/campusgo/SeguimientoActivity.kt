package com.example.campusgo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.campusgo.databinding.ActivitySeguimientoBinding

class SeguimientoActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySeguimientoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeguimientoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}