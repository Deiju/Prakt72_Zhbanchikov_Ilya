fun main(){
    try {
        var k=0
        println("a")
        var a=readLine()!!.toDouble()
        println("b")
        var b=readLine()!!.toDouble()
        println("z")
        var z=readLine()!!.toDouble()
        println("x")
        var x=readLine()!!.toDouble()
        println("y")
        var y=readLine()!!.toDouble()
        when (x)
        {
            in a..b ->
            {
                println("х")
                k++
            }
            else -> "не x"
        }
        when (y)
        {
            in a..b ->
            {
                println("y")
                k++
            }
            else -> "не y"
        }
        when (z)
        {
            in a..b ->
            {
                println("z")
                k++
            }
            else -> "не z"
        }
        println(k)
    }
    catch (e:NumberFormatException)
    {
        println("Цифры")
    }
}