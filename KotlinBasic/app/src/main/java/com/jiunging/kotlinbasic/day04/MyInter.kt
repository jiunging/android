package com.jiunging.kotlinbasic.day04

// 인터페이스
interface MyInter {
    var data1 : String // 추상변수(변경 가능)
    val data2 : String // 추상변수(변경 불가능)
    
    fun some() // 추상메서드
    fun mySome() { // 일반 메서드
        println("인터페이스에 만들어진 일반메서드")
    }

}

// 인터페이스를 상속받을 때는 ()를 뺀다
class Person : MyInter {

    // var은 변경 가능
    override var data1: String = "홍길동"
        get() = field
        set(value) {
            field = value
        }

    // val 변경 불가능
    override val data2: String = "이순신"
        get() = field

    override fun some() {
        println("오버라이드 된 메서드")
    }

}

//fun main() {
//    // 인터페이스는 객체 생성이 되지 않지만, 타입으로는 쑬 수 있음
//    var p =  MyInter = Person() // Person 생성 인터페이스 저장
//
//    var pp = p as Person
//
//}