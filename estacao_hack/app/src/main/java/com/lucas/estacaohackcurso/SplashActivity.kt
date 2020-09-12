package com.lucas.estacaohackcurso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {

    // Activity Life Cycle Method called when the app is initialized
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Open LoginActivity after 5 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            // Call LoginActivity
            val loginIntent = Intent(this, LoginActivity::class.java);
            startActivity(loginIntent);
            finish();
        }, 500)
    }
}