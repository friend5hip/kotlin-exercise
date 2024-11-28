fun main() {
    println(testFun1(10, 20))
    testFun2()
    testFun3()
    println(testFun4(10, 30))

    val r1 = lambda1(100, 200)
    println(r1)
    val r2 = lambda4(100, 200)
    println(r2)
}

// 매개변수로 들어오는 값을 계산하여 반환하는 함수
fun testFun1(a1: Int, a2: Int): Int {
    return a1 + a2
}

fun testFun2() {
    println("testFun2")
}

fun testFun3(): Unit {  // Unit은 생략 가능
    println("testFun3")
}

fun testFun4(a1: Int, a2: Int): Int = a1 + a2

val lambda1: (Int, Int) -> Int = { a1: Int, a2: Int -> a1 + a2 }
val lambda2 = {a1: Int, a2: Int -> a1 + a2} // 타입 생략 형태
val lambda3: (Int, Int) -> Int = { a1, a2: Int -> a1 + a2 } // 수행문의 변수 타입 생략
val lambda4 = { a1: Int, a2: Int ->
    val r1 = a1 + 100
    val r2 = a2 + 200
    // 제일 마지막에 작성한 값, 변수의 값을 결과로 반환한다.
    r1 + r2
}