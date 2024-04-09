package com.jiunging.kotlinbasic.day03


open class Parent {
    
    open fun some() {
        println()
    }
    
    fun notSome() {
        println("부모님만 사용가능한 메서드")
    }
    
}

class Child : Parent() {

    // 자식에서는 override 키워드를 붙인다
    override fun some() {
        println("자식에서 오버라이드된 메서드")
    }
}

fun main() {
    var c = Child()
    c.some() // 오버라이드된 메서드

    // 클래스간 상호 형 변환이 가능하려면 상속관계가 필요함
    var p = c as Parent
    p.some()
//    p.notSome()

    // 부모타입에 자식타입을 저장하면 자동캐스팅이 된다
    var pp : Parent = Child() // child -> Parent


}