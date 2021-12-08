package com.tata.attestationapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DeveloperAdapter(private val developerList: List<Developers>) : RecyclerView.Adapter<developerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): developerViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.developer_list_item, parent, false)
        return developerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: developerViewHolder, position: Int) {
        val developer = developerList[position]
        holder.bind(developer)
    }

    override fun getItemCount(): Int {
        return developerList.size
    }
}