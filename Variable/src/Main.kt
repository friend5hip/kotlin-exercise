fun main() {
    // 변하지 않는 값인 리터럴
    val variable = "variable"
    val int = 3

    // 정수 리터럴
    val int2 = 222_222

    // 실수 리터럴
    println("F가 없으면 double: " + 33.33) // 8 bytes
    println("F가 있으면 float: " + 33.33F) // 4 bytes

    // 문자열과 문자
    val string: String = "String"
    val char: Char = 'c'

    val t: Boolean = true || false

    // Raw String
    println("""
        여러줄을 작성할 때 씁니다.
    """.trimIndent())

    // var, val
    // var: 변수, val: 상수
    var text: String = "리터럴"
    val text2 = "리터럴"
    text = "리터럴"
//  text2 = "리터럴" // Error: 값 변경 불가

    // 문자열 보간법
    println("저는 ${text}살입니다.")
    println("저는 $text 살입니다.") // 뒤에 공백이 있을 경우 중괄호 생략 가능

    // Nullable 변수
    var a : String? = null // 자료형에 ?를 붙여 null 값 허용

    var c : String = a!!

    // 안전하게 언래핑
    if (a != null) {
        var d = a
    }

    // 새로운 변수로 선언하면서 null일 때 디폴트 값 사용
    var f = a ?: "default"
}