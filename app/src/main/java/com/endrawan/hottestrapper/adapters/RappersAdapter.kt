package com.endrawan.hottestrapper.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.endrawan.hottestrapper.R
import com.endrawan.hottestrapper.models.Rapper
import kotlinx.android.synthetic.main.item_linear_rapper.view.*

class RappersAdapter(private val rappers: List<Rapper>, private val rapperEvent: RapperEvent) :
    RecyclerView.Adapter<RappersAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_linear_rapper, parent, false)
        return ViewHolder(
            inflater,
            rapperEvent
        )
    }

    override fun getItemCount(): Int = rappers.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(rappers[position], rapperEvent)
    }

    class ViewHolder(itemView: View, rapperEvent: RapperEvent) : RecyclerView.ViewHolder(itemView) {

        val image = itemView.item_rapper_image
        val name = itemView.item_rapper_name
        val desc = itemView.item_rapper_desc

        fun bindView(rapper: Rapper, rapperEvent: RapperEvent) {
            Glide.with(itemView.context).load(rapper.imageUrl).centerCrop().into(image)
            name.text = rapper.name
            desc.text = rapper.desc

            itemView.setOnClickListener {
                rapperEvent.onClicked(rapper)
            }
        }

    }

    interface RapperEvent {
        fun onClicked(rapper: Rapper)
    }

}