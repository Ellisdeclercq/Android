package com.ellisdeclercq.vdabcursist.oop

var myHashMap = HashMap<String, String>()

fun main (args:Array<String>){
    var myHashMap = HashMap<String, String>()
    myHashMap.put("OK", "Okay") // setter = put
    myHashMap.put("Y", "Yes")

    for(item in myHashMap.keys) {
        println(myHashMap.get(item)) // get = get

    }



}