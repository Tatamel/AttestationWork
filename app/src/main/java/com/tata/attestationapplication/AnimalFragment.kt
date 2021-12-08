package com.tata.attestationapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.io.RandomAccessFile
import kotlin.random.Random

class AnimalFragment : Fragment() {

    lateinit var animalImageViewStart: ImageView
    lateinit var animalImageViewEnd: ImageView
    lateinit var createButton: Button


    private val animalStartImageList: List<Int> = listOf(
        R.drawable.cow_start,
        R.drawable.deer_start,
        R.drawable.giraffe_start,
        R.drawable.horse_start
    )
    private val animalEndImageList: List<Int> = listOf(
        R.drawable.cow_end,
        R.drawable.deer_end,
        R.drawable.giraffe_end,
        R.drawable.horse_end
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_animal, container, false)

        animalImageViewStart = view.findViewById(R.id.animal_start_image)
        animalImageViewEnd = view.findViewById(R.id.animal_end_image)
        createButton = view.findViewById(R.id.create_button)


        createButton.setOnClickListener {
            animalImageViewStart.setImageResource(animalStartImageList.random())
            animalImageViewEnd.setImageResource(animalEndImageList.random())


        }


        return view
    }


}

