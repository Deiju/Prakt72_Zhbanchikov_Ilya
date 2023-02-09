fun main(){
    try {
        var x0=0
        var y0=0
        println("x1")
        var x1=readLine()!!.toDouble()
        println("y1")
        var y1=readLine()!!.toDouble()
        when{
            (y1>y0 && x1>x0) -> println("Находится")
            else -> println("Не находится")
        }
    }
    catch (e:NumberFormatException)
    {
        println("Цифры")
    }
}