fun main() {
    // 내부 멤버 변수 및 메서드 호출
    val super1 = Super1()
    val sub1 = Sub1()
    println("super1의 멤버 변수: " + super1.super1)
    println("sub1의 멤버 변수: " + sub1.sub1)
    super1.super1fun()
    sub1.sub1fun()
    
    val super2: Super1 = sub1
    println("super2.super1: ${super2.super1}")
    super2.super1fun()

    // 자식 클래스 타입으로는 부모 클래스 객체 참조 불가
//  val sub2: Sub1 = super1

    // 오버라이딩
    val sub2: Sub2 = Sub2()
    sub2.super2fun()

    // 부모 클래스 타입으로는 자식 클래스 객체 참조 가능 (업캐스팅)
    val obj: Super2 = sub2
    obj.super2fun()
}

open class Super2 {
    open fun super2fun() {
        println("Super2의 메서드 호출")
    }
}

class Sub2: Super2() {
    override fun super2fun() {
        println("Sub2 클래스의 부모 메서드인 super2fun 오버라이딩")
    }
}

open class Super1 {
    var super1 = 100
    fun super1fun() {
        println("Super1의 super1fun 메서드 실행")
    }
}

class Sub1: Super1() {
    var sub1 = 200
    fun sub1fun() {
        println("Sub1의 sub1fun 메서드 실행")
    }
}