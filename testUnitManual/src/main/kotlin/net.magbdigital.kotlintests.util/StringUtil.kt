object StringUtil
{
    fun repeat (str :String, times :Int) : String{
        var result : String =""
        for (i in 1..times) {
            result = "$result"+str
        }
        return result
    }
}