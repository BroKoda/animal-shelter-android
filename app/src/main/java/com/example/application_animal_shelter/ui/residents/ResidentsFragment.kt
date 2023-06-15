package com.example.application_animal_shelter.ui.residents

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.application_animal_shelter.R

class ResidentsFragment : Fragment() {

    companion object {
        fun newInstance() = ResidentsFragment()
    }

    private lateinit var viewModel: ResidentsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_residents, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ResidentsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}