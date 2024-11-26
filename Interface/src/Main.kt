fun main() {
    println("Hello World!")
}

abstract class A {
    abstract fun doSomething()
}

abstract class B {
    abstract fun doSomething()
}

class C : A() {
    override fun doSomething() {
        println("doSomething")
    }
}

interface Interface {
    var a1: String
    fun doSomething()
    fun doSomethingElse()
}

interface Interface2 {
    fun doSomethingElse()
    fun doSomethingElseElse()
}

class D: Interface, Interface2 {
    override var a1: String = "a1"
    override fun doSomething() {}
    override fun doSomethingElse() {}
    override fun doSomethingElseElse() {}
}