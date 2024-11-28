fun main() {
    val outer1 = Outer1()
    val inner1 = outer1.Inner1()    // 내부 클래스는 외부 클래스를 거쳐야만 생성 가능

    println("innerVal = ${inner1.innerVal}")

    // 인터페이스를 딱 한번 구현하고 싶을 때 내부 클래스를 사용하는 예시
    val impl = object : Inter1 {
        override fun interFun1() {
            println("익명 중첩 클래스의 interFun1")
        }
        override fun interFun2() {
            println("익명 중첩 클래스의 interFun2")
        }
    }

    object : Inter1 {
        override fun interFun1() {
            println("익명 중첩 클래스의 interFun1?")
        }
        override fun interFun2() {
            println("익명 중첩 클래스의 interFun2?")
        }
    }

    impl.interFun1()
    impl.interFun2()
}

class Outer1 {
    var outerVal1 = 100
    fun outerFun() {
        println("outerFun")

        // 내부 클래스는 외부에서 접근 불가
//      println(innerVal)
//      innerFun()
    }

    inner class Inner1 {
        var innerVal = 200
        fun innerFun() {
            println("outerVal: $outerVal1")
            outerFun()
        }
    }
}

interface Inter1 {
    fun interFun1()
    fun interFun2()
}