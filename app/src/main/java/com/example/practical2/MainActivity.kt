package com.example.practical2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practical2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    // binding: ActivityMainBinding (behind is datatype)
    // lateinit assign things later on

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //findViewById (very slow, look id one by one)
        //(data binding , build take time)

        var student:Student = Student("ali", "RSD")

        binding.btnSetData.setOnClickListener {
            binding.myStudent = student
            //binding.tvSetName.text = "Ali"
            //binding.tvSetProgramme.text = "RSD"
        }
        binding.btnChangeValue.setOnClickListener{
            student.programme = "RIT"
            binding.invalidateAll()
            //invalidateAll = refresh
        }
    }
}