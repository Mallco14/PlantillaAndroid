package tecsp.edu.eccomerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ProgressBar
import android.widget.TextView
import tecsp.edu.eccomerce.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var  binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intent = Intent(this,LoginActivity::class.java).apply {

        }
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(intent);
            finish()},3000)
    }


}
