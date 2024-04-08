package com.jiunging.kotlinbasic.day01

fun main() {

    // null safety에 관하여
    
    // 자바는 null 안정성이 없음
    /*
    String x = null
    x.uppercase()
    */

//    var a : String = null // null 지정이 안 됨
    var a : String? = null // 변수가 null일 수도 있음

    // ? 연산자는 = null이 아닐 때 시랳ㅇ해라
    // null이 아니면 실행하고, null이면 null을 저장
    var b = a?.uppercase() // 애시당초에 null일 수 있는 변수
    println(b)
    
    println("------------------------------------------")
    // ?:대체값
    var first : String? = "hong"
    var second = (first?:"홍").uppercase() // first가 null이면 "홍"으로 대체

    println(second)

    println("------------------------------------------")

    // !! - 내가 이거 null 아닌것을 반드시 보장
    var k : String? = "null일 수도 있는 값"
    var result = k!!.uppercase() // 만약 null이라면 runtime에러가 뜸

    println("-----------------------------------------")

    var result2 = k.run {
        println("null이 아닌 경우에 실행됨")
        "null 아님"
    } ?: run {
        println("null인 경우에 실행됨")
        "null 입니다"
    }

    println(result2)


}