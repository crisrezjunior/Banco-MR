package com.rezende.bancomr

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rezende.bancomr.databinding.ActivitySaldoBinding

class Saldo : AppCompatActivity() {
    lateinit var    binding: ActivitySaldoBinding
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivitySaldoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //esconder Action Bar
        supportActionBar!!.hide()

        val toolbar = binding.toolbarSaldo
        toolbar.title= "Saldo"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(175,0,100,0)
        toolbar.setBackgroundColor(getColor(R.color.background_menu))
        toolbar.navigationIcon = getDrawable(R.drawable.ic_baseline_arrow_back_ios_new_24)
        toolbar.setNavigationOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }


    }
}