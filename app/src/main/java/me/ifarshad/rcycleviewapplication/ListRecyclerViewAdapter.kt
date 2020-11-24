package me.ifarshad.rcycleviewapplication

import android.*
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class ListRecyclerViewAdapter() : RecyclerView.Adapter<ListRecyclerViewHolder>() {

    val items = arrayOfNulls<String>(25)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListRecyclerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_cell_view_holder, parent, false)
        return ListRecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListRecyclerViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return items.size
    }

}


