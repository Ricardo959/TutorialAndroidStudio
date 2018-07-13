package com.mydomain.tutorial

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.util.Log
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG", "on create")

        loginConfig()
    }

    override fun onStart() {
        super.onStart()

        Log.d("TAG", "on start")
    }

    override fun onResume() {
        super.onStart()

        Log.d("TAG", "on resume")
    }

    override fun onPause() {
        super.onStart()

        Log.d("TAG", "on pause")
    }

    private fun loginConfig() {
        loginBtn.setOnClickListener {

            /*
            val (visible, response) = if (loginTxt.visibility == View.VISIBLE) {
                Pair(View.GONE, R.string.mainBtnLogout)
            } else {
                Pair(View.VISIBLE, R.string.mainBtn)
            }

            loginTxt.visibility = visible
            loginEdt.visibility = visible
            loginBtn.text = getString(response)
            passwordTxt.visibility = visible
            passwordEdt.visibility = visible
            */

            val extraBundle = Bundle()

            extraBundle.putString("log", loginEdt.text.toString()) // Colocando a matricula no 'Bundle'para envio para a tela secundaria
            extraBundle.putString("psw", passwordEdt.text.toString()) // Colocando a senha no 'Bundle'para envio para a tela secundaria

            val intentSideActivity = Intent(this, SideActivity::class.java) // Objeto de inicializacao da tela secundaria

            intentSideActivity.putExtras(extraBundle) // Anexando o bundle a inicializacao da tela secundaria

            startActivity(intentSideActivity) // Iniciando a tela secundaria
        }
    }

}
