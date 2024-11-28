fun main() {
    val t1 = Test<Int>()
    t1.test1(Int.MAX_VALUE)

    val t2 = Test<String>()
    t2.test1("What")

    val t3 = Test2<Int, String, Double, Boolean>(10, "Hello World!")
    t3.test2(0.1, true)

}

class Test<T> {
    val a1: T? = null
    fun test1(a1: T) {
        println("a1: $a1")
    }
}

class Test2<A, B, C, D>(var a1: A, var a2: B) {
    fun test2(a3: C, a4: D) {
        println("a1: $a1")
        println("a2: $a2")
        println("a3: $a3")
        println("a4: $a4")
    }
}

// 불변성: 제네릭에 키워드를 붙이지 않는다
class Test3<T>