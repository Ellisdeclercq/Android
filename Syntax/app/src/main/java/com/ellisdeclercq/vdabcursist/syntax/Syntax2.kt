package com.ellisdeclercq.vdabcursist.syntax

fun main (args:Array<String>) {
/*
    var age:Int = 22

    if (age<50)
        println("Jonkie")


    var score:Int= 80
    var grade: String?= null
    if(score>=90) grade="Grade A"
    else if(score >=80) grade="Grade B"
    else if(score>=70) grade="Grade C"
    else if(score>=50) grade="Grade D"
    else grade="Grade F"
    println(grade)

    var size:Int = 10

    when(size) {
        1,4 -> println("size 1")
        2 -> println("size 2")
        3 -> println("size 3")
        else -> println("this does noet exist")
    }

*/
    var size: Int = 4

    for (size in 0..5) println("size = $size")

    println(size)

    var x = 0

    do {

        x++
        if (x == 4) { continue }
        println(x)

    } while (x <= 5)


}