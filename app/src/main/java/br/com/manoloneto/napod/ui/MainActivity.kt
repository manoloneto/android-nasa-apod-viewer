package br.com.manoloneto.napod.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import br.com.manoloneto.napod.R

class MainActivity : AppCompatActivity(), ViewContract {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presenter = MainPresenter(this)
        presenter.init()
    }

    override fun showImage(image: String) {
        val img = findViewById<ImageView>(R.id.imgNasa);
        Glide.with(this).load(image).into(img)
    }
}

