package com.example.splashscreen

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import com.example.splashscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


//switcher java
//Switch switcher;
//    boolean nightMode;
//    SharedPreferences sharedPreferences;
//    SharedPreferences.Editor editor;

    //    switcher kt
//    lateinit var switcher: Switch
//    var nightMode: Boolean = false
//    lateinit var sharedPreferences: SharedPreferences
//    lateinit var editor: SharedPreferences.Editor


    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        //switcher java
//        getSupportActionBar().hide();
//
//        switcher=findViewById(R.id.switcher);
//
//        //we used  sharedpref to save mode if exit the app and go back again
//        sharedPreferences=getSharedPreferences("MODE", Context.MODE_PRIVATE);
//
//        nightMODE=sharedPreferences.getBoolean("night",false) //light mode is default
//
//        if (nightMODE){
//            switcher.setChecked(true)
//        }
//
//        switcher.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick (View view){
//                if (nightMode){
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//                    editor=sharedPreferences.edit();
//                    editor.putBoolean("night", false);
//                }else {
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//                    editor=sharedPreferences.edit();
//                    editor.putBoolean("night", true);
//                }
//                editor.apply()
//            }
//
//        });

//switcher kt
//        supportActionBar?.hide()
//
////        setContentView(R.layout.your_layout_name) // replace with your actual layout name
//
//        switcher = findViewById(R.id.switcher) // replace with your actual switcher ID
//
//        // we used sharedpref to save mode if exit the app and go back again
//        sharedPreferences = getSharedPreferences("MODE", Context.MODE_PRIVATE)
//
//        nightMode = sharedPreferences.getBoolean("night", false) // light mode is default
//
//        if (nightMode) {
//            switcher.isChecked = true
//        }
//
//        switcher.setOnClickListener {
//            if (nightMode) {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//                editor = sharedPreferences.edit()
//                editor.putBoolean("night", false)
//            } else {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
//                editor = sharedPreferences.edit()
//                editor.putBoolean("night", true)
//            }
//            editor.apply()
//        }
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
}