package com.rezende.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rezende.bancomr.databinding.ActivityTransferenciaBinding

class Transferencia : AppCompatActivity() {
    lateinit var binding: ActivityTransferenciaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTransferenciaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.transferenciaToolbar
        toolbar.title = "Transferencias"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(115, 0, 100, 0)
        toolbar.setBackgroundColor(getColor(R.color.background_menu))
        toolbar.navigationIcon = getDrawable(R.drawable.ic_baseline_arrow_back_ios_new_24)
        toolbar.setNavigationOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    }
