package solution

func longestSubarray(nums []int) int {
	maxCount := 0
	start := 0
	zeroCount := 0

	for end := 0; end < len(nums); end++ {
		if nums[end] == 0 {
			zeroCount++
		}

		// 0이 2개 이상이면 앞에서부터 구간 줄이기
		for zeroCount >= 2 {
			if nums[start] == 0 {
				zeroCount--
			}
			start++
		}

		// 반드시 하나를 삭제하므로 구간 길이에서 1을 빼기
		count := end - start
		if count > maxCount {
			maxCount = count
		}
	}

	return maxCount
}
