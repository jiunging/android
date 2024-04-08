package com.jiunging.kotlinbasic.day01


fun main() {
    
    // 자바의 switch문과 동일
    // 코틀린에서는 when 구문이 switch를 대신한다.
    // 안드로이드에서 많이 사용됨
    
    var data : Any = 10
    
    when(data) {
        1 -> println("1입니다")
        1 -> println("1입니다")
        3 -> {
            println("3입니다")
        }
        4,5,6 -> {
            println("4, 5, 6입니다")
        }
        else -> {
            println("아무것도 아님")
        }
    }

    // express when
   var result = when(data) {
        1 -> "1입니다"
        2 -> {
            "2입니다"
        }
        3 -> "3 또는 4"
        else -> "아무것도 아님"
    }
    println(result)

}