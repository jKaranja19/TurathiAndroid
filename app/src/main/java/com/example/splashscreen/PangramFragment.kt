package com.example.splashscreen
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.splashscreen.databinding.FragmentPangramBinding

class PangramFragment : Fragment() {

    private var _binding: FragmentPangramBinding? = null
    private val binding get() = _binding!!

    private var letterAssembly: String = ""
    private var wordOfTheDay: String = "EXAMPLE"
    private var hint: String = "This is a hint for the word of the day"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPangramBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up the initial UI components
        binding.textViewHint.text = hint

        // Set up the letter tiles
        val letters = wordOfTheDay.toCharArray()
        for (letter in letters) {
            val button = Button(requireContext())
            button.text = letter.toString()
            // Add button to the layout
            binding.layoutLetterTiles.addView(button)
        }

        // Set up shuffle button
        binding.buttonShuffle.setOnClickListener {
            // Shuffle the letters in the assembly line
            // For example:
            // letterAssembly = letterAssembly.shuffle()
            // Update UI to reflect the shuffled letters
            // For example:
            // binding.textViewLetterAssembly.text = letterAssembly
        }

        // Set up delete button
        binding.buttonDelete.setOnClickListener {
            // Delete the last letter from the assembly line
            // For example:
            // if (letterAssembly.isNotEmpty()) {
            //     letterAssembly = letterAssembly.dropLast(1)
            //     Update UI to reflect the deleted letter
            //     For example:
            //     binding.textViewLetterAssembly.text = letterAssembly
            // }
        }

        // Set up submit button
        binding.buttonSubmit.setOnClickListener {
            // Validate the word formed by the assembly line with the word of the day
            val isCorrect = letterAssembly == wordOfTheDay
            if (isCorrect) {
                // Handle correct answer
            } else {
                // Handle incorrect answer
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
