package com.example.splashscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class MyFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val networkService = NetworkService()

        // Example: Make a network request when a button is clicked
        view.findViewById<Button>(R.id.button).setOnClickListener {
            val wordToSearch = "ugali"  // Replace with the word you want to search
            val meaning = networkService.defineWord(wordToSearch)

            // Update UI (assuming you have a TextView with id 'textView')
            view.findViewById<TextView>(R.id.textView).text = meaning
        }
    }
}
