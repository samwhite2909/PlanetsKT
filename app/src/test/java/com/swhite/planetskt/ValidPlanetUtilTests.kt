package com.swhite.planetskt

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ValidPlanetUtilTests {

    @Test
    fun valid_planet_type_is_correct() {
        val result = ValidPlanetUtil.checkValidPlanetType("Gas Giant")
        assertThat(result).isTrue()
    }

    @Test
    fun invalid_planet_type_is_incorrect() {
        val result = ValidPlanetUtil.checkValidPlanetType("Ice cream")
        assertThat(result).isFalse()
    }

    @Test
    fun valid_planet_name_is_correct() {
        val result = ValidPlanetUtil.checkValidPlanetName("Earth")
        assertThat(result).isTrue()
    }

    @Test
    fun blank_planet_name_is_incorrect() {
        val result = ValidPlanetUtil.checkValidPlanetName("")
        assertThat(result).isFalse()
    }

    @Test
    fun too_long_planet_name_is_incorrect() {
        val result = ValidPlanetUtil.checkValidPlanetName("qwertyuiopasdfghjklzxcvbnm")
        assertThat(result).isFalse()
    }

    @Test
    fun valid_planet_radius_is_correct() {
        val result = ValidPlanetUtil.checkValidPlanetRadius(69911)
        assertThat(result).isTrue()
    }

    @Test
    fun blank_or_zero_radius_is_incorrect() {
        val result = ValidPlanetUtil.checkValidPlanetRadius(0)
        assertThat(result).isFalse()
    }

    @Test
    fun radius_entered_is_too_large_is_incorrect() {
        val result = ValidPlanetUtil.checkValidPlanetRadius(1000000)
        assertThat(result).isFalse()
    }

    @Test
    fun valid_planet_number_of_moons_is_correct() {
        val result = ValidPlanetUtil.checkValidPlanetMoons(145)
        assertThat(result).isTrue()
    }

    @Test
    fun blank_or_zero_moons_is_incorrect() {
        val result = ValidPlanetUtil.checkValidPlanetMoons(0)
        assertThat(result).isFalse()
    }

    @Test
    fun moons_entered_is_too_large_is_incorrect() {
        val result = ValidPlanetUtil.checkValidPlanetMoons(400)
        assertThat(result).isFalse()
    }

    @Test
    fun valid_planet_year_in_days_is_correct() {
        val result = ValidPlanetUtil.checkValidPlanetYear(90500)
        assertThat(result).isTrue()
    }

    @Test
    fun blank_or_zero_year_in_days_is_incorrect() {
        val result = ValidPlanetUtil.checkValidPlanetYear(0)
        assertThat(result).isFalse()
    }

    @Test
    fun year_in_days_entered_is_too_large_is_incorrect() {
        val result = ValidPlanetUtil.checkValidPlanetYear(1000000)
        assertThat(result).isFalse()
    }
}

