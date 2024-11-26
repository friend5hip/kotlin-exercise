import com.jeon.pkg.module2.TestClass2

fun main() {
    /**
     * 모듈은 하나의 독립 실행 단위, 모듈끼리 통신도 가능
     */
    println("메인 모듈입니다.")
    
    // 프로젝트 구조에서 Module2를 종속 요소에 추가해야 한다.
    val testClass = TestClass()
    val testClass2 = TestClass2()
}