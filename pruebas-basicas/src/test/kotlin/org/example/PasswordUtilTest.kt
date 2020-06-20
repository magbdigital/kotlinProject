package org.example

import org.junit.Test
import org.example.PasswordUtil.SecurityLevel
import org.junit.Assert.*

class PasswordUtilTest {

    @Test
    fun weak_has_len_8_letters() {
        assertEquals(SecurityLevel.WEAK,PasswordUtil.assessPassword("1De!13"))
    }

    @Test
    fun medium() {
        assertEquals(SecurityLevel.MEDIUM,PasswordUtil.assessPassword("SSaaaAAaAaAaAaAaA"))
    }
    @Test
    fun medium2() {
        assertEquals(SecurityLevel.MEDIUM,PasswordUtil.assessPassword("aaaAAa2AaAaAaAaA1"))
    }
    @Test
    fun strong() {
        assertEquals(SecurityLevel.STRONG,PasswordUtil.assessPassword("aaaAAaAaAaAaAaA!!!!"))
    }
}