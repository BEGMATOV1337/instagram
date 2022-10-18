package com.dev.instagramuz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter3 : RecyclerView.Adapter<RecyclerAdapter3.ViewHolder>() {

    val image = arrayOf(
        R.drawable.img_11,
        R.drawable.img_8,
        R.drawable.img_11,
        R.drawable.img_9,
        R.drawable.photo_begmatov,
        R.drawable.img_12,
        R.drawable.img_8,
        R.drawable.img_11,
        R.drawable.photo_begmatov,
        R.drawable.img_9,
        R.drawable.img_8,
        R.drawable.img_11,
        R.drawable.img_9,
        R.drawable.img_12,
        R.drawable.photo_begmatov,
        R.drawable.img_11,
        R.drawable.img_12,
        R.drawable.img_11,
        R.drawable.img_8,
        R.drawable.img_12,
        R.drawable.photo_begmatov,
        R.drawable.img_11,
        R.drawable.img_9,
        R.drawable.img_12,
        R.drawable.photo_begmatov,
        R.drawable.img_8,
        R.drawable.photo_begmatov,
        R.drawable.img_11,
        R.drawable.img_9,
        R.drawable.img_12,
        R.drawable.photo_begmatov,
        R.drawable.img_11,
        R.drawable.img_9,


    )


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val itemImage: ImageView


        init {
            itemImage = itemView.findViewById(R.id.image)


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itemlayout3, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemImage.setImageResource(image[position])


    }

    override fun getItemCount(): Int {
        return image.size
    }

}