package app.miki.mikiso.profileimageview

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.api.load
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://life-is-tech.com/materials/images/logo-square.png"
        val ImageView = findViewById<ImageView>(R.id.imageView)

        imageView.load(url)
    }
}