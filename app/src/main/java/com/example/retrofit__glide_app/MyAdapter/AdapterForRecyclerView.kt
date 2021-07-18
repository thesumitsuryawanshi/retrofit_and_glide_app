package com.example.retrofit__glide_app.MyAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit__glide_app.R
import kotlinx.android.synthetic.main.cardview_model_for_recyclerview.view.*

class AdapterForRecyclerView( val numbers:Array<String>) : RecyclerView.Adapter<AdapterForRecyclerView.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_model_for_recyclerview,parent,false )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.textView_for_loading_data.text = numbers[position]


    }

    override fun getItemCount(): Int {

        return  numbers.size
    }


}