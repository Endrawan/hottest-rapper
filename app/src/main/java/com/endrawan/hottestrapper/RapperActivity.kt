package com.endrawan.hottestrapper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.endrawan.hottestrapper.adapters.AlbumsAdapter
import com.endrawan.hottestrapper.models.Rapper
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_rapper.*

class RapperActivity : AppCompatActivity() {

    private lateinit var rapper: Rapper
    private val gson = Gson()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rapper)

        getIntentValue()
        initToolbar()
    }

    private fun getIntentValue() {
        val rapperJson = intent.getStringExtra("RAPPER")
        rapper = gson.fromJson(rapperJson, Rapper::class.java)
        updateViewFromIntent()
    }

    private fun updateViewFromIntent() {
        rapper_name.text = rapper.name
        rapper_born.text = rapper.born
        rapper_origin.text = rapper.origin
        rapper_net_worth.text = rapper.netWorth
        rapper_desc.text = rapper.desc

        Glide.with(this).load(rapper.imageUrl).centerCrop().into(rapper_image)
        rapper_discography.adapter = AlbumsAdapter(rapper.discography)
        rapper_discography.layoutManager = LinearLayoutManager(this)
    }

    private fun initToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
