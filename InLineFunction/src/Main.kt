fun main() {
    normalFunction()
    inLineFunction()
}

fun normalFunction() {
    println("-----------")
    println("Hello World")
    println("-----------")
}

// 함수의 수행문 자체가 함수가 호출된 부분에서 실행되어 성능상의 이점을 얻을 수 있다.
inline fun inLineFunction() {
    println("-----------")
    println("Hello World")
    println("-----------")
}