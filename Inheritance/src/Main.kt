fun main() {
    /**
     *  상속: 부모 클래스의 멤버, 멤버 메서드를 물려받는 개념
     *  Kotlin에서는 상속 가능한 클래스를 선언할 때 open 키워드를 붙여준다.
     */
    var super2 = Super2()
    var sub2 = Sub2()
    println("sub2의 멤버: ${sub2.sub2Member}")
    println("super2의 멤버: ${super2.super2Member}")
    sub2.sub2Fun()
    sub2.super2Fun()    // 부모 클래스의 메서드 호출
}

// open 키워드가 없으면 상속할 수 없음 (public final class이기 때문)
open class Super


class Sub: Super { // "Super()": 자식 클래스의 객체 생성 시 부모 클래스의 생성자를 항상 호출
    constructor() : super()
}

// 매개변수가 있을 경우
open class Super2 {
    var super2Member = 100

    fun super2Fun() {
        println("Super2의 메서드")
    }
}

class Sub2 : Super2() {
    var sub2Member = 200

    fun sub2Fun() {
        println("Sub2의 메서드")
    }
}

// 부모 클래스에 매개변수가 있을 경우
open class Super3(a1: Int) {

}

// 부모 클래스 생성자를 호출해줘야 한다.
class Sub3() : Super3(100) {

}