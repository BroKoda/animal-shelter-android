package com.example.application_animal_shelter.ui.residents

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

import com.example.application_animal_shelter.ui.residents.ResidentContent.PlaceholderItem
import com.example.application_animal_shelter.databinding.ResidentItemBinding

class RecyclerViewAdapter(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ResidentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.residentTitle.text = item.title
        holder.residentDesc.text = item.desc
        holder.residentDate.text = item.date
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: ResidentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val residentTitle: TextView = binding.cardTitle
        val residentDesc: TextView = binding.cardDescription
        val residentDate: TextView = binding.cardDate
    }

}