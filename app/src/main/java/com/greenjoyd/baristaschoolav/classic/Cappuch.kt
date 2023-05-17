package com.greenjoyd.baristaschoolav.classic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.greenjoyd.baristaschoolav.Brew
import com.greenjoyd.baristaschoolav.databinding.ActivityCappuchBinding
import com.greenjoyd.baristaschoolav.Pour
import com.greenjoyd.baristaschoolav.vm.GeneralViewModel
import com.yandex.mobile.ads.banner.AdSize

class Cappuch : AppCompatActivity() {
    lateinit var bindingClass: ActivityCappuchBinding
    private lateinit var generalViewModel: GeneralViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)
        bindingClass = ActivityCappuchBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        generalViewModel.cappuch.observe(this) { cappuch ->
            bindingClass.capuch.text = cappuch
        }

        generalViewModel.cappuchImage.observe(this) { cappuchImage ->
            bindingClass.imageView.setImageDrawable(cappuchImage)
        }
        generalViewModel.updateCappuch()


        bindingClass.BrewButton.setOnClickListener {
            val intent = Intent(this, Brew::class.java)
            startActivity(intent)
        }
        bindingClass.pour.setOnClickListener {
            val intent = Intent(this, Pour::class.java)
            startActivity(intent)
        }


        val banner = bindingClass.bannerAdView
        banner.setAdUnitId("R-M-2253855-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = com.yandex.mobile.ads.common.AdRequest.Builder().build()

        banner.loadAd(adRequest)
    }
}