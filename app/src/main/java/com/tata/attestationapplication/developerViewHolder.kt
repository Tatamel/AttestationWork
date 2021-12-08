package com.tata.attestationapplication

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class developerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val developerImageView: ImageView = itemView.findViewById(R.id.developer_image_view)
    private val developerTextView: TextView = itemView.findViewById(R.id.developer_name_text_view)
    fun bind(developer: Developers) {
        developerTextView.text = developer.name
        developerImageView.setImageResource(developer.image)

    }
}
