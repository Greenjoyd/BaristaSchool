package com.greenjoyd.baristaschoolav.alternative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.greenjoyd.baristaschoolav.Brew
import com.greenjoyd.baristaschoolav.databinding.ActivityFrenchBinding
import com.greenjoyd.baristaschoolav.vm.GeneralViewModel
import com.yandex.mobile.ads.banner.AdSize

class French : AppCompatActivity() {
    lateinit var generalViewModel: GeneralViewModel
    lateinit var bindingClass: ActivityFrenchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)
        bindingClass = ActivityFrenchBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        generalViewModel.frecnh.observe(this) { french ->
            bindingClass.franchTV.text = french
        }
        generalViewModel.franchImage.observe(this) { frenchImage ->
            bindingClass.imageView.setImageDrawable(frenchImage)
        }
        generalViewModel.updateFrench()

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