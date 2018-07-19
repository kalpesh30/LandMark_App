package com.example.kalpesh.landmarkapp

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var landMarkList = ArrayList<String>()
        landMarkList.add("Effil Tower")
        landMarkList.add("Los Angles")
        landMarkList.add("Statue of Liberty")
        landMarkList.add("Switzerland")
        landMarkList.add("TowerOfPisa")

        val pisa = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.pisa)
        val stlib = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.statue_of_liberty_7)
        val effil = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.effiltower)
        val switz = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.switz)
        val losang = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.los_angeles)


        var landmarkImages = ArrayList<Bitmap>()
        landmarkImages.add(effil)
        landmarkImages.add(losang)
        landmarkImages.add(stlib)
        landmarkImages.add(switz)
        landmarkImages.add(pisa)


        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, landMarkList)
        lv_Landmark.adapter = arrayAdapter

        lv_Landmark.onItemClickListener = AdapterView.OnItemClickListener { adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->

            val intent = Intent(applicationContext, DetailActivity::class.java)
            intent.putExtra("name", landMarkList[i])

            val Bitmap = landmarkImages[i]
            var choice:GlobalBitmap.chooseImg = GlobalBitmap.chooseImg
            choice.selectedImage = Bitmap
            startActivity(intent)
        }
    }
}
