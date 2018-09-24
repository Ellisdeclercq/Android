package com.ellisdeclercq.vdabcursist.syntax

open class Student() {
    var studentnummer: String?= null
    var studentnaam: String?=null
    var opleiding: String?=null
    var adres: String?=null


    constructor(studentnummer: String, studentnaam: String):this() {
        this.studentnummer = studentnummer
        this.studentnaam = studentnaam
    }
}

class Kotstudent(): Student() {
    var kotBaas: Int? = null
    var nevermind: Char? = null

    constructor(dagen: Int, leverancierscode: Char, name: String, num: Int, price: Double) : this() {
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