package com.elliottsoftware.hackathongame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.elliottsoftware.hackathongame.databinding.ActivityMainBinding

//GameActivity ,AppCompatActivity
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mView: GL2JNIView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        mView = GL2JNIView(this)
//        mView.hashCode()

        // Example of a call to a native method
//        binding.sampleText.text = stringFromJNI()
        GL2NILib.init()

        setContentView(mView)


    }





    override fun onPause() {
        super.onPause()
        mView.onPause()
    }

    override fun onResume() {
        super.onResume()
        mView.onResume()
    }

}