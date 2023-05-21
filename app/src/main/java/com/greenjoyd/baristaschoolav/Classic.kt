package com.greenjoyd.baristaschoolav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.baristaschoolav.classic.*
import com.greenjoyd.baristaschoolav.databinding.ActivityClassicBinding

class Classic : AppCompatActivity() {

    lateinit var bindingClass: ActivityClassicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityClassicBinding.inflate(layoutInflater)


        setContentView(bindingClass.root)

        bindingClass.espresso.setOnClickListener {
            val intent = Intent(this, Espresso::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        bindingClass.americano.setOnClickListener {
            val intent = Intent(this, Americano::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        bindingClass.cappuccino.setOnClickListener {
            val intent = Intent(this, Cappuch::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        bindingClass.latte.setOnClickListener {
            val intent = Intent(this, Latte::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        bindingClass.flat.setOnClickListener {
            val intent = Intent(this, Flat::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
}