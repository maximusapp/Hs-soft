package com.example.hssoft.presentation.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

fun AppCompatActivity.supportFragmentTransaction(init: FragmentTransaction.() -> Unit) {
    if (!isFinishing) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.init()
        transaction.commit()
    }
}