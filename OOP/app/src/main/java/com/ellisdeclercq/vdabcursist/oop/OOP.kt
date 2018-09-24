package com.ellisdeclercq.vdabcursist.oop
interface Calculator{
    fun sum(num1: Int, num2: Int) // dit is nu mijn abstracte functie



}

class Calculate : Calculator {
    override fun sum(num1: Int, num2: Int) {
        var total = num1 + num2
        println("de som van $num1 en $num2 is $total")
    }
}

fun main (args:Array<String>) {

    var myCalculation = Calculate()
    myCalculation.sum(10, 16)





}