package com.swhite.planetskt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class AddPlanetFragment : Fragment() {

    lateinit var planetNameEditText: EditText
    lateinit var planetRadiusEditText: EditText
    lateinit var planetMoonsEditText: EditText
    lateinit var planetYearEditText: EditText
    lateinit var planetTypeEditText: EditText
    lateinit var dwarfPlanetRadioButtonGroup: RadioGroup
    lateinit var createPlanetButton: Button
    lateinit var yesRadioButton: RadioButton
    lateinit var noRadioButton: RadioButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_planet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        planetNameEditText = view.findViewById(R.id.planet_name_edit_text)
        planetRadiusEditText = view.findViewById(R.id.planet_radius_edit_text)
        planetMoonsEditText = view.findViewById(R.id.planet_moons_edit_text)
        planetYearEditText = view.findViewById(R.id.planet_year_edit_text)
        planetTypeEditText = view.findViewById(R.id.planet_type_edit_text)
        dwarfPlanetRadioButtonGroup = view.findViewById(R.id.dwarf_radio_group)
        createPlanetButton = view.findViewById(R.id.create_planet_button)
        yesRadioButton = view.findViewById(R.id.yes_radio_button)
        noRadioButton = view.findViewById(R.id.no_radio_button)

        createPlanetButton.setOnClickListener {
            addNewPlanet()
        }
    }

    private fun addNewPlanet() {
        val planetName = planetNameEditText.text.toString()
        var planetRadius: Int = try {
            Integer.parseInt(planetRadiusEditText.text.toString())
        } catch (e: java.lang.Exception) {
            0
        }
        var planetMoons: Int = try {
            Integer.parseInt(planetMoonsEditText.text.toString())
        } catch (e: java.lang.Exception) {
            0
        }
        var planetYear: Int = try {
            Integer.parseInt(planetYearEditText.text.toString())
        } catch (e: java.lang.Exception) {
            0
        }
        val planetType = planetTypeEditText.text.toString()
        val checkedButton = dwarfPlanetRadioButtonGroup.checkedRadioButtonId
        var isDwarfPlanet = false

        if(checkedButton == R.id.yes_radio_button) isDwarfPlanet = true

        val planet = Planet(
            planetName,
            planetRadius,
            planetMoons,
            isDwarfPlanet,
            planetYear,
            planetType
        )

        if(!checkValidPlanet(planet)) return

        Toast.makeText(context, "Creating planet...", Toast.LENGTH_SHORT).show()
        //TODO: Add dagger2, roomdb to store planets.

    }

    private fun checkValidPlanet(planet: Planet) : Boolean{
        if(!ValidPlanetUtil.checkValidPlanetName(planet.name)) {
            Toast.makeText(context, "Please enter a valid planet name", Toast.LENGTH_SHORT).show()
            return false
        }

        if(!ValidPlanetUtil.checkValidPlanetRadius(planet.radiusInMiles)) {
            Toast.makeText(context, "Please enter a valid planet radius", Toast.LENGTH_SHORT).show()
            return false
        }

        if(!ValidPlanetUtil.checkValidPlanetMoons(planet.numberOfMoons)) {
            Toast.makeText(context, "Please enter a valid number of moons", Toast.LENGTH_SHORT).show()
            return false
        }

        if(!ValidPlanetUtil.checkValidPlanetYear(planet.lengthOfYearInDays)) {
            Toast.makeText(context, "Please enter a valid year in days", Toast.LENGTH_SHORT).show()
            return false
        }

        if(!ValidPlanetUtil.checkValidPlanetType(planet.planetType)) {
            Toast.makeText(context, "Please enter a valid planet type", Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }
}