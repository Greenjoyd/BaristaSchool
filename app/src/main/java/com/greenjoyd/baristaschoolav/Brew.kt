package com.greenjoyd.baristaschoolav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.greenjoyd.baristaschoolav.databinding.ActivityBrewBinding
import com.greenjoyd.baristaschoolav.vm.GeneralViewModel
import com.yandex.mobile.ads.banner.AdSize

class Brew : AppCompatActivity() {
    private lateinit var generalViewModel: GeneralViewModel
    lateinit var bindingClass: ActivityBrewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)
        bindingClass = ActivityBrewBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        generalViewModel.brew.observe(this) { brew ->
            bindingClass.brewView.text = brew
        }
        generalViewModel.brewImage.observe(this) { brewImage ->
            bindingClass.imageView2.setImageDrawable(brewImage)
        }
        generalViewModel.updateBrew()

        val banner = bindingClass.bannerAdView
        banner.setAdUnitId("R-M-2253855-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = com.yandex.mobile.ads.common.AdRequest.Builder().build()
        banner.loadAd(adRequest)
    }
}