package me.ifarshad.rcycleviewapplication


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var fab: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        setupRecycleView()
        setupFabButton()
    }

    private fun setupRecycleView() {
        recyclerView = findViewById(R.id.recyclerViewId)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ListRecyclerViewAdapter()
    }

    private fun setupFabButton() {
        this.fab = findViewById(R.id.fab)
        this.fab.setOnClickListener {
            Snackbar.make(it, "This is main activity", Snackbar.LENGTH_LONG)
                .setAction("Dismiss", {})
                .show()
        }
    }


}