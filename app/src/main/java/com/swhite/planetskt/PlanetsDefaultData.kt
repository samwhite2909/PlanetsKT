package com.swhite.planetskt
object PlanetsDefaultData {

    fun provideDefaultPlanets() : ArrayList<Planet> {
        val mercury: Planet = Planet(
            name = "Mercury",
            radiusInMiles = 1516,
            numberOfMoons = 0,
            lengthOfYearInDays = 88,
            planetType = Planet.Terrestrial,
            planetImage = R.drawable.mercury
        )

        val venus: Planet = Planet(
            name = "Venus",
            radiusInMiles = 3760,
            numberOfMoons = 0,
            lengthOfYearInDays = 88,
            planetType = Planet.Terrestrial,
            planetImage = R.drawable.venus
        )

        val earth: Planet = Planet(
            name = "Earth",
            radiusInMiles = 3959,
            numberOfMoons = 1,
            lengthOfYearInDays = 365,
            planetType = Planet.Terrestrial,
            planetImage = R.drawable.earth
        )

        val mars: Planet = Planet(
            name = "Mars",
            radiusInMiles = 2106,
            numberOfMoons = 2,
            lengthOfYearInDays = 687,
            planetType = Planet.Terrestrial,
            planetImage = R.drawable.mars
        )

        val jupiter: Planet = Planet(
            name = "Jupiter",
            radiusInMiles = 44423,
            numberOfMoons = 80,
            lengthOfYearInDays = 4329,
            planetType = Planet.GasGiant,
            planetImage = R.drawable.jupiter
        )

        val saturn: Planet = Planet(
            name = "Saturn",
            radiusInMiles = 36183,
            numberOfMoons = 83,
            lengthOfYearInDays = 10585,
            planetType = Planet.GasGiant,
            planetImage = R.drawable.saturn
        )

        val uranus: Planet = Planet(
            name = "Uranus",
            radiusInMiles = 15759,
            numberOfMoons = 27,
            lengthOfYearInDays = 30660,
            planetType = Planet.IceGiant,
            planetImage = R.drawable.uranus
        )

        val neptune: Planet = Planet(
            name = "Neptune",
            radiusInMiles = 15299,
            numberOfMoons = 14,
            lengthOfYearInDays = 60225,
            planetType = Planet.IceGiant,
            planetImage = R.drawable.neptune
        )

        val pluto: Planet = Planet(
            name = "Pluto",
            radiusInMiles = 715,
            numberOfMoons = 5,
            isDwarfPlanet = true,
            lengthOfYearInDays = 90520,
            planetType = Planet.Dwarf,
            planetImage = R.drawable.pluto
        )

        return arrayListOf<Planet>(
            mercury, venus, earth, mars, jupiter, saturn, uranus, neptune, pluto
        )
    }
}