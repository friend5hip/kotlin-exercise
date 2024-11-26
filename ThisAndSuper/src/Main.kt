fun main() {
    var obj1 = TestClass1()
    println(obj1.testFun1())

    var obj2 = SubClass()
    obj2.subFun1()
}

class TestClass1(var a2: Int) {
    constructor() : this(100)

    var a1 = 100

    fun testFun1() {
        var a1 = 200

        println("a1: $a1")
        println("this.a1: ${this.a1}")

        fun testFun2() {
            println("testFun1 내부의 testFun2")
        }

        testFun2()
        this.testFun2()
    }

    fun testFun2() {
        println("testFun2")
    }
}

open class SuperClass(var a2: Int) {
    open var a1 = 100

    open fun superFun1() {
        println("SuperClass의 superFun1")
    }
}

class SubClass: SuperClass(200) {
    override var a1 = 1000

    fun subFun1() {
        println("a1: $a1")
        println("this.a1: ${this.a1}")

        superFun1()
        super.superFun1()
    }
}