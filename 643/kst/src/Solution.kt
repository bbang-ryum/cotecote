import kotlin.math.max

class Solution {
    //정수형 배열 nums와 정수 k가 주어졌을 때
    //연속부분수열의 길이가 k일 때 연속부분수열의 숫자 평균이 가장 컸을 때의 실수를 반환해라
    //while right < nums.lastIndex
    //while (right - left < k) {
    //max
    //sum
    //right += 1
    //
    // }
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var max: Double? = null
        var current = 0.0
        var left = 0
        var right = 0

        while (right <= nums.lastIndex) {
            if (right - left < k) {
                current += nums[right]
                right += 1

                continue
            }

            max = getMax(max, current)

            current -= nums[left]
            left += 1
        }

        max = getMax(max, current)

        return max / k
    }

    private fun getMax(max: Double?, current: Double): Double {
        return if (max == null) current else max(max, current)
    }
}
