package com.ellisdeclercq.vdabcursist.oop

enum class Color(rgb:Int, var kleurnaam:String, var nomDeCouleur:String){
    RED(0xFF0000, "rood", "rouge"),
    GREEN(0x00FF00,"groen", "vert" ),
    BLUE (0x0000FF, "blauw","bleu")


}
fun main(args:Array<String>){
    println(Color.RED.kleurnaam)

}

