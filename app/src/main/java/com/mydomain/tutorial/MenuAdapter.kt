package com.mydomain.tutorial

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MenuAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    companion object {
        val home = 0
        val contacts = 1
        val backup = 2
    }

    override fun getItem(position: Int): android.support.v4.app.Fragment {

        return when(position) {
            home        -> MyFragment()
            contacts    -> MyFragment()
            backup      -> MyFragment()
            else        -> MyFragment()
        }

    }

    override fun getCount(): Int {
        return 3
    }

}