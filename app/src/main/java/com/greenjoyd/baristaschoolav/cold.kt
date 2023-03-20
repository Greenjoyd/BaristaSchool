package com.greenjoyd.baristaschoolav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.baristaschoolav.databinding.ActivityColdBinding
import com.yandex.mobile.ads.banner.AdSize

class cold : AppCompatActivity() {

    lateinit var bindingClass: ActivityColdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityColdBinding.inflate((layoutInflater))
        setContentView(R.layout.activity_cold)
        setContentView(bindingClass.root)


        val banner = bindingClass.bannerAdView
        banner.setAdUnitId("R-M-2253855-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = com.yandex.mobile.ads.common.AdRequest.Builder().build()

        banner.loadAd(adRequest)
    }
}