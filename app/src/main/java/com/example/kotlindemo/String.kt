package com.example.kotlindemo


fun main(){

    val name = StringBuffer("abc").toString();
    val name1 = StringBuffer("abc").toString();

    println(name == name1)
    println(name === name1)

}