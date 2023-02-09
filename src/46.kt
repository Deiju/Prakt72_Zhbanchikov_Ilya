fun main(){
    try {
        println("a")
        var a=readLine()!!.toInt()
        when{
            (a==1) -> println("Понедельник")
            (a==2) -> println("Вторник")
            (a==3) -> println("Среда")
            (a==4) -> println("Четверг")
            (a==5) -> println("Пятница")
            (a==6) -> println("Суббота")
            (a==7) -> println("Воскресенье")
            else -> println("Нет такого дня недели")
        }
    }
    catch (e:NumberFormatException)
    {
        println("Цифры")
    }
}