fun main() {

    /**
     * Any Class
     * Kotlin의 모든 클래스는 Any 클래스를 상속 받는다.
     */

    val testClass = TestClass1()
    println("testClass: $testClass")

    val testClass2 = TestClass2()
    testFun1(testClass2)
}

class TestClass1 {
    // Any 클래스의 메서드 오버라이딩
    override fun toString(): String {
        return "TestClass1의 객체입니다."
    }
}

class TestClass2 {
    override fun toString(): String {
        return "TestClass2의 객체입니다."
    }
}

fun testFun1(a1: Any) {
    println("a1: $a1")
}