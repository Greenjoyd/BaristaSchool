package com.greenjoyd.baristaschoolav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.baristaschoolav.databinding.ActivityBrewBinding
import com.yandex.mobile.ads.banner.AdSize

class Brew : AppCompatActivity() {

    lateinit var bindingClass: ActivityBrewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityBrewBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_brew)
        setContentView(bindingClass.root)


        val banner = bindingClass.bannerAdView
        banner.setAdUnitId("R-M-2253855-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = com.yandex.mobile.ads.common.AdRequest.Builder().build()

        banner.loadAd(adRequest)
    }
}