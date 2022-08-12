package com.rezende.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rezende.bancomr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saldo.setOnClickListener {

            //Acessar outra activity
        var intent = Intent(this, Saldo::class.java)
            startActivity(intent)

        }

        binding.faturas.setOnClickListener {
            var intent = Intent(this, Fatura::class.java)
            startActivity(intent)

        }
        binding.transferencia.setOnClickListener{
            var intent = Intent(this, Transferencia::class.java)
            startActivity(intent)

        }

        binding.poupanca.setOnClickListener{
            var intent = Intent(this, Poupanca::class.java)
            startActivity(intent)

        }

    }
}