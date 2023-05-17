package com.greenjoyd.baristaschoolav.alternative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.greenjoyd.baristaschoolav.databinding.ActivityGayserBinding
import com.greenjoyd.baristaschoolav.vm.GeneralViewModel
import com.yandex.mobile.ads.banner.AdSize

class Geyser : AppCompatActivity() {
    lateinit var generalViewModel: GeneralViewModel
    lateinit var bindingClass: ActivityGayserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)
        bindingClass = ActivityGayserBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        generalViewModel.geyser.observe(this) { geyser ->
            bindingClass.gayserTV.text = geyser
        }
        generalViewModel.geyserImage.observe(this) { geysetImage ->
            bindingClass.imageView.setImageDrawable(geysetImage)
        }
        generalViewModel.updateGeyser()

        val banner = bindingClass.bannerAdView
        banner.setAdUnitId("R-M-2253855-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = com.yandex.mobile.ads.common.AdRequest.Builder().build()

        banner.loadAd(adRequest)
    }
}