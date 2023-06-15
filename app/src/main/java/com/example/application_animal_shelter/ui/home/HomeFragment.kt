package com.example.application_animal_shelter.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.application_animal_shelter.R
import com.example.application_animal_shelter.databinding.FragmentHomeBinding
import com.example.application_animal_shelter.ui.news.NewsFragment
import com.example.application_animal_shelter.ui.residents.ResidentsFragment

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        view?.findViewById<Button?>(R.id.button_news)?.setOnClickListener {
            val fragment = NewsFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_home, fragment)?.commit()
        }

        view?.findViewById<Button?>(R.id.button_residents)?.setOnClickListener {
            val fragment = ResidentsFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_home, fragment)?.commit()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}