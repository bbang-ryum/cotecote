class Solution {
    //정수형 배열이 주어졌을 때 인덱스 i < j < k 조건에서 nums[i] < nums[j] < nums[k] 가 있는지 판별해라
    //[1, 2, 3, 4, 5] => true
    //[5, 4, 3, 2, 1] => false

    //if nums.size >= 2 return false
    //left 0 middle 1 right 2
    //while right <= nums.lastIndex
    //if (nums[right] > nums[middle] > nums[left]) return true

    //if nums[left] >= nums[middle]
    // middle += 1
    // while middle >= right
    // right += 1
    // continue

    //if nums[middle] >= nums[right]
    // right += 1
    // cotninue


    //while right <= middle right += 1 continue
    //while middle <= left middele += 1 continue
    //return false
    fun increasingTriplet(nums: IntArray): Boolean {
        if (nums.size <= 2) {
            return false
        }

        var first = Int.MAX_VALUE
        var second = Int.MAX_VALUE

        for (num in nums) {
            when  {
                num <= first -> first = num
                num <= second -> second = num
                else -> return true
            }
        }

        return false
    }
}
