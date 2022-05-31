package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMain2Binding
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("ACTIVITY 2:", "CREATED2")

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener {
            //toggling between activities
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            //finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("ACTIVITY 2:", "STARTED2")
        //Toast.makeText(applicationContext, "STARTED2", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("ACTIVITY 2:", "RESUMED2")
        //Toast.makeText(applicationContext, "RESUMED2", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("ACTIVITY 2:", "PAUSED2")
        //Toast.makeText(applicationContext, "PAUSED2", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Log.d("ACTIVITY 2:", "STOPPED2")
        //Toast.makeText(applicationContext, "STOPPED2", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ACTIVITY 2:", "DESTROYED2")
        //Toast.makeText(applicationContext, "DESTROYED2", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("ACTIVITY 2:", "RESTARTED2")
        //Toast.makeText(applicationContext, "RESTARTED2", Toast.LENGTH_SHORT).show()
    }
}