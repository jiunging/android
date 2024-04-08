package com.jiunging.kotlinbasic.day01

fun main() {
    // 1..10 - 포함
    // until - 미만
    // step - 점프값
    // downTo - 감소값

    // 1~10까지
    for(i in 1 .. 10) {
        print("$i ")
    }
    println()

    var arr = arrayOf(1,2,3,4,5)
    // 1부터 5까지
    for(i in arr) {
        print("$i ")
    }
    
    println()
    // 1~9까지
    for(i in 1 until 10) {
        print("$i ") 
    }

    println()
    // step은 뛰어넘을 값
    for(i in 1 until 10 step 2) {
        print("$i ") 
    }

    println()

    // 10부터 1까지
    for(i in 10 downTo 1) {
        print("$i ")
    }

    println()

    var arr2 = arrayListOf<Int>(10, 20, 30, 40, 50)
    for( (index, value) in arr2.withIndex()) {
        println("인덱스 $index, 값: $value")
    }
    

}