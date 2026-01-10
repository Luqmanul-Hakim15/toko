package com.example.toko

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HomeCustomerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_customer)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, HomeCustomerFragment())
                .commit()
        }
    }
}