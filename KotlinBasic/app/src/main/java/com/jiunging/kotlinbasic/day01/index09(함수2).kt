package com.jiunging.kotlinbasic.day01

import java.util.Arrays

fun main() {
    func1("이순신")

    func2(1, 2 ,3)
    func2(1, 3, 2)
    func2(b = 2, c = 3, a = 1) // named 파라미터

    func3("홍길동", 10)
    func3("홍길동", 10, 20)
    func3("홍길동", 10, 20, 30)
    func3("홍길동", 10, 20, 30, 40)

}

// 함수의 default 파라미터
fun func1(name : String, age : Int = 0) {
    println("$name, $age")
}

// 함수의 named 파라미터
fun func2(a : Int, b : Int, c : Int) = println("$a, $b, $c")

// 함수의 가변인자 선언
fun func3(name : String, vararg arr : Int) { // 가변 매개변수
    println(Arrays.toString(arr))
}
