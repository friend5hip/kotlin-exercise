// 상속 및 인터페이스 구현
open class SuperClass1
interface Inter1

class SubClass1 : SuperClass1(), Inter1 {
    fun subclassMethod() {
        println("SubClass1 method 호출")
    }
}

fun main() {
    // 타입 캐스팅 예제
    val superClassInstance: SuperClass1 = SubClass1() // 업캐스팅
    val inter1Instance: Inter1 = SubClass1() // 인터페이스 타입으로 캐스팅

    // 안전한 캐스팅 using 'as?'
    val subClass1Instance1 = superClassInstance as? SubClass1
    subClass1Instance1?.subclassMethod() // 안전한 호출 (null 체크)

    // 강제 캐스팅 using 'as'
    try {
        val subClass1Instance2 = superClassInstance as SubClass1
        subClass1Instance2.subclassMethod()
    } catch (e: ClassCastException) {
        println("강제 캐스팅 실패: ${e.message}")
    }

    // 타입 확인 using 'is'
    if (superClassInstance is SubClass1) {
        superClassInstance.subclassMethod() // 타입이 맞으면 자동으로 캐스팅됨
    } else {
        println("superClassInstance는 SubClass1 타입이 아닙니다.")
    }

    // 잘못된 타입 캐스팅 예제
    val unrelatedInstance: Any = "문자열 객체"
    val subClass1Instance3 = unrelatedInstance as? SubClass1
    if (subClass1Instance3 == null) {
        println("unrelatedInstance를 SubClass1로 캐스팅할 수 없습니다.")
    }
}
