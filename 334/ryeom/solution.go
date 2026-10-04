package solution

func increasingTriplet(nums []int) bool {
	n1 := nums[0]
	n2 := 0
	needSecond := true
	for i := 1; i < len(nums); i++ {
		if nums[i] <= n1 { // 현재 값이 첫 후보보다 작거나 같으면 교체
			n1 = nums[i]
		} else if needSecond || nums[i] <= n2 {
			// 두 번째 후보가 없거나, 현재 값이 기존 두 번째 후보보다 작거나 같으면
			n2 = nums[i]
			needSecond = false // 두 번째 후보 확보
		} else {
			return true // 두 번째 후보보다 큰 숫자를 찾았으므로 성공
		}
	}
	return false
}
