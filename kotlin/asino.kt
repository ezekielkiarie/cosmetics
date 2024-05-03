fun main(){
//    display()
    max()
    min()
}
//
//fun display(){
//    print("Name: ")
//    var name:String = readLine()!!
//
//    print("Address: ")
//    var adress:String = readLine()!!
//
//    print("Number: ")
//    var number:Int = readLine()!! .toInt()
//
//}
//

fun max(){
    var one = 8
    var two = 5
    var three = 4

    if (one > two)
        println("$one is the greatest number ")

    else if (two > three)
        println("$two is the greatest number")

    else if (three > one)
        println("$three is the greatest number")


}

fun  min() {
    var four = 54
    var five = 43
    var six = 6

    if (four < five)
        println("$four is the smallest number")

    else if (five < six)
        println("$five is the smallest number")

    else if (six < four)
        println("$six is the smallest number")

}



