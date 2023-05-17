package com.greenjoyd.baristaschoolav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.greenjoyd.baristaschoolav.databinding.ActivityPourBinding
import com.greenjoyd.baristaschoolav.vm.GeneralViewModel
import com.yandex.mobile.ads.banner.AdSize

class Pour : AppCompatActivity() {

    lateinit var bindingClass: ActivityPourBinding
    lateinit var generalViewModel: GeneralViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)
        bindingClass = ActivityPourBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        generalViewModel.pour.observe(this){pour ->
            bindingClass.pourView.text = pour
        }
        generalViewModel.pourImage.observe(this){pourImage ->
            bindingClass.imageView2.setImageDrawable(pourImage)
        }
        generalViewModel.updatePour()

        val banner = bindingClass.bannerAdView
        banner.setAdUnitId("R-M-2253855-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = com.yandex.mobile.ads.common.AdRequest.Builder().build()

        banner.loadAd(adRequest)
    }
}