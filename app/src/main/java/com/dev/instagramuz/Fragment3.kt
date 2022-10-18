package com.dev.instagramuz

import android.media.session.MediaController
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Fragment3 : Fragment() {


    lateinit var adapter4: RecyclerView.Adapter<RecyclerAdapter4.ViewHolder>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        return inflater.inflate(R.layout.fragment_3, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recycler3 = requireActivity().findViewById<RecyclerView>(R.id.recyclerView4)
        adapter4 = RecyclerAdapter4()
        recycler3.adapter = adapter4


    }

    companion object {
        @JvmStatic
        fun newInstance()=
            Fragment2()
    }
}
