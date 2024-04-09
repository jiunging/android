package com.jiunging.kotlinbasic.day04

// 추상클래스 -
// abstract를 붙이면 추상클래스가 됨
// 추상클래스는 추상메서드를 가질 수 있음
// 추상메서드는 {}가 없는 메서드 선언
//abstract class Person {
//    // 변수가 추상형으로 선언될 수도 있음(많이 x)
//    // 원래 변수는 선언과 동시에 초기화 하거나 or lateinit을 붙여야 하지만, 추상형으로 선언이 가능함
//    abstract val name: String
//
//    abstract fun some() // 추상메서드
//    fun mySome() {
//        println("부모님의 mySome")
//    }
//
//}
//
//class Child : Person() {
//    // 추상변수 오버라이드
//    override val name: String
//        get() = "홍길동" // 초기값이 홍길동
//
//    // 추상메서드 오버라이드
//    override fun some() {
//        println("자식에서 오버라이드 된 메서드")
//    }
//
//}