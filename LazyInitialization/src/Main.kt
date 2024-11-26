fun main() {
    /**
     * 지연 초기화는 일단 할당한 후에 나중에 초기화할 것을 선언하는 행위
     * var의 경우 lateinit 키워드를 붙이는 것으로 구현 가능, lateinit은 참조형 변수에만 사용 가능
     * val의 경우 by lazy 블록으로 구현 가능
     */
    val tc = TestClass()
    println(tc.a1)
    println(tc.a2)
    println(tc.a4)
}

class TestClass {
    var a1: Int = 100
    var a2: Int // 초기화를 해라
//    lateinit var a3: Int // 내 알아 초기화할게
    val a4: Int by lazy {
        println("a4 initialized")
        300
        500
    }

    // init 블록에서 초기화 시 lateinit이 필요없음
    init {
        a2 = 100
    }

    fun testFun() {
//        if (!::a3.isInitialized) {
//            a3 = 200
//        }
//        println("a3 = $a3")
//    }
    }
}