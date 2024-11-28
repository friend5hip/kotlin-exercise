fun main() {
    // 일반 클래스: 동일한 클래스를 생성해도 항상 다른 객체
    val t1 = TestClass(100, 200)
    val t2 = TestClass(100, 200)
    if (t1 == t2) {
        println("같은 객체")
    } else {
        println("항상 다른 객체")
    }

    // 데이터 클래스: 주 생성자의 멤버 변수가 같으면 같은 객체
    val d1 = DataClass(100, 200)
    val d2 = DataClass(100, 200)
    if (d1 == d2) {
        println("주 생성자의 멤버 변수가 같으면 같은 객체")
    } else {
        println("주 생성자의 멤버 변수가 다르면 다른 객체")
    }

    println(t1)
    println(d1)

    // 데이터 클래스는 복사가 가능
    val dcopy = d1.copy()
    println("dcopy.a1: ${dcopy.a1}")

    dcopy.a1 = 1000
    println("dcopy.a1: ${dcopy.a1}")
    println("d1: ${d1.a1}")

    // 데이터 클래스의 주 생성자 개수만큼 component 메서드 자동 생성
    // 주 생성자의 첫 번째 멤버 변수 값을 반환
    d1.component1()
    // 주 생성자의 두 번째 멤버 변수 값을 반환
    d1.component1()
    println("d1.component1(): ${d1.component1()}")
    println("d1.component2(): ${d1.component2()}")
}

data class Product(val name: String, val price: Double)

// 일반 클래스
class TestClass(a1: Int, a2: Int) {
    var a3: Int = 0
}

// 데이터 클래스
data class DataClass(var a1: Int, var a2: Int) {
    var a3: Int = 0
}