class Solution {
    //정수형 배열 nums가 주어졌을 때 좌우 총합이 같아지는 인덱스를 반환해라
    //0번 째 인덱스의 촤측은 0, 우측도 0
    //nums 순회 총합 함
    //left = 0
    //right = 총합
    //index = 0
    //while (index <= nums.lastIndex) {
    //current = nums[index]
    //if left == right return index
    //index += 1
    //left += current
    //right -= current
    //
    // }
    //
    //return -1
    fun pivotIndex(nums: IntArray): Int {
        var index = 0
        var left = 0
        var right = nums.sum()

        while (index <= nums.lastIndex) {
            if (left == right - nums[index]) {
                return index
            }

            left += nums[index]
            right -= nums[index]
            index += 1
        }

        return -1
    }
}
