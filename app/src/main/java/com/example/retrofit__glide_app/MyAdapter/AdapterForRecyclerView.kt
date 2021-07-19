package com.example.retrofit__glide_app.MyAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit__glide_app.R
import com.example.retrofit__glide_app.model.mydata_items
import kotlinx.android.synthetic.main.cardview_model_for_recyclerview.view.*
import retrofit2.Response

class AdapterForRecyclerView(val context:Context , val mydataItems: List<mydata_items>) :
    RecyclerView.Adapter<AdapterForRecyclerView.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.cardview_model_for_recyclerview, parent, false)
        return ViewHolder(itemView)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.textView_for_loading_data_id.text = mydataItems[position].id.toString()
        holder.itemView.textView_for_loading_data_title.text = mydataItems[position].title
        holder.itemView.textView_for_loading_data_body.text = mydataItems[position].body

    }


    override fun getItemCount(): Int {
        return mydataItems.size
    }


}