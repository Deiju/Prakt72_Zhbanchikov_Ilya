fun main(){
    try {
        println("a")
        var a=readLine()!!.toDouble()
        println("b")
        var b=readLine()!!.toDouble()
        println("c")
        var c=readLine()!!.toDouble()
        when{
            (a<b && b<c) -> println("Выполняется")
            else -> println("Не выполняется")
            }
    }
    catch (e:NumberFormatException)
    {
        println("Цифры")
    }
}