package com.ellisdeclercq.vdabcursist.syntax

fun main(args:Array<String>){
   /* var naam = "Ellis"
    var age:Int? = null
    val ander:String = "Laura"
    var pi = 3.1415 // ziet dit by default als double
    var myArray = arrayOf(5, 4, 8, 4)
    var myArrayToo:Array<Int?> = arrayOf (4, null, 7, 8)


    println("Hello " + naam)
    println("Hello $naam") // simpele manier om te concateneren

    for (item in myArrayToo) {
        println(item)
    }

    age?.let { println("age= $age")} // enkel printen indien geen Null
    println("Hello Again")
    // age.let { println("age = $age")} // hij reageert age= null en gaat verder
    //age!!.let {(println("age= $age")) }// dan krijg je de Null Pointer Exception en kan je er iets mee doen


    val name= 'X'
    val newName:String = name.toString() // geen foutmelding dus dan wordt het aanvaard

    var myInt:Int = "101".toInt() // geen foutmelding dus dan wordt het aanvaard

    var firstName = readLine()*/

    print("What is your name?")
    var name = readLine()
    print("What is your age?")
    var age = readLine()?.toInt()
    age = age?.plus(1)
    println("Oke $name next year your age will be $age")



}