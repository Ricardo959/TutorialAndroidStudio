package com.mydomain.tutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_side.*

class SideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side)

        val login = intent.getStringExtra("log") // Recebendo a matricula da tela anterior
        val password = intent.getStringExtra("psw") // Recebendo a senha da tela anterior

        setupBottomNavigationView()
    }

    private fun setupBottomNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener { menu ->

            when (menu.itemId) {

                R.id.home -> {
                    true
                }

                R.id.contacts -> {
                    true
                }

                R.id.backup -> {
                    true
                }

                else -> {
                    true
                }

            }
        }
    }
}
