package com.example.kotlindemo

fun ifElse() {
    val day = 3
    val nm = if(day == 0) "Mon"
    else if ( day == 1) "Tue"
    else "Sun"
    println(nm)
}
fun main() {
    val day = 3

    val nm = when(day) {
        0 -> "Mon"
        1 -> "Tue"
        //in 2-> "Odd"
        else -> "Sun"
    }
    println(nm)
}