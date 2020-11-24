package me.ifarshad.rcycleviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecycleView()

    }

    private fun setupRecycleView() {
        recyclerView = findViewById(R.id.recyclerViewId)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ListRecyclerViewAdapter()
    }

}