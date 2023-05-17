package com.greenjoyd.baristaschoolav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greenjoyd.baristaschoolav.databinding.ActivityAdsSupportBinding
import com.yandex.mobile.ads.banner.AdSize

import com.yandex.mobile.ads.interstitial.InterstitialAd
import com.yandex.mobile.ads.common.AdRequest
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
import com.yandex.mobile.ads.common.AdRequestError
import com.yandex.mobile.ads.common.ImpressionData


class Ads : AppCompatActivity() {

    private var mInterstitialAd: InterstitialAd? = null

    lateinit var bindingClass : ActivityAdsSupportBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityAdsSupportBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        mInterstitialAd = InterstitialAd(this) // создание экземпляра объекта рекламы
        mInterstitialAd!!.setAdUnitId(AdUnitId)
        val adRequest = AdRequest.Builder().build() // построение и подготовка для показа
        mInterstitialAd!!.setInterstitialAdEventListener(object : InterstitialAdEventListener { //слушатель для различных событий показа полноэкранной рекламы
            override fun onAdLoaded() {
                mInterstitialAd!!.show()
            }

            override fun onAdFailedToLoad(adRequestError: AdRequestError) {}
            override fun onAdShown() {}
            override fun onAdDismissed() {}
            override fun onAdClicked() {}
            override fun onLeftApplication() {}
            override fun onReturnedToApplication() {}
            override fun onImpression(impressionData: ImpressionData?) {}
        })
        mInterstitialAd!!.loadAd(adRequest) //показ полноэкранной рекламы


        val banner1 = bindingClass.bannerAdView1
        banner1.setAdUnitId("R-M-2253855-1")
        banner1.setAdSize(AdSize.BANNER_320x50)

        val adRequest1 = AdRequest.Builder().build()

        banner1.loadAd(adRequest1)

        val banner2 = bindingClass.bannerAdView2
        banner2.setAdUnitId("R-M-2253855-1")
        banner2.setAdSize(AdSize.BANNER_320x50)

        val adRequest2 = AdRequest.Builder().build()

        banner2.loadAd(adRequest2)
    }
    companion object {
        private const val AdUnitId = "R-M-2253855-3" // содержит уникальный ID полноэкранной рекламы созданной в личном кабинете рекламной сети Яндекса
    }
}
