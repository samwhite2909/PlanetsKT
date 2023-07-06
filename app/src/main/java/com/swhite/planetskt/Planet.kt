package com.swhite.planetskt

data class Planet(
    val name: String,
    val radiusInMiles: Int,
    val numberOfMoons: Int,
    val isDwarfPlanet: Boolean = false,
    val lengthOfYearInDays: Int,
    val planetType: String,
    val planetImage: Int = R.drawable.generic
) {
    //List of colors available for notes.
    companion object {
        //Planet Types
        val GasGiant: String = "Gas Giant"
        val IceGiant: String = "Ice Giant"
        val Terrestrial: String = "Terrestrial"
        val Dwarf: String = "Dwarf"

        //Used for validation
        val validPlanetTypes = listOf<String>(GasGiant, IceGiant, Terrestrial, Dwarf)
    }
}

