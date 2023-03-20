package com.greenjoyd.baristaschoolav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.baristaschoolav.databinding.ActivitySeasoneBinding

class SeasoneActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivitySeasoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        bindingClass = ActivitySeasoneBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seasone)
        setContentView(bindingClass.root)

        bindingClass.raf.setOnClickListener{
            val intent = Intent(this,raf::class.java)
            startActivity(intent)
        }
        bindingClass.cold.setOnClickListener{
            val intent = Intent(this,cold::class.java)
            startActivity(intent)
        }
    }


}