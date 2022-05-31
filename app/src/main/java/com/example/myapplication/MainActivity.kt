package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.e("MAIN ACTIVITY:", "CREATED")
        //Toast.makeText(applicationContext , "MAIN ACTIVITY CREATED", Toast.LENGTH_SHORT).show()

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show()
            //toggling between activities
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            //finish()
        }
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

    // Called when the activity is about to become visible.
    override fun onStart() {
        super.onStart()
        Log.e("MAIN ACTIVITY:", "STARTED")
        //Toast.makeText(applicationContext, "MAIN ACTIVITY STARTED",Toast.LENGTH_SHORT).show()
    }

    // Called when the activity has become visible.
    override fun onResume() {
        super.onResume()
        Log.e("MAIN ACTIVITY:", "RESUMED")
        //Toast.makeText(applicationContext, "MAIN ACTIVITY: RESUMED",Toast.LENGTH_SHORT).show()
    }

    // Called when another activity is taking focus.
    override fun onPause() {
        super.onPause()
        Log.e("MAIN ACTIVITY:", "PAUSED")
        //Toast.makeText(applicationContext, "MAIN ACTIVITY: PAUSED",Toast.LENGTH_SHORT).show()
    }

    // Called when the activity is no longer visible.
    override fun onStop() {
        super.onStop()
        Log.e("MAIN ACTIVITY:", "STOPPED")
        //Toast.makeText(applicationContext, "MAIN ACTIVITY: STOPPED",Toast.LENGTH_SHORT).show()
    }

    // Called just before the activity is destroyed.
    override fun onDestroy() {
        super.onDestroy()
        Log.e("MAIN ACTIVITY:", "DESTROYED")
        //Toast.makeText(applicationContext, "MAIN ACTIVITY: DESTROYED",Toast.LENGTH_SHORT).show()
    }

    // Called when the activity is about to become visible after it was stopped.
    override fun onRestart() {
        super.onRestart()
        Log.e("MAIN ACTIVITY:", "RESTARTED")
        //Toast.makeText(applicationContext, "MAIN ACTIVITY: RESTARTED",Toast.LENGTH_SHORT).show()
    }
}