package com.example.splashscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.splashscreen.databinding.FragmentLingosBinding
import com.example.splashscreen.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class LingosFragment : Fragment() {

    private var _binding: FragmentLingosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLingosBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonKikuyu.setOnClickListener {
            findNavController().navigate(R.id.action_LingosFragment_to_CategoriesFragment)
        }

        binding.buttonDholuo.setOnClickListener {
            findNavController().navigate(R.id.action_LingosFragment_to_CategoriesFragment)
        }

//        later change destination to categories
        binding.buttonSomali.setOnClickListener {
            findNavController().navigate(R.id.action_LingosFragment_to_ThirdFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}