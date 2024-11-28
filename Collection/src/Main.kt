fun main() {
    /**
     * Kotlin의 Collection
     * Array, List, Map, Set
     */
    // 배열
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val arr2 = Array(10) {
        0
    }
    val arr3 = Array(10) {
        it
    }
    val twodimArr = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    val intArr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val intArr2 = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val doubleArr = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0)
    val arrPlus = arr.plus(11)
    
    // 리스트
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    // 맵
    val map = mapOf("1" to 1, "2" to 2, "3" to 3, "4" to 4, "5" to 5)
    val mutableMap = mutableMapOf("1" to 1, "2" to 2, "3" to 3, "4" to 4, "5" to 5)
    
    // 셋
    val set = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val mutableSet = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(arr)
    println(arr.contentToString())
    println(arrPlus.contentToString())

    println(list)

    println(map)

    println(set)
}