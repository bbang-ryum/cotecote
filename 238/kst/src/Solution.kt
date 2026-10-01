class Solution {
    //정수형 배열이 주어졌을 때 동일한 길이의 정수형 배열을 반환하지만 i 요소는 i 를 제외한 다른 요소의 곱인 정수형 배열을 반환한다
    //요소의 곱은 정수형을 벗어나지 않는 것을 보장한다

    //[1, 2, 3, 4] -> [24, 12, 8, 6]
    //앞에서 부터 곱한 값.
    //뒤에서 부터 곱한 값
    //앞뒤 곱
    fun productExceptSelf(nums: IntArray): IntArray {
        val multiplyAsc = multiplyAsc(nums)
        val multiplyDesc = multiplyDesc(nums)
        val result = IntArray(nums.size)

        nums.indices.forEach { index ->
            val left = getLeft(index, multiplyAsc)
            val right = getRight(index, multiplyDesc)

            result[index] = left * right
        }

        return result
    }

    fun getLeft(index: Int, multiples: IntArray): Int {
        if (index == 0) {
            return 1
        }

        return multiples[index - 1]
    }

    fun getRight(index: Int, multiples: IntArray): Int {
        if (index == multiples.lastIndex) {
            return 1
        }

        return multiples[index + 1]
    }


    fun multiplyDesc(nums: IntArray): IntArray {
        var accumulator = 1
        val result = IntArray(nums.size)

        (nums.lastIndex downTo 0).forEach { i ->
            accumulator *= nums[i]
            result[i] = accumulator
        }

        return result
    }

    fun multiplyAsc(nums: IntArray): IntArray {
        var accumulator = 1
        val result = IntArray(nums.size)

        nums.indices.forEach { i ->
            accumulator *= nums[i]
            result[i] = accumulator
        }

        return result
    }
}
