fun main() {
    val sub = Sub()
    sub.fun1()
    sub.fun2()
}

abstract class Super {
    fun fun1() {
        println("Super 클래스의 fun1")
    }

    abstract fun fun2()
}

class Sub : Super() {
    override fun fun2() {
        println("Sub 클래스의 fun2 구현")
    }
}