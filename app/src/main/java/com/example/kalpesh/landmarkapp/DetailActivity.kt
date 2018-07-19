package com.example.kalpesh.landmarkapp

import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var intent = intent
        textView.text = intent.getStringExtra("name") ;

        var choice = GlobalBitmap.chooseImg
        var landmarkImg:Bitmap = choice.chosenImage()
        imageView.setImageBitmap(landmarkImg);




    }

}
