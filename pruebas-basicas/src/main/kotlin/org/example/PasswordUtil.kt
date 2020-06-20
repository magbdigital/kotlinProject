package org.example
object PasswordUtil {
    enum class SecurityLevel{
        WEAK, MEDIUM, STRONG
    }

    fun  assessPassword(password : String) : SecurityLevel
    {
        if (password.length < 8) {
            return SecurityLevel.WEAK;
        }

        if (password.matches(Regex(pattern ="([a-zA-Z]+)"))) {
            return SecurityLevel.MEDIUM;
        }

        if (password.matches(Regex(pattern ="([a-zA-Z0-9])+"))) {
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }

}