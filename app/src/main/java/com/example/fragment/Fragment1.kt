package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.databinding.Fragment1Binding


class Fragment1 : Fragment() {

    var _binding: Fragment1Binding? = null
    val  binding get()  = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = Fragment1Binding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding!!.Textview1.setOnClickListener{
            binding!!.Textview1.text = "Hii.. Hello world"
        }
        binding!!.Textview2.setOnClickListener {
            binding!!.Textview2.text = "Hii there"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}