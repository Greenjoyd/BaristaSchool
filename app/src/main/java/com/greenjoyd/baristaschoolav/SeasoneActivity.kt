package com.greenjoyd.baristaschoolav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.baristaschoolav.databinding.ActivitySeasoneBinding
import com.greenjoyd.baristaschoolav.season.Cold
import com.greenjoyd.baristaschoolav.season.Raf

class SeasoneActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivitySeasoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        bindingClass = ActivitySeasoneBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingClass.root)



        bindingClass.raf.setOnClickListener {
            val intent = Intent(this, Raf::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        bindingClass.cold.setOnClickListener {
            val intent = Intent(this, Cold::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }

}