package solution

import "sort"

func maxOperations(nums []int, k int) int {
	sort.Ints(nums)
	left := 0
	right := len(nums) - 1
	c := 0

	for left < right {
		sum := nums[left] + nums[right]
		if sum < k {
			left++
		} else if sum > k {
			right--
		} else {
			c++
			left++
			right--
		}
	}
	return c
}
