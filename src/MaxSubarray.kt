fun findMaxSubarray(array: Array<Int>): Array<Int> {
    var maxSum = -1
    var currentSum = 0
    var leftIndex = 0
    var currentLeftIndex = 0
    var rightIndex = -1

    for (i in 0..array.size - 1) {
        currentSum += array[i]
        if (currentSum > maxSum) {
            maxSum = currentSum
            leftIndex = currentLeftIndex
            rightIndex = i
        } else if (currentSum < 0) {
            currentLeftIndex = i + 1
            currentSum = 0
        }
    }
    return array.copyOfRange(leftIndex, rightIndex + 1)
}