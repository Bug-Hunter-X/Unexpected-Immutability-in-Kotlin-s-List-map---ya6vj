fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.map { it * 2 }
    println(list) //This will still print the original list

    val doubledList = list.map { it * 2 }.toMutableList()
    println(doubledList) //This will print the doubled list

    list.replaceAll { it * 2 } //This will modify the original list
    println(list) //This will print the modified list
}