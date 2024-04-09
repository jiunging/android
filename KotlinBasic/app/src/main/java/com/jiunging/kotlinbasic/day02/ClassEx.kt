package com.jiunging.kotlinbasic.day02

// 먼저 코틀린은 파일명과 클래스명이 반드시 일치할 필요는 없음
class ClassEx {
    // 멤버변수
    var name : String = "홍길동"
    var age : Int? = null

    // 함수
    fun some() {
        println("hello world")
    }
}

// 생성자 - 주생성자, 보조생성자
// 근데 코틀린에서는 그냥 매개변수에 저렇게 넣어주면 됨
class Person(val name : String) {
    
    // 원래 자바에서는 이렇게
//    String name;
//    Person(String name) {
//        this.name = name;
//    }

    var age : Int? = null

    init {
        // 클래스가 생성될 때 가장 처음 불려나감
        println("hello init block")
        age = 20 // 변수의 초기화 진행가능
    }


    
}

fun main() {

    var p = Person("홀길동")
    println(p.name) // name이 멤버변수가 됨

//    var c : ClassEx = ClassEx() // new 생략
//    println(c.name)
//    println(c.age)
//    c.some()
}

