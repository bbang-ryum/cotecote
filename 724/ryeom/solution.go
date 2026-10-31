package solution

func pivotIndex(nums []int) int {
	totalSum := 0
	for _, k := range nums {
		totalSum += k
	}
	l := 0
	for i, n := range nums {
		if l == totalSum-l-n {
			return i
		}
		l += n
	}
	return -1
}
