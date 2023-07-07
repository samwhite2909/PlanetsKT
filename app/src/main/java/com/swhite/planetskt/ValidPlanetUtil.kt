package com.swhite.planetskt

object ValidPlanetUtil {

    //Checks if the planet type is in the accepted planet types.
    fun checkValidPlanetType(planetType: String) : Boolean{
        return Planet.validPlanetTypes.contains(planetType)
    }

    //Checks if the planet has been given a valid name.
    fun checkValidPlanetName(planetName: String) : Boolean{
        return !(planetName.isBlank() || planetName.length >= 25)
    }

    //Checks if the planet has a radius entered and is acceptable.
    fun checkValidPlanetRadius(planetRadius: Int):Boolean {
        return !(planetRadius == 0 || planetRadius >= 100000)
    }

    //Checks if the planet has a number of moons entered and is acceptable.
    fun checkValidPlanetMoons(planetMoons: Int):Boolean {
        return !(planetMoons == 0 || planetMoons >= 200)
    }

    //Checks if the planet has a year in days entered and is acceptable.
    fun checkValidPlanetYear(planetYearInDays: Int):Boolean {
        return !(planetYearInDays == 0 || planetYearInDays >= 100000)
    }

}