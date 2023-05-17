package com.greenjoyd.baristaschoolav.alternative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.greenjoyd.baristaschoolav.Brew
import com.greenjoyd.baristaschoolav.databinding.ActivityKemeksBinding
import com.greenjoyd.baristaschoolav.vm.GeneralViewModel
import com.yandex.mobile.ads.banner.AdSize

class Chemex : AppCompatActivity() {
    lateinit var generalViewModel: GeneralViewModel
    lateinit var bindingClass: ActivityKemeksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)
        super.onCreate(savedInstanceState)
        bindingClass = ActivityKemeksBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        generalViewModel.chemex.observe(this) { chemex ->
            bindingClass.chemexTV.text = chemex
        }
        generalViewModel.chemexImage.observe(this) { chemexImage ->
            bindingClass.imageView.setImageDrawable(chemexImage)
        }
        generalViewModel.updateChemex()

        bindingClass.BrewButton.setOnClickListener {
            val intent = Intent(this, Brew::class.java)
            startActivity(intent)
        }

        val banner = bindingClass.bannerAdView
        banner.setAdUnitId("R-M-2253855-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = com.yandex.mobile.ads.common.AdRequest.Builder().build()

        banner.loadAd(adRequest)
    }
}