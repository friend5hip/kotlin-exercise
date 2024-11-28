fun main() {
    var directionEnum: DirectionEnum = DirectionEnum.EAST

    printDirection(directionEnum)
}

enum class DirectionEnum {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

fun printDirection(dir: DirectionEnum) {
    when (dir) {
        DirectionEnum.EAST -> println("East")
        DirectionEnum.WEST -> println("West")
        DirectionEnum.SOUTH -> println("South")
        DirectionEnum.NORTH -> println("North")
    }
}

class Bread(val shape: BreadShape) {}

enum class BreadShape(val shapeName: String, val modelNumber: Int) {
    FISH("붕어빵", 111),
    FLOWER("국화빵", 123)
}