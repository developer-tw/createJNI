package com.sqtek.createjni

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.sqtek.nativejnilib.NativeLib

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test_API = NativeLib()
        System.out.println(test_API.stringFromJNI())
        System.out.println(test_API.addTwoNum(10, 20))
        val text = findViewById<TextView>(R.id.title)
        text.text = test_API.stringFromJNI()
    }
}