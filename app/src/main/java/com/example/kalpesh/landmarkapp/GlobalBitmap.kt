package com.example.kalpesh.landmarkapp

import android.graphics.Bitmap

class GlobalBitmap {

    companion object chooseImg {
        var selectedImage:Bitmap? = null
        fun chosenImage():Bitmap {
            return selectedImage!!
        }
    }

}