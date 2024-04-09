package com.jiunging.kotlinbasic.day03

// 코틀린 기본적으로 final 클래스가 된다.
// 상속 가능한 클래스로 만들고 싶다면 open 키워드를 붙인다
//open class Parent {
//
//    fun some() {
//        println("부모님의 some메서드")
//    }
//
//}
//
//class Child : Parent() { // 상속
//
//}
//
//// 상속받은 클래스가 주생성자를 가질 때
//open class Mother(val name : String, val age : Int) {
//
//}
//
////class Hong : Mother{
////    // 자식에선 super를 이용해서 연결
////    constructor(name : String, age : Int) {
////
////    }
////
////}
//
//// 내가 받아서 부모님한테 던진다
//class Hong(name: String, age : Int) : Mother(name, age) {
//
//}
//
//
//fun main() {
//    var c = Child()
//    c.some() // 상속받은 메서드
//}