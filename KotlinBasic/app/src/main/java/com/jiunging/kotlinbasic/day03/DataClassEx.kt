package com.jiunging.kotlinbasic.day12 // 패키지명


// 클래스 앞에 data를 붙이면, 데이터를 저장하는 용도의 클래스가 된다. (즉, vo)
// 소괄호를 열고, 멤버변수를 받는다.
// 매개변수는 반드시 1개 이상이어야 한다.
data class User(
    val id: String,
    val age: Int
)

fun main() {
    var u = User("홍길동", 10)
    println(u.id)
    println(u.age)
    println(u.toString()) // toString 메서드가 자동으로 오버라이딩 들어감
}


