package com.greenjoyd.baristaschoolav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.baristaschoolav.databinding.ActivityMainBinding
import com.greenjoyd.baristaschoolav.databinding.ActivitySelectBinding

class SelectActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivitySelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySelectBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_select)
        setContentView(bindingClass.root)

        bindingClass.classic.setOnClickListener{
            val intent = Intent(this,Classic::class.java)
            startActivity(intent)
        }

        bindingClass.seasone.setOnClickListener{
            val intent = Intent(this,SeasoneActivity::class.java)
            startActivity(intent)
        }
    }
}