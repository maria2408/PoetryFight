package com.mycompany.poetryfight.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HelpViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Добро пожаловать!"
    }
    val text: LiveData<String> = _text

    private val _text2 = MutableLiveData<String>().apply {
        value = "Вдохните новую жизнь старым стихотворениям!"
    }
    val text2: LiveData<String> = _text2

    private val _text3 = MutableLiveData<String>().apply {
        value = "Чтобы начать сочинять стихи перейдите во вкладку Игра"
    }
    val text3: LiveData<String> = _text3
}
