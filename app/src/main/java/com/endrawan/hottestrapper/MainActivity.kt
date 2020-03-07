package com.endrawan.hottestrapper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.endrawan.hottestrapper.adapters.RappersAdapter
import com.endrawan.hottestrapper.models.Rapper
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val gson = Gson()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initToolbar()
        initRecyclerView()
    }

    fun initToolbar() {
        setSupportActionBar(toolbar)
    }

    fun initRecyclerView() {
        main_rappers.adapter =
            RappersAdapter(
                Dummy.dummyRappers,
                object :
                    RappersAdapter.RapperEvent {
                    override fun onClicked(rapper: Rapper) {
                        val intent = Intent(applicationContext, RapperActivity::class.java)
                        intent.putExtra("RAPPER", gson.toJson(rapper))
                        startActivity(intent)
                    }

                })
        main_rappers.layoutManager = LinearLayoutManager(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.profile -> {
                startActivity(Intent(applicationContext, ProfileActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
