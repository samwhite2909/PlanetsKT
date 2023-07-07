package com.swhite.planetskt

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class PlanetsListAdapter(private val planetsList: ArrayList<Planet>, private val listener: OnItemClickListener) :
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

    inner class PlanetsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView), OnClickListener {

        val planetImageView : ShapeableImageView = itemView.findViewById(R.id.planet_image)
        val planetNameTextView : TextView = itemView.findViewById(R.id.planet_name)
        val planetTypeTextView : TextView = itemView.findViewById(R.id.planet_type)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position: Int = adapterPosition
            if(position!=RecyclerView.NO_POSITION) {
                listener.onItemClick(position, v)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int, view: View?)
    }

}