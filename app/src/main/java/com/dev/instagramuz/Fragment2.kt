package com.dev.instagramuz

import android.media.session.MediaController
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Fragment2 : Fragment() {


    lateinit var adapter3: RecyclerView.Adapter<RecyclerAdapter3.ViewHolder>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recycler3 = requireActivity().findViewById<RecyclerView>(R.id.recyclerView3)
        adapter3 = RecyclerAdapter3()
        recycler3.adapter = adapter3

    }

    companion object {
        @JvmStatic
        fun newInstance()=
            Fragment2()
            }
    }
