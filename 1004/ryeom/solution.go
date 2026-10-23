package solution

func longestOnes(nums []int, k int) int {
	start := 0
	zeroCount := 0
	maxLength := 0

	for end := 0; end < len(nums); end++ {
		// 새로 들어온 숫자가 0이면 개수 증가
		if nums[end] == 0 {
			zeroCount++
		}

		// 0이 너무 많으면 앞에서부터 구간 줄이기
		for ; zeroCount > k; start++ {
			if nums[start] == 0 {
				zeroCount--
			}
		}

		// 조건을 만족하는 현재 구간의 길이
		length := end - start + 1
		if length > maxLength {
			maxLength = length
		}
	}

	return maxLength
}
