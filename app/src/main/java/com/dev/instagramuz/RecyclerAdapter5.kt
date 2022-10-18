package com.dev.instagramuz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter5 : RecyclerView.Adapter<RecyclerAdapter5.ViewHolder>() {

    val image = arrayOf(
        R.drawable.img_9,
        R.drawable.img_8,
        R.drawable.img_8,
        R.drawable.img_11,
        R.drawable.img_12,
        R.drawable.img_12,
        R.drawable.img_12,
        R.drawable.img_9,
        R.drawable.img_9,
        R.drawable.img_8,
        R.drawable.img_8,
        R.drawable.img_11,
        R.drawable.img_12,
        R.drawable.img_12,
        R.drawable.img_12,
        R.drawable.img_9,
        R.drawable.img_9,
        R.drawable.img_1,
        R.drawable.img_1,
        R.drawable.img_1,

    )

    val name = arrayOf(
        "Temirov_47",
        "Temirov_47",
        "Temirov_47",
        "Temirov_47",
        "Obidov47",
        "Obidov47",
        "Your story",
        "Oyatillo1337",
        "Oyatillo1337",
        "Temirov_47",
        "Temirov_47",
        "Temirov_47",
        "Obidov47",
        "Obidov47",
        "Obidov47",
        "_Latipov.1",
        "_Akhmadillo",
        "_Akhmadillo",


    )

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val itemImage: ImageView
        val itemName : TextView

        init {
            itemImage =  itemView.findViewById(R.id.image)
            itemName =  itemView.findViewById(R.id.name)

            itemView.setOnClickListener {
                val position : Int  = adapterPosition
                Toast.makeText(itemView.context, "${name[position]}", Toast.LENGTH_SHORT).show()

            }
        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itemlayout5,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemImage.setImageResource(image[position])
        holder.itemName.text = name[position]


    }

    override fun getItemCount(): Int {
        return name.size
    }

}