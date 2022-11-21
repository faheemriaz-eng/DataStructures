fun main(args: Array<String>) {

    println("\n\n============ Binary Search Example ============\n\n")
    val array: Array<Int> = arrayOf(1, 2, 3, 12, 14, 15, 66, 78, 99, 233)
    val binarySearch = BinarySearch()
    val targetValue = 233
    val indexOf = binarySearch.search(array = array, targetValue = targetValue)
    if (indexOf != -1)
        println("indexOf value: $targetValue is $indexOf")
    else
        println("Target value doesn't exist in the array")

}