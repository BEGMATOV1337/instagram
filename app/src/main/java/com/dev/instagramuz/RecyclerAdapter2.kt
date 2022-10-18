package com.dev.instagramuz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter2 : RecyclerView.Adapter<RecyclerAdapter2.ViewHolder>() {

    val image = arrayOf(
        R.drawable.img_9,
        R.drawable.img_8,
        R.drawable.img_11,
        R.drawable.img_12,
        R.drawable.img_9,
        R.drawable.img_1,

    )

    val name = arrayOf(
        "1.Begmatov_",
        "Oyatillo_1337",
        "1.Temirov_47",
        "Obidov47",
        "_Latipov.1",
        "_Akhmadillo",

    )
    val subTitle = arrayOf(
        "BEGMATOV DEVOLOPER",
        "KENZY SILA",
        "ROLEX SILA",
        "YAKUTO SILA",
        "LATIPOV TOP",
        "AKHMADILLO DEVOLOPER",

        )


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val itemImage: ImageView
        val itemImagee: ImageView
        val itemImageee: ImageView
        val itemName : TextView
        val itemSubTitle : TextView

        init {
            itemImage =  itemView.findViewById(R.id.image)
            itemImagee =  itemView.findViewById(R.id.image2)
            itemImageee =  itemView.findViewById(R.id.image3)
            itemName =  itemView.findViewById(R.id.name)
            itemSubTitle =  itemView.findViewById(R.id.sub_title)

            itemView.setOnClickListener {
                val position : Int  = adapterPosition
                Toast.makeText(itemView.context, "${name[position]}", Toast.LENGTH_SHORT).show()

            }
        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itemlayout2,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemImage.setImageResource(image[position])
        holder.itemImagee.setImageResource(image[position])
        holder.itemImageee.setImageResource(image[position])
        holder.itemName.text = name[position]
        holder.itemSubTitle.text = subTitle[position]

    }

    override fun getItemCount(): Int {
        return name.size
    }

}