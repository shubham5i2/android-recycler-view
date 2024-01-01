package com.sks.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountryAdapter(
    var countryNameList: ArrayList<String>,
    var detailList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context: Context
) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewCountryName: TextView = itemView.findViewById(R.id.textViewCountryName)
        var textViewDetail: TextView = itemView.findViewById(R.id.textViewDetail)
        var imageView: CircleImageView = itemView.findViewById(R.id.imageView)
        var cardView: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.card_design, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.textViewCountryName.text = countryNameList.get(position)
        holder.textViewDetail.text = detailList.get(position)
        holder.imageView.setImageResource(imageList.get(position))

        holder.cardView.setOnClickListener {
            Toast.makeText(
                context,
                "${countryNameList.get(position)} flag is selected",
                Toast.LENGTH_SHORT
            )
                .show()
        }
    }

    override fun getItemCount(): Int {
        return countryNameList.size
    }
}