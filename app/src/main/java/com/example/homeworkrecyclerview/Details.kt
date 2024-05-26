package com.example.homeworkrecyclerview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.homeworkrecyclerview.databinding.ActivityDetailsBinding

class Details : AppCompatActivity() {
    private lateinit var binding:ActivityDetailsBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent=intent
        val selectedItem=intent.getSerializableExtra("Note") as ForDoing
       binding.img.setImageResource(selectedItem.img2)
        binding.basliq.text=selectedItem.basliq
        binding.details.text=selectedItem.detail

        binding.details.isSelected=true


    }
}