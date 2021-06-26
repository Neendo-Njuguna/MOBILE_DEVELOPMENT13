package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class Number_Fibonacci(var numbersList: List<BigInteger>):RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
    var itemView = LayoutInflater.from(parent.context).inflate(R.layout.number_list_item,parent,false)
        return NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
       holder.tvNumber.text = numbersList.get(position).toString()
    }

    override fun getItemCount(): Int {
       return numbersList.size
    }
}
class NumberViewHolder(var itemview:View):RecyclerView.ViewHolder(itemview){
    var tvNumber = itemview.findViewById<TextView>(R.id.tvNumber)
}