package com.example.splashscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.splashscreen.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Access and set images and descriptions
        binding.image1.setImageResource(R.drawable.muratina)
        binding.img1lang1.text = "Description 1 in Language 1"

        // Repeat the above for Image 2, Image 3, and Image 4

        binding.image2.setImageResource(R.drawable.githeri)
        binding.img2lang1.text = "Description 2 in Language 2"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
}