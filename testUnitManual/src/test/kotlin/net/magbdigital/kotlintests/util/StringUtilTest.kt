package net.magbdigital.kotlintests.util

import org.junit.Test

import org.junit.Assert.*
import java.lang.Exception

class StringUtilTest {

    @Test
    fun repeat() {

        assetEquals(StringUtil.repeat("Hola",3),"HolaHolaHola")

    }

    private fun assetEquals(actual: String, expected: String) {
        if(!actual.equals(expected))
            throw Exception("$actual no es igual al valor $expected")
    }

    @Test
    fun repeat1() {
        val result : String =StringUtil.repeat("Hola",1)
        assetEquals(result,"Hola")
    }
}