fun main() {
    var d = firstFunc(1, 2)
    println("firstFunc: $d")

    d = secondFunc(400)
    println("secondFunc: $d") // 500

    function()
    function(1)
    function(2.0)
    function(1, 2)

    outer()
}

fun firstFunc(a: Int, b: Int): Int {
    val c = a + b
    return c
}

fun secondFunc(a: Int = 100, b: Int = 100): Int {
    return a + b
}

// 함수 overloading
fun function() {
    println("매개변수가 없는 함수")
}

fun function(a: Int = 1) {
    println("매개변수가 하나 있는 함수: ${a}")
}

fun function(a: Double = 1.0) {
    println("매개변수가 다른 자료형인 함수: $a")
}

fun function(a: Int, b: Int) {
    println("매개변수가 두 개인 함수: $a, $b")
}

fun outer() {
    println("outer")

    fun inner() {
        println("inner")
    }

    inner()
}