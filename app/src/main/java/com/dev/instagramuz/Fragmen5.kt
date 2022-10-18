package com.dev.instagramuz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Fragmen5 : Fragment() {


    lateinit var adapter5: RecyclerView.Adapter<RecyclerAdapter5.ViewHolder>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_5, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recycler5 = requireActivity().findViewById<RecyclerView>(R.id.recyclerView5)
        adapter5 = RecyclerAdapter5()
        recycler5.adapter = adapter5
    }
    companion object {
        @JvmStatic
        fun newInstance()=
            Fragmen5()
            }
    }
