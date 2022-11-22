package problems

/*
* Search for an x in sorted array that has been rotated at some unknown point.
* There are no duplicates. if x is not found return -1.
*
* e.g 1 => [4,5,6,7,0,1,2]
* x = 0
* return 4
*
* [4,5,6,7,0,1,2] [0,1,2,4,5,6,7]
* x = 3
* return -1
* */
class FindXInRotatedArray {

    fun search(list: Array<Int>, x: Int): Int {
        var start = 0
        var end = list.size - 1

        while (start <= end) {
            val mid = (start + end) / 2
            if (list[mid] == x) {
                return mid
            }

            if (list[start] < list[mid]) { // check the array is not rotated from start to mid
                if (list[start] <= x && list[mid] >= x) { //check the x is lie b/w start and mid
                    end = mid - 1
                } else {
                    start = mid + 1
                }
            } else {
                if (list[mid] < x && list[end] >= x) //check the x is lie b/w mid and end
                    start = mid + 1
                else
                    end = mid - 1
            }
        }

        return -1
    }
}