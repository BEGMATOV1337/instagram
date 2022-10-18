package com.dev.instagramuz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Fragment1 : Fragment() {

    lateinit var adapter2: RecyclerView.Adapter<RecyclerAdapter2.ViewHolder>
    lateinit var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler2 = requireActivity().findViewById<RecyclerView>(R.id.recyclerView2)
        val recycler = requireActivity().findViewById<RecyclerView>(R.id.recyclerView)

        adapter = RecyclerAdapter()
        adapter2 = RecyclerAdapter2()
        recycler2.adapter = adapter2
        recycler.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = Fragment1()
    }
}
