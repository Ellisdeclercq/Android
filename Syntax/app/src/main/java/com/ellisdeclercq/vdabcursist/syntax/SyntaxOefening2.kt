package com.ellisdeclercq.vdabcursist.syntax

open class Artikel() {
    var name: String?= null
    var num: Int?=null
    var price:Double?=null

    constructor(name: String, num: Int, price: Double):this() {
        this.name = name
        this.num = num
        this.price = price
    }
}

class Zuivel(): Artikel() {
    var dagen: Int? = null
    var leverancierscode: Char? = null

    constructor(dagen: Int, leverancierscode: Char, name: String, num: Int, price: Double):this() {
        this.name = name
        this.num = num
        this.price = price
        this.dagen = dagen
        this.leverancierscode = leverancierscode
    }
    }

    fun main(args: Array<String>) {
        var yoghurt = Zuivel(22, 'a', "Danone", 1876, 1.28)
    }
