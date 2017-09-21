import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MaxSubarrayTest {
    @Test
    fun findMaxSubarray() {
        assertArrayEquals(arrayOf(5, 0, 62, -11, 21), findMaxSubarray(arrayOf(-74, 5, 0, 62, -11, 21, -42, -58)))
        assertArrayEquals(arrayOf(34, 96), findMaxSubarray(arrayOf(83, -79, 62, -93, 34, 96, -32)))
        assertArrayEquals(arrayOf(33, 40, -63, 72), findMaxSubarray(arrayOf(36, 43, -75, -30, 33, 40, -63, 72)))
        assertArrayEquals(arrayOf(20), findMaxSubarray(arrayOf(20, -9, -44, 6, -92, 14, -88)))
        assertArrayEquals(arrayOf(), findMaxSubarray(arrayOf(-62, -20, -22, -27, -74, -8)))
    }
}