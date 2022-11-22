import problems.FindXInRotatedArray

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

    val sortedRotatedArr: Array<Int> = arrayOf(5,6,7,12,34,3,4)
    val x  = 34
    val index = FindXInRotatedArray().search(sortedRotatedArr, x)


    if (index != -1)
        println("indexOf value FindXInRotatedArray: $x is $index")
    else
        println("Target value doesn't exist in the FindXInRotatedArray")


}