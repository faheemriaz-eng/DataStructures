class BinarySearch {

    fun search(array: Array<Int>, targetValue: Int): Int {
        var upperBound = array.size - 1
        var lowerBound = 0

        while (upperBound >= lowerBound) {
            val indexMiddle = (lowerBound + upperBound) / 2
            if (array[indexMiddle] == targetValue)
                return indexMiddle

            if (array[indexMiddle] > targetValue) {
                upperBound = indexMiddle - 1
            } else {
                lowerBound = indexMiddle + 1
            }
        }
        return -1
    }
}