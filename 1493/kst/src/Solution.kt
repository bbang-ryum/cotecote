import kotlin.math.max

class Solution {
    //0과 1이 들어있는 정수형배열 nums가 주어지고 그 중 1개의 요소를 삭제했을 때
    //1만 포함되어 있는 가장 긴 부분배열의 길이를 반환해라.
    //[1, 1, 0, 1] => 3
    //removed
    //while right <= nums.lastIndex
    //
    //
    fun longestSubarray(nums: IntArray): Int {
        var left = 0
        var right = 0
        var deleted = false
        var max = 0

        while (right <= nums.lastIndex) {
            var rightBit = nums[right]

            while (rightBit == 1 || rightBit == 0  && !deleted) {
                right += 1
                max = max(max, right - left)

                if (rightBit == 0) {
                    deleted = true
                }

                if (right > nums.lastIndex) {
                    break
                }

                rightBit = nums[right]
            }

            while (deleted) {
                if (nums[left] == 1) {
                    left += 1
                    continue
                }

                left += 1
                deleted = false
            }
        }

        return max - 1
    }
}
