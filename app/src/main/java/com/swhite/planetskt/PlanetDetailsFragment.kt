package com.swhite.planetskt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class PlanetDetailsFragment : Fragment() {

    private lateinit var planetNameTextView: TextView
    private lateinit var planetRadiusTextView: TextView
    private lateinit var planetYearTextView: TextView
    private lateinit var planetTypeTextView: TextView
    private lateinit var planetMoonsTextView: TextView
    private lateinit var planetDwarfTextView: TextView
    private lateinit var planetImageView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_planet_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val planetName = requireArguments().getString("planetName")
        val radiusInMiles = requireArguments().getInt("radiusInMiles")
        val numberOfMoons = requireArguments().getInt("numberOfMoons")
        val isDwarfPlanet = requireArguments().getBoolean("isDwarfPlanet")
        val lengthOfYearInDays = requireArguments().getInt("lengthOfYearInDays")
        val planetType = requireArguments().getString("planetType")
        val planetImage = requireArguments().getInt("planetImage")

        planetNameTextView = view.findViewById(R.id.planet_name_text_view)
        planetRadiusTextView = view.findViewById(R.id.planet_radius_text_view)
        planetYearTextView = view.findViewById(R.id.planet_year_text_view)
        planetTypeTextView = view.findViewById(R.id.planet_type_text_view)
        planetMoonsTextView = view.findViewById(R.id.planet_moons_text_view)
        planetDwarfTextView = view.findViewById(R.id.planet_dwarf_text_view)
        planetImageView = view.findViewById(R.id.planet_image_view)

        planetNameTextView.text = planetName
        planetRadiusTextView.text = "Radius: ${radiusInMiles} miles"
        planetYearTextView.text = "Length of year in Earth days: ${lengthOfYearInDays} days"
        planetMoonsTextView.text = "Number of moons: ${numberOfMoons}"
        planetTypeTextView.text = "Planet type: ${planetType}"
        planetImageView.setImageResource(planetImage)

        if(isDwarfPlanet) {
            planetDwarfTextView.text = "${planetName} is a dwarf planet"
        } else {
            planetDwarfTextView.text = ""
        }
    }
}