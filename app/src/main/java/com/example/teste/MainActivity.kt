package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView
        checkBox
        checkBox.setOnClickListener(this)

    }

    override fun onClick(view: View) {

        if (checkBox.isChecked) {
             imageView.setColorFilter(resources.getColor(R.color.vermelho))

        } else {
            imageView.setColorFilter(resources.getColor(R.color.black))
        }

    }


}