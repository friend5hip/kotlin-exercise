package org.example

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`) // in은 backtick으로 감싸줘야 합니다.

    // 정수형 데이터 입력
    println("숫자를 입력하세요.")
    val int = sc.nextInt()
    println("입력한 값은 ${int}입니다.")

    // 문자열 입력
    println("문자열을 입력하세요.")
    val str = sc.next()
    val str2 = sc.nextLine()
    val readLine = readLine()
    println("입력한 값은 ${str}입니다.")

    // boolean 값 입력
    println("true 혹은 false를 입력하세요.") // 대소문자를 구분하지 않습니다.
    val bool = sc.nextBoolean()
    println("입력한 값은 ${bool}입니다.")
}
