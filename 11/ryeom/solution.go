package solution

func maxArea(height []int) int {
	left := 0
	right := len(height) - 1
	max := 0

	for left < right {
		// 낮은 벽 높이 구하기
		h := height[left]
		if height[right] < h {
			h = height[right]
		}

		// 너비 × 낮은 벽 높이
		area := (right - left) * h
		if area > max {
			max = area
		}

		// 낮은 벽 쪽을 안으로 이동
		if height[left] < height[right] {
			left++
		} else {
			right--
		}
	}

	return max
}
