package com.sopt.sopkathon_aos

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.sopt.sopkathon_aos.MainActivity
import com.sopt.sopkathon_aos.R
import com.sopt.sopkathon_aos.arinming.HomeActivity
import com.sopt.sopkathon_aos.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val animationView: LottieAnimationView = findViewById(R.id.vv_splash)
        animationView.setAnimation("video_splash.json")
        animationView.playAnimation()

        // 8초 후 메인 액티비티로 전환
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 8000) // 8000 milliseconds = 8 seconds
    }
}
