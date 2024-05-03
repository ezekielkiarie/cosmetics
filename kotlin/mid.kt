import java.time.LocalDateTime
import java.time.format.DateTimeFormatter




fun main(){
    println("mid morning class")

//variables
//
//    var name:String= "eze"
//
//    println(name)
//
//    var n:Boolean=true
//    var f:Char='g'
//    var age:Int=67
//    var d:Double=43.9
//
//    println(n)
//    println(f)
//    println(age)
//    println(d)
//
//
//    var name:String="Ezekiel"
//    val school:String="Emobilis"
//    var year:Int=2023
//    var course:String="MIT"
//
//
//println("My name is $name, I enrolled in $school in the year $year,pursuing $course")
//operators()
//    ifs()
//    grade()
    check()
    increment()
    digit()
    val current = LocalDateTime.now()

    println("Current Date and Time is: $current")
}
//
//fun operators(){
//
//    var phy:Int=70
//    var geo:Int=60
//
//    var sum = geo + phy
//
//    println(sum)
//
//    var rem:Int = phy%geo
//    println(rem)
//
//    var subtract:Int = phy-geo
//    println(subtract)
//
//    var multiply:Int = phy*geo
//    println(multiply)
//
//
//}
//
//fun ifs(){
//
//    var mao:Int=70
//    var eng:Int=80
//    if (mao>eng){
//        println("mao > eng")
//        }
//    else if(mao < mao){
//        println("eng<=mao")
//    }
//    else{
//        println("mao==eng")}
//
//
//    var number = 0
//    if (number>0){
//        println("Positive")}
//    else if (number<0){
//        println("Negative")
//    }
//    else {
//        println("Numer is zero")
//    }
//}
//
//fun grade(){
//    var eze:Int = readLine()!!.toInt()
//    var josh:Int = readLine()!!.toInt()
//    var nao:Int = readLine()!!.toInt()
//    var deb:Int = readLine()!!.toInt()
//
//    var av:Int = (eze+josh+nao+deb)/4
//    println(av)
//
//    if(av>0){
//
//    }
//
//}

fun check(){
    var one:Int = 29
    var two:Int = 1
    var three:Int = 25

    if (one > two){
        println("$one is the graetest number")
    }
    else if (two > three) {
        println("$two is the greatest number")
    }

    else if (three > one){
        println("$three is the greatest number")}






}

fun increment(){

    var grade = 46
    while (grade < 10){
        println(grade)
        grade++
    }
}

fun digit(){

    var no = -85

    if (no >= 0 && no < 10 )
        println(" $no singular number")

    else if ( no >= 0 && no < 100)
        println("$no is a two digit number")

    else if (  no >= 0 && no < 1000)
        println("$no is a three digit number")

    else if ( no < 0)
        println("$no is less than 0")


}

