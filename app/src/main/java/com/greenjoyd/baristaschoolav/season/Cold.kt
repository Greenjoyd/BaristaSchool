package com.greenjoyd.baristaschoolav.season

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.greenjoyd.baristaschoolav.databinding.ActivityColdBinding
import com.greenjoyd.baristaschoolav.vm.GeneralViewModel
import com.yandex.mobile.ads.banner.AdSize

class Cold : AppCompatActivity() {
    lateinit var generalViewModel: GeneralViewModel
    lateinit var bindingClass: ActivityColdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)
        super.onCreate(savedInstanceState)
        bindingClass = ActivityColdBinding.inflate((layoutInflater))
        setContentView(bindingClass.root)

        generalViewModel.cold.observe(this){cold ->
            bindingClass.coldTV.text = cold
        }
        generalViewModel.coldImage.observe(this){coldImage ->
            bindingClass.imageView.setImageDrawable(coldImage)
        }
        generalViewModel.updateCold()

        val banner = bindingClass.bannerAdView
        banner.setAdUnitId("R-M-2253855-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = com.yandex.mobile.ads.common.AdRequest.Builder().build()

        banner.loadAd(adRequest)
    }
}