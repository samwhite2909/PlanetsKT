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
}

