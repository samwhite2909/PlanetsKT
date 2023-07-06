package com.swhite.planetskt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class PlanetsListAdapter(private val planetsList: ArrayList<Planet>) :
    RecyclerView.Adapter<PlanetsListAdapter.PlanetsViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlanetsListAdapter.PlanetsViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.planet_item, parent, false)
        return PlanetsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: PlanetsListAdapter.PlanetsViewHolder, position: Int) {
        val currentItem = planetsList[position]

        holder.planetImageView.setImageResource(currentItem.planetImage)
        holder.planetNameTextView.text = currentItem.name
        holder.planetTypeTextView.text = currentItem.planetType
    }

    override fun getItemCount(): Int {
        return planetsList.size
    }

    class PlanetsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val planetImageView : ShapeableImageView = itemView.findViewById(R.id.planet_image)
        val planetNameTextView : TextView = itemView.findViewById(R.id.planet_name)
        val planetTypeTextView : TextView = itemView.findViewById(R.id.planet_type)

    }

}