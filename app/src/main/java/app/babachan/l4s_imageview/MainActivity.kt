package app.babachan.l4s_imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.api.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://i.pinimg.com/originals/49/9c/bb/499cbbd5bc465b4a5d83afd94e3ed8ab.jpg"
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.load(url)
    }
}