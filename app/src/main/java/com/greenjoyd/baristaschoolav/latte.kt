package com.greenjoyd.baristaschoolav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.baristaschoolav.databinding.ActivityLatteBinding
import com.yandex.mobile.ads.banner.AdSize

class latte : AppCompatActivity() {

    lateinit var bindingClass: ActivityLatteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityLatteBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_latte)
        setContentView(bindingClass.root)

        bindingClass.BrewButton.setOnClickListener{
            val intent = Intent (this, Brew::class.java)
            startActivity(intent)
        }
        bindingClass.pour.setOnClickListener{
            val intent = Intent(this, pour::class.java)
            startActivity(intent)
        }
        val banner = bindingClass.bannerAdView
        banner.setAdUnitId("R-M-2253855-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = com.yandex.mobile.ads.common.AdRequest.Builder().build()

        banner.loadAd(adRequest)
    }
}