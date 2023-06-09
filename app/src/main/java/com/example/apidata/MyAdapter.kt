package com.example.apidata

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyAdapter(private val context: Activity, private val quotesList: List<Quote>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var quoteText: TextView
        var authText: TextView
        init {
            quoteText = itemView.findViewById(R.id.quote)!!
            authText = itemView.findViewById(R.id.auth)!!
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView  = LayoutInflater.from(context).inflate(R.layout.eachquote,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return quotesList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = quotesList[position]
        holder.quoteText.text = currentItem.quote
        holder.authText.text = currentItem.author
    }

}