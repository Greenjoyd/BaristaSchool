package com.greenjoyd.baristaschoolav.season

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.greenjoyd.baristaschoolav.Brew
import com.greenjoyd.baristaschoolav.databinding.ActivityRafBinding
import com.greenjoyd.baristaschoolav.Pour
import com.greenjoyd.baristaschoolav.vm.GeneralViewModel
import com.yandex.mobile.ads.banner.AdSize

class Raf : AppCompatActivity() {
    lateinit var generalViewModel: GeneralViewModel
    lateinit var bindingClass: ActivityRafBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)
        bindingClass = ActivityRafBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        generalViewModel.raf.observe(this){raf ->
            bindingClass.rafTV.text = raf
        }
        generalViewModel.rafImage.observe(this){rafImage ->
            bindingClass.imageView.setImageDrawable(rafImage)
        }
        generalViewModel.updateRaf()

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