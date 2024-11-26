fun main() {
    val firstClass = FirstClass()
    val firstClass2 = FirstClass(5)
    val thirdClass = ThirdClass("Alice", 20)
    val thirdClass2 = ThirdClass("Bob")
}

class FirstClass {
    // init 블록
    init {
        println("First Class init")
    }
    constructor() {
        println("first class constructor")
    }
    // 보조 생성자
    constructor(a1: Int) {
        println("Second constructor's a1: $a1")
    }
}

// 주 생성자 (기본 생성자)
// 주 생성자를 사용하면 멤버 변수로 자동으로 추가됨
class SecondClass constructor() {}

// SecondClass의 축약형
class ThirdClass(name: String, age: Int) {
    init {
        println("Third Class init, name: $name, age: $age")
    }
    // 보조 생성자 (this 키워드를 사용해야 함)
    constructor(tag: String) : this(tag, 20) {
        println("Second constructor's tag: $tag")
    }
}