import com.jeon.pkg.InternalClass2
import com.jeon.pkg.PublicClass2

fun main() {
    /**
     * 접근 제어자
     * public: 외부에서 접근 가능 (default)
     * private: 외부에서 접근 불가
     * protected: 상속 관계일 경우에 접근 가능
     * internal: 같은 모듈일 경우에 접근 가능
     */
    // 같은 패키지 내에서의 접근
    val testClass = TestClass()
    val privateClass = PrivateClass()
    val publicClass =  PublicClass()
    val protectedClass = ProtectedClass()
    val internalClass = InternalClass()

    // 다른 패키지 내에서의 접근
    val privateClass2 = PrivateClass2()
    val publicClass2 = PublicClass2()
    val ProtectedClass2 = ProtectedClass2()
    val internalClass2 = InternalClass2()

    val testClass3 = TestClass5()
    testClass3.private1
    testClass3.public
    testClass3.protected1
    testClass3.internal1
}

public class TestClass {
    private fun testFun() {

    }
}

class TestClass2 {
    fun testFun() {
        val test = TestClass()
    }
}