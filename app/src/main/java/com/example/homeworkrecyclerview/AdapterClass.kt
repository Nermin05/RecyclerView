package com.example.homeworkrecyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworkrecyclerview.databinding.RecyclerRowBinding

class AdapterClass(val doingList:ArrayList<ForDoing>):RecyclerView.Adapter<AdapterClass.ForDoingHolder>() {
    class ForDoingHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForDoingHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ForDoingHolder(binding)

    }

    override fun getItemCount(): Int {
        return doingList.size
    }

    override fun onBindViewHolder(holder: ForDoingHolder, position: Int) {
        holder.binding.imageRow.setImageResource(doingList.get(position).img)
        holder.binding.recyclerTextView.text=doingList.get(position).name


        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,Details::class.java)
            intent.putExtra("Note",doingList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}