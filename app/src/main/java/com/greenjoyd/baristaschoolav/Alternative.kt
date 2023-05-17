package com.greenjoyd.baristaschoolav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.baristaschoolav.alternative.French
import com.greenjoyd.baristaschoolav.alternative.Geyser
import com.greenjoyd.baristaschoolav.alternative.Chemex
import com.greenjoyd.baristaschoolav.alternative.Hario
import com.greenjoyd.baristaschoolav.databinding.ActivityAlternativeBinding

class Alternative : AppCompatActivity() {
    lateinit var bindingClass: ActivityAlternativeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityAlternativeBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


        bindingClass.franch.setOnClickListener {
            val intent = Intent(this, French::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        bindingClass.gayser.setOnClickListener {
            val intent = Intent(this, Geyser::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        bindingClass.cemecs.setOnClickListener {
            val intent = Intent(this, Chemex::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
        bindingClass.hario.setOnClickListener {
            val intent = Intent(this, Hario::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

    }
}
