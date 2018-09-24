package com.ellisdeclercq.vdabcursist.syntax

class Car {

    var name: String

    constructor(name:String) {
        this.name = name
    }
}
fun main(args:Array<String>) {
    var christine = Car("Christine")

    println(christine.name)
}