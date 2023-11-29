package com.example.splashscreen

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.fragment.findNavController
import com.example.splashscreen.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ThirdFragment : Fragment() {

    //    switcher kt
    lateinit var switcher: Switch
    var nightMode: Boolean = false
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor



    private var _binding: FragmentThirdBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_FirstFragment)
        }

        binding.buttonThird.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_SecondFragment)
        }


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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}