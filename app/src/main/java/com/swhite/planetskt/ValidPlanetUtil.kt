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

}