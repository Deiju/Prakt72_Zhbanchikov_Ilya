fun main(){
    try {
        println("a")
        var a=readLine()!!.toInt()
        when{
            ((a/100)/10+(a/100)%10==(a%100)%10+(a%100)/10) -> println("Счастливый")
            else -> println("Не счастливый")
        }
    }
    catch (e:NumberFormatException)
    {
        println("Цифры")
    }
}