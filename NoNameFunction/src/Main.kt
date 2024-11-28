fun main() {
    testFunction1()

    // 익명 함수 호출: 익명 함수의 변수를 통해 함수를 호출한다.
    testFunction2()
}

fun testFunction1() {
    println("testFunction1")
}

val testFunction2 = fun() {
    println("익명 함수입니다.")
}