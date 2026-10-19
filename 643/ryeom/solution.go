package solution

func findMaxAverage(nums []int, k int) float64 {
	sum := 0

	// 첫 k개의 합 구하기
	for i := 0; i < k; i++ {
		sum += nums[i]
	}
	maxSum := sum

	// 구간을 오른쪽으로 한 칸씩 이동
	for i := k; i < len(nums); i++ {
		sum -= nums[i-k] // 기존 구간의 맨 앞 숫자 빼기
		sum += nums[i]   // 새로 들어오는 숫자 더하기

		if sum > maxSum {
			maxSum = sum
		}
	}

	return float64(maxSum) / float64(k)
}
