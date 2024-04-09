package com.jiunging.kotlinbasic.day03

// 멤버변수를 선언하면 자동 public으로 선언되고,
// 자동으로 getter, setter를 만들어 준다.
// 외부에서 멤버변수값을 사용할 때 자동으로 getter, setter가 사용됨
class User {
    var id : String? = null
        set(value) { // setter 메서드의 오버라이딩
            println("setter 메서드 실행됨")
            field = value?.uppercase()

        }
    var age : Int = 0
        get() {
            println("getter 메서드 실행됨")
            return if(field < 0) {
                0
            } else {
                field
            }
        }
}

fun main() {
    var u = User()

    u.id = "aaa123" // setter
    println(u.id) // getter

    u.age = -10 // age setter
    println(u.age)

}