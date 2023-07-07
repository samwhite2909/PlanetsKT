package com.swhite.planetskt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PlanetsListFragment : Fragment(), PlanetsListAdapter.OnItemClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var planetsList: ArrayList<Planet>
    private lateinit var addPlanetFab: FloatingActionButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_planets_list_fragement, container, false)

        setupRecyclerView(view)
        setupFab(view)

        return view
    }

    private fun setupRecyclerView(view: View) {
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)

        planetsList = PlanetsDefaultData.provideDefaultPlanets()
        recyclerView.adapter = PlanetsListAdapter(planetsList, this)
    }

    private fun setupFab(view: View) {
        addPlanetFab = view.findViewById(R.id.fab_add_planet)
        addPlanetFab.setOnClickListener {
            Navigation.findNavController(view).navigate(
                R.id.action_planetsListFragment_to_addPlanetFragment
            )
        }
    }

    override fun onItemClick(position: Int, view: View?) {
        val planet = planetsList[position]
        if (view != null) {
            Navigation.findNavController(view).navigate(
                R.id.action_planetsListFragment_to_planetDetailsFragment,
                Bundle().apply {
                    putString("planetName", planet.name)
                    putInt("radiusInMiles", planet.radiusInMiles)
                    putInt("numberOfMoons", planet.numberOfMoons)
                    putBoolean("isDwarfPlanet", planet.isDwarfPlanet)
                    putInt("lengthOfYearInDays", planet.lengthOfYearInDays)
                    putString("planetType", planet.planetType)
                    putInt("planetImage", planet.planetImage)
                }
            )
        }
    }
}