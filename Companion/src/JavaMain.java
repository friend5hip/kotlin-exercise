public class JavaMain {
    // 일반 필드와 메서드
    public int javaA1 = 100;

    public void javaMethod1() {
        System.out.println("javaMethod1");
    }

    // 정적 필드와 메서드
    public static int javaA2 = 200;

    public static void javaMethod2() {
        System.out.println("javaMethod2");
    }

    // Kotlin 클래스 사용 방법
    public static void main (String[] args) {
        TestClass t1 = new TestClass();
        System.out.println(t1.getA1()); // Getter 자동 생성
        t1.testFun();

        // Java에서 Companion object 접근 방법
        TestClass.Companion.compFun();  // without JvmStatic
        TestClass.getA4();  // with JvmStatic
    }
}
