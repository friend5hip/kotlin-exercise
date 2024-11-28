fun main() {
    /**
     * Companion은 Java의 static과 동일한 개념
     */
    // 일반 멤버 변수, 메서드는 클래스 객체 생성 후 사용
    val testClass = TestClass()
    println(testClass.a1)
    testClass.testFun()

    // 컴패니언은 클래스 이름으로 직접 접근
    TestClass.compFun()

    // 일반 필드, 메서드는 객체 생성 후 접근
    val javaMain = JavaMain()
    println("a1: ${javaMain.javaA1}")
    javaMain.javaMethod1()

    // 정적 변수나 메서드는 클래스 이름으로 직접 접근
    println("a2: ${JavaMain.javaA2}")
    JavaMain.javaMethod2()

}

class TestClass {
    // 일반 멤버 변수
    var a1 = 100

    // 일반 메서드
    fun testFun() {
        println("testFun")
        println("a2: $a2")
    }

    // Companion: 클래스 당 하나만 생성 가능
    companion object {
        // 컴패니언 멤버 변수
        var a2 = 200
        var a3 = 300
        fun compFun() {
            println("a2: $a2")
//          println("a1: $a1") // 컴패니언 블록 외부의 멤버 변수는 접근 불가
            println("compFun")
        }

        @JvmStatic // Java에서 companion 키워드를 붙이지 않고 Kotlin과 동일하게 접근 가능
        var a4 = 400
    }
}
