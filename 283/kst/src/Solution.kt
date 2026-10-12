class Solution {
    //정수형 배열을 받았을 때 0을 맨 뒤로 재배치하고 0이 아닌 숫자는 기존 순서대로 재배치
    //파라미터로 들어온 정수형 배열에 작업해야 하고 복사하면 안된다.
    //left, right
    //while right <= nums.lastIndex
    //if num

    fun moveZeroes(nums: IntArray) {
        var left = 0
        var right = 0

        while (right <= nums.lastIndex) {
            while (left <= nums.lastIndex && nums[left] != 0) {
                left += 1
                right = left + 1
            }


            if (right <= nums.lastIndex && nums[right] != 0) {
                nums[left] = nums[right]
                nums[right] = 0
            }

            right += 1
        }
    }
}
