var a: Int? = null
var b: String? = null

fun main() {
    /**
     * null은 값이 없다는 것을 의미하는 값
     * 대부분의 객체를 Nullable로 선언할 수 있다.
     * Nullable 객체는 값이 null인지 아닌지 확인
     */

    val t1: Test1? = null
    val t2: Test1? = Test1()
    // null을 허용하는 프로퍼티를 그냥 사용할 경우 null 값인지 아닌지
    // 확인하라는 의미에서 컴파일 오류를 발생시킨다.
//  t1.a1

    // "?:" 연산자는 왼쪽 피연산자가 null일 경우 오른쪽 피연산자를,
    // 아닐 경우 왼쪽 피연산자를 반환한다.
    println("---------------------------------------")
    var t3: Test1 = t1 ?: Test1()
    var t4: Test1 = t2 ?: Test1()

    // "?." 연산자
    println(t1?.a1) // null
    println(t2?.a1) //

    // 메서드가 null일 경우 메서드 호출이 취소된다.
    t1?.fun1()
    t2?.fun1()
}

class Test1 {
    var a1 = 100

    fun fun1() {
        println("Test1의 fun1")
    }

    fun fun2(): Int {
        return 100
    }
}