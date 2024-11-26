fun main() {
    // for문
    val numbers = arrayOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        print("$number ")
    }
    println()

    // 범위 연산자를 이용한 for문
    for (i in numbers.indices) {
        print("$i ")
    }
    println()

    // for문의 증가량을 step만큼 증가시키며 반복한다.
    val numbers2 = 0..9 step 2
    for (i in numbers2) {
        print("$i ")
    }
    println()
    // 역순으로
    val numbers3 = 9 downTo 0 step 2
    for (i in numbers3) {
        print("$i ")
    }
    println()

    // 범위 연산자 자체는 줄어들게 할 수 있으나
    // for문에서 사용할 수는 없음
    val numbers4 = 9..0
    for (number in numbers4) {
        print("$number ")
    }

    // while문, do-while은 Java와 동일
}