package com.jiunging.kotlinbasic.day02

// 주 생성자, 보조 생성자를 같이 사용할 수 있음
// 보조 생성자에서 주 생성자를 연결해야 함
class ConstructorEx2(val name : String) {

    var age : Int? = null
    var addr : String? = null

    constructor(name: String, age: Int) : this(name) { // 주 생성자 연결
        this.age = age
    }

    constructor(name: String, age: Int, addr: String) : this(name, age) {
        this.addr = addr
    }
}

fun main() {
    var c = ConstructorEx2("홍길동") // 주 생성자
    var c2 = ConstructorEx2("이순신", 30) // qhwhtodtjdwk
    var c3 = ConstructorEx2("강감찬", 44, "서울시") // 보조생성자
}