package com.filzah.kade_module1

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item.view.*

class RecyclerViewAdapter (private val context: Context, private val items: List<Item>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer{

        //private val name = view.findViewById<TextView>(R.id.name)
        //private val image = view.findViewById<ImageView>(R.id.image)

        fun bindItem(items: Item) {
//            name.text = items.name
//            items.image.let { Picasso.get().load(it).into(image) }

            itemView.item_nama.text = items.name
            items.image.let { Picasso.get().load(it).into(itemView.item_image) }
        }
    }

    interface LayoutContainer {

    }


}