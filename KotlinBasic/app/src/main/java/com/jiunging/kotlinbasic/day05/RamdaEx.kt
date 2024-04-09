package com.jiunging.kotlinbasic.day05

//fun some(a : Int) {
//    println("최상위함수:" + a)
//}
//
//// 익명함수
//var some = fun(a: Int) {
//    println("최상위 함수: " + a)
//}

// 람다식 - var 변수명 = {매개변수: 타입 -> 내용}
//var some = {a : Int ->
//    println("람다함수: " + a)
//}

// 람다가 한줄이라면 자동으로 리턴
// var some = {a : Int, b : Int -> a + b} // a + b return
var some = {a : Int, b : Int ->
    println("내용~~~~")
    a + b// 리턴됨
}

// 람다의 타입추론
//var some2 = {a : Int -> a * 10}

//typealias MyType = (Int) -> Int
//var some2 : MyType = {a -> a * 10}
var some2 : (Int) -> Int = {a -> a * 10}

// 람다에서 it키워드 - 람다식에서 파라미터가 1개인 경우는 -> 를 생략하고 {} 안에서 it키워드로 매개값 참조가능
var some3 : (Int) -> Int = {
    println(it) // 매개변수
    it * 10 // 리턴
}

fun main() {
    // 랃다의 사용 - 람다는 함수라서 함수 사용 방법과 동일함
    println(some2(10))
    println(some3(10))
}