package com.nizar.tugasmodul6jajanansby

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_makanan.view.*

class Adapter(val resepItemList: List<Data_makanan>, val clickListener: (Data_makanan) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_makanan, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(resepItemList[position], clickListener)
    }
    override fun getItemCount() = resepItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(fak: Data_makanan, clickListener: (Data_makanan) -> Unit) {
            itemView.namajajan.text = fak.NamaJajan.toString()
            itemView.imgjajan.setImageResource(fak.imgJajan)

            itemView.setOnClickListener{clickListener(fak)}
        }
    }
}