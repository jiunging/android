package com.jiunging.kotlinbasic.day01


fun main() {

    var p = Person()
    p.name = "이순신" // lateinit이기 때문에 초기값 지정이 필요함

    println(p.name)
    println(p.age)
    println(p.addr)


}

// 자바와 달리 클래스명과 파일명이 다르더라도 상관없지만, 맞춰주는게 좋다
class Person {
    val age : Int = 10 // 멤버변수
    // 초기값 미루기
    lateinit var name : String

    // val 변수에만 선언 가능
    val addr : String by lazy {
        println("sdf")
        "서울시"
    }

}