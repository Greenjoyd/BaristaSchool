package com.greenjoyd.baristaschoolav


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.greenjoyd.baristaschoolav.databinding.ActivityCoffeeMachineBinding
import com.greenjoyd.baristaschoolav.vm.GeneralViewModel
import com.yandex.mobile.ads.banner.AdSize

class CoffeeMachine : AppCompatActivity() {
    lateinit var generalViewModel: GeneralViewModel
    lateinit var bindingClass: ActivityCoffeeMachineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        generalViewModel = ViewModelProvider(this).get(GeneralViewModel::class.java)
        bindingClass = ActivityCoffeeMachineBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        generalViewModel.coffeeMachine.observe(this){coffeeMachine ->
            bindingClass.textView3.text = coffeeMachine
        }
        generalViewModel.coffeeMachineImage.observe(this){coffeeMachineImage ->
            bindingClass.coffeescheme.setImageDrawable(coffeeMachineImage)
        }
        generalViewModel.updateCoffeeMachine()

        val banner = bindingClass.bannerAdView
        banner.setAdUnitId("R-M-2253855-1")
        banner.setAdSize(AdSize.BANNER_320x50)

        val adRequest = com.yandex.mobile.ads.common.AdRequest.Builder().build()

        banner.loadAd(adRequest)

    }
}