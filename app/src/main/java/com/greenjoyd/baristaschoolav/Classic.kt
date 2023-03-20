package com.greenjoyd.baristaschoolav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.baristaschoolav.databinding.ActivityClassicBinding
import com.greenjoyd.baristaschoolav.databinding.ActivitySelectBinding

class Classic : AppCompatActivity() {

    lateinit var bindingClass: ActivityClassicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityClassicBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_classic)
        setContentView(bindingClass.root)

        bindingClass.espresso.setOnClickListener {
            val intent = Intent (this, Espresso::class.java)
            startActivity(intent)
        }
        bindingClass.americano.setOnClickListener{
            val intent = Intent (this, Americano::class.java)
            startActivity(intent)
        }
        bindingClass.cappuccino.setOnClickListener{
            val intent = Intent(this, cappuch::class.java)
            startActivity(intent)
        }
        bindingClass.latte.setOnClickListener{
            val intent = Intent(this, latte::class.java)
            startActivity(intent)
        }
        bindingClass.flat.setOnClickListener{
            val intent = Intent(this, flat::class.java)
            startActivity(intent)
        }
    }
}