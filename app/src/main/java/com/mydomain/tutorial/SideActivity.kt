package com.mydomain.tutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.util.Log
import kotlinx.android.synthetic.main.activity_side.*

class SideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side)

        val login = intent.getStringExtra("log") // Recebendo a matricula da tela anterior
        val password = intent.getStringExtra("psw") // Recebendo a senha da tela anterior

        setupViewPager()

        setupBottomNavigationView()
    }

    private fun setupBottomNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener { menu ->

            when (menu.itemId) {

                R.id.home -> {
                    viewPager.setCurrentItem(MenuAdapter.home, true)
                }

                R.id.contacts -> {
                    viewPager.setCurrentItem(MenuAdapter.contacts, true)
                }

                R.id.backup -> {
                    viewPager.setCurrentItem(MenuAdapter.backup, true)
                }

                else -> {
                    Log.d("TAG", "Alguma outra coisa foi clicada!")
                }

            }
            true
        }

    }

    private fun setupViewPager() {
        viewPager.adapter = MenuAdapter(supportFragmentManager)

        viewPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                val menu = bottomNavigationView.menu.getItem(position)
                bottomNavigationView.selectedItemId = menu.itemId
            }

        })
    }
}
