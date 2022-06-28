package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.databinding.Fragment1Binding
import com.example.fragment.databinding.Fragment2Binding


class Fragment2 : Fragment() {

    var _binding:Fragment2Binding? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment2Binding.inflate(layoutInflater)
        val view = binding.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.TextView.setOnClickListener {
            binding.TextView.text = "Hello world this is jay"
        }
        binding.TextView2.setOnClickListener {
            binding.TextView2.text = "Hello world this is Arinjay"
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}