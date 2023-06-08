package com.greenjoyd.baristaschoolav.vm


import android.app.Application
import android.graphics.drawable.Drawable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.greenjoyd.repository.RepositoryInMemory

class GeneralViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = RepositoryInMemory(application)

    private val _americano = MutableLiveData<String>()
    val americano: LiveData<String>
        get() = _americano

    private val _americanoImage = MutableLiveData<Drawable>()
    val americanoImage: LiveData<Drawable>
        get() = _americanoImage

    fun updateAmericano() {
        _americano.value = repository.getDrinkText("americano")
        _americanoImage.value = repository.getDrinkImage("americano")
    }

    private val _cappuch = MutableLiveData<String>()
    val cappuch: MutableLiveData<String>
        get() = _cappuch

    private val _cappuchImage = MutableLiveData<Drawable>()
    val cappuchImage: MutableLiveData<Drawable>
        get() = _cappuchImage

    fun updateCappuch() {
        _cappuch.value = repository.getDrinkText("cappuch")
        _cappuchImage.value = repository.getDrinkImage("cappuch")
    }

    private val _espresso = MutableLiveData<String>()
    val espresso: MutableLiveData<String>
        get() = _espresso

    private val _espressoImage = MutableLiveData<Drawable>()
    val espressoImage: MutableLiveData<Drawable>
        get() = _espressoImage

    fun updateEspresso() {
        _espresso.value = repository.getDrinkText("espresso")
        _espressoImage.value = repository.getDrinkImage("espresso")
    }

    private val _flat = MutableLiveData<String>()
    val flat: MutableLiveData<String>
        get() = _flat

    private val _flatImage = MutableLiveData<Drawable>()
    val flatImage: MutableLiveData<Drawable>
        get() = _flatImage

    fun updateFlat() {
        _flat.value = repository.getDrinkText("flat")
        _flatImage.value = repository.getDrinkImage("flat")
    }

    private val _latte = MutableLiveData<String>()
    val latte: MutableLiveData<String>
        get() = _latte


    private val _latteImage = MutableLiveData<Drawable>()
    val latteImage: MutableLiveData<Drawable>
        get() = _latteImage

    fun updateLatte() {
        _latte.value = repository.getDrinkText("latte")
        _latteImage.value = repository.getDrinkImage("latte")
    }

    private val _raf = MutableLiveData<String>()
    val raf: MutableLiveData<String>
        get() = _raf

    private val _rafImage = MutableLiveData<Drawable>()
    val rafImage: MutableLiveData<Drawable>
        get() = _rafImage

    fun updateRaf() {
        _raf.value = repository.getDrinkText("raf")
        _rafImage.value = repository.getDrinkImage("raf")
    }

    private val _cold = MutableLiveData<String>()
    val cold: MutableLiveData<String>
        get() = _cold

    private val _coldImage = MutableLiveData<Drawable>()
    val coldImage: MutableLiveData<Drawable>
        get() = _coldImage

    fun updateCold() {
        _cold.value = repository.getDrinkText("cold")
        _coldImage.value = repository.getDrinkImage("cold")
    }

    private val _brew = MutableLiveData<String>()
    val brew: LiveData<String>
        get() = _brew

    private val _brewImage = MutableLiveData<Drawable>()
    val brewImage: LiveData<Drawable>
        get() = _brewImage

    fun updateBrew() {
        _brew.value = repository.getDrinkText("brew")
        _brewImage.value = repository.getDrinkImage("brew")
    }

    private val _pour = MutableLiveData<String>()
    val pour: MutableLiveData<String>
        get() = _pour

    private val _pourImage = MutableLiveData<Drawable>()
    val pourImage: MutableLiveData<Drawable>
        get() = _pourImage

    fun updatePour() {
        _pour.value = repository.getDrinkText("pour")
        _pourImage.value = repository.getDrinkImage("pour")
    }

    private val _chemex = MutableLiveData<String>()
    val chemex: MutableLiveData<String>
        get() = _chemex

    private val _chemexImage = MutableLiveData<Drawable>()
    val chemexImage: MutableLiveData<Drawable>
        get() = _chemexImage

    fun updateChemex() {
        _chemex.value = repository.getDrinkText("chemex")
        _chemexImage.value = repository.getDrinkImage("chemex")
    }

    private val _french = MutableLiveData<String>()
    val frecnh: MutableLiveData<String>
        get() = _french

    private val _franchImage = MutableLiveData<Drawable>()
    val franchImage: MutableLiveData<Drawable>
        get() = _franchImage

    fun updateFrench() {
        _french.value = repository.getDrinkText("french")
        _franchImage.value = repository.getDrinkImage("french")
    }

    private val _geyser = MutableLiveData<String>()
    val geyser: MutableLiveData<String>
        get() = _geyser

    private val _geyserImage = MutableLiveData<Drawable>()
    val geyserImage: MutableLiveData<Drawable>
        get() = _geyserImage

    fun updateGeyser() {
        _geyser.value = repository.getDrinkText("geyser")
        _geyserImage.value = repository.getDrinkImage("geyser")
    }

    private val _hario = MutableLiveData<String>()
    val hario: MutableLiveData<String>
        get() = _hario

    private val _harioImage = MutableLiveData<Drawable>()
    val harioImage: MutableLiveData<Drawable>
        get() = _harioImage

    fun updateHario() {
        _hario.value = repository.getDrinkText("hario")
        _harioImage.value = repository.getDrinkImage("hario")
    }

    private val _coffeeMachine = MutableLiveData<String>()
    val coffeeMachine: MutableLiveData<String>
        get() = _coffeeMachine

    private val _coffeeMachineImage = MutableLiveData<Drawable>()
    val coffeeMachineImage: MutableLiveData<Drawable>
        get() = _coffeeMachineImage

    fun updateCoffeeMachine() {
        _coffeeMachine.value = repository.getDrinkText("coffeeMachine")
        _coffeeMachineImage.value = repository.getDrinkImage("coffeeMachine")
    }

    private val _bumble = MutableLiveData<String>()
    val bumble: MutableLiveData<String>
        get() = _bumble

    private val _bumbleImage = MutableLiveData<Drawable>()
    val bumbleImage: MutableLiveData<Drawable>
        get() = _bumbleImage

    fun updateBumble() {
        _bumble.value = repository.getDrinkText("bumble")
        _bumbleImage.value = repository.getDrinkImage("bumble")
    }

    private val _rosemary = MutableLiveData<String>()
    val rosemary: MutableLiveData<String>
        get() = _rosemary

    private val _rosemaryImage = MutableLiveData<Drawable>()
    val rosemaryImage: MutableLiveData<Drawable>
        get() = _rosemaryImage

    fun updateRosemary() {
        _rosemary.value = repository.getDrinkText("rosemary")
        _rosemaryImage.value = repository.getDrinkImage("rosemary")
    }
}