fun main() {
    /** Property 프로퍼티
     * 객체의 변수를 외부에서 바로 접근하지 못하게 하는 것을 캡슐화라고 하고
     * 이런 변수에 getter, setter를 설정해주게 되면 Property라고 할 수 있다.
     */
    val obj1 = TestClass(100, 200)
    println(obj1.a1)    // 주 생성자 변수는 기본적으로 접근 불가함
    val obj2 = TestClass2(100, 200)
    obj2.a1 =  200
    obj2.a2 = 300
    val obj3 = TestClass3()
    obj3.v1 = 123213
}

class TestClass(a1: Int, a2: Int) {

}

/**
 * var: Java 코드로 변환 시 Getter, Setter가 생성된다.
 * val: Java 코드로 변환 시 Getter만 생성된다.
 * 멤버 변수도 마찬가지다.
 */
class TestClass2(var a1: Int, var a2: Int) {
    var v1: Int = a1
    val v2: Int = a2
}

class TestClass3 {
    var v1: Int = 0
    var v2: Int = 0
        get() {
            println("getter")
            return field
        }
        set(value) {
            field = value
        }

    val v3: Int = 100
        get() {
            return field
        }
}