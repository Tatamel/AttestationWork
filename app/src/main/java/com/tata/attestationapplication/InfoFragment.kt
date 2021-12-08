package com.tata.attestationapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InfoFragment : Fragment() {

    lateinit var developersRecyclerView: RecyclerView
    val developerList: List<Developers> =
        listOf(
            Developers("Tata", R.drawable.tata_mel),
            Developers("Anatoly Rip", R.drawable.anatoly_rip),
            Developers("Iggy", R.drawable.iggy_driggy)

        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_info, container, false)

        developersRecyclerView = view.findViewById(R.id.devepers_recycler_view)
        developersRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        developersRecyclerView.adapter = DeveloperAdapter(developerList)

        return view
    }


}