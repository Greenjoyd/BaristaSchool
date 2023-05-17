package com.greenjoyd.baristaschoolav.alternative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.greenjoyd.baristaschoolav.Brew
import com.greenjoyd.baristaschoolav.R
import com.greenjoyd.baristaschoolav.databinding.ActivityGayserBinding
import com.greenjoyd.baristaschoolav.databinding.ActivityHarioBinding
import com.greenjoyd.baristaschoolav.vm.GeneralViewModel
import com.yandex.mobile.ads.banner.AdSize

class Hario : AppCompatActivity() {
    lateinit var bindingClass: ActivityHarioBinding
    lateinit var generalViewModel: GeneralViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)
        bindingClass = ActivityHarioBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        generalViewModel.hario.observe(this) { hario ->
            bindingClass.harioTV.text = hario
        }
        generalViewModel.harioImage.observe(this) { harioImage ->
            bindingClass.imageView.setImageDrawable(harioImage)
        }
        generalViewModel.updateHario()


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