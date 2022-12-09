package com.example.progra32022.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.progra32022.R
import com.example.progra32022.databinding.FragmentBasicBinding

class BasicFragment : Fragment() {

    private var nombre: String? = null
    private var hobie: String? = null

    private var _binding: FragmentBasicBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            nombre = it.getString(NAME_PARAM)
            hobie = it.getString(HOBIE_PARAM)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBasicBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onStart() {
        super.onStart()

        binding.textViewName.text = nombre.orEmpty()
        binding.textViewHobie.text = hobie.orEmpty()
    }

    companion object {
        const val NAME_PARAM = "nombre"
        const val HOBIE_PARAM = "hobie"

        @JvmStatic
        fun newInstance(nombre: String, param2: String) =
            BasicFragment().apply {
                arguments = Bundle().apply {
                    putString(NAME_PARAM, nombre)
                    putString(HOBIE_PARAM, hobie)
                }
            }
    }
}