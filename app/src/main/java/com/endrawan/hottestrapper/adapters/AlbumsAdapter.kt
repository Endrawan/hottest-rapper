package com.endrawan.hottestrapper.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.endrawan.hottestrapper.R
import com.endrawan.hottestrapper.models.Album
import kotlinx.android.synthetic.main.item_linear_album.view.*

class AlbumsAdapter(private val albums: List<Album>) :
    RecyclerView.Adapter<AlbumsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_linear_album, parent, false)
        return ViewHolder(
            inflater
        )
    }

    override fun getItemCount(): Int = albums.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(albums[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image = itemView.item_album_image
        val title = itemView.item_album_title
        val year = itemView.item_album_year

        fun bindView(album: Album) {
            Glide.with(itemView.context).load(album.imageUrl).centerCrop().into(image)
            title.text = album.title
            year.text = album.year.toString()
        }

    }

}