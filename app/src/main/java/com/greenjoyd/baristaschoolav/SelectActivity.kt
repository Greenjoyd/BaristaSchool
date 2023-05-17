package com.greenjoyd.baristaschoolav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.baristaschoolav.databinding.ActivitySelectBinding

class SelectActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivitySelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySelectBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.classic.setOnClickListener {
            val intent = Intent(this, Classic::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        bindingClass.seasone.setOnClickListener {
            val intent = Intent(this, SeasoneActivity::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        bindingClass.Alternative.setOnClickListener {
            val intent = Intent(this, Alternative::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        bindingClass.coffeMachine.setOnClickListener {
            val intent = Intent(this, CoffeeMachine::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        bindingClass.Ads.setOnClickListener {
            val intent = Intent(this, Ads::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

    }
}