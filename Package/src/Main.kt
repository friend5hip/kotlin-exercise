import com.jeon.pck1.TestClass
import com.jeon.pck1.TestClass2

fun main() {
    /**
     * 패키지는 같은 기능을 가지는 코드 묶음 단위
     * "도메인을 거꾸로 한 형식을 사용한다. ex) com.naver.diary
     */
    // import해서 사용
    val testClass = com.jeon.pck1.TestClass()
    val testClass2 = TestClass()
    val testClass3 = TestClass2()

    testFunction()
}