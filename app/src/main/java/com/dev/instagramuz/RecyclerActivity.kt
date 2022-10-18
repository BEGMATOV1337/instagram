package com.dev.instagramuz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    lateinit var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
    lateinit var adapter2: RecyclerView.Adapter<RecyclerAdapter2.ViewHolder>
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val recycler = findViewById<RecyclerView>(R.id.recyclerView)
        val recycler2 = findViewById<RecyclerView>(R.id.recyclerView2)

        adapter = RecyclerAdapter()
        adapter2 = RecyclerAdapter2()

        recycler2.adapter = adapter2
        recycler.adapter = adapter
    }
}