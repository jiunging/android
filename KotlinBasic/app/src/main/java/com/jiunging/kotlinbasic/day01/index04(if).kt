package com.jiunging.kotlinbasic.day01


fun main() {

    var num = 30
    var grade : String

    // 일반적인 if문
    if(num >= 90) {
        grade = "a"
    } else if(num >= 80) {
        grade = "b"
    } else {
        grade = "c"
    }

    // express if
   var result = if(num >= 90) {
        // 가장 마지막 줄에 값이 result에 저장
        "a"
    } else if(num >= 80) {
        "b"
    } else {
        "c"
    }

    println("향상된 if문: $result")

}