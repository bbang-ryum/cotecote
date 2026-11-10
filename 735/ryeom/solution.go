package solution

func asteroidCollision(asteroids []int) []int {
	result := []int{}
	for _, v := range asteroids {
		active := true
		// 현재가 음수이고, 마지막에 남은 소행성이 오른쪽으로 움직일 때
		for v < 0 && len(result) > 0 && result[len(result)-1] > 0 {
			last := result[len(result)-1]

			if last < -v {
				result = result[:len(result)-1]
			} else if last == -v {
				result = result[:len(result)-1]
				active = false
				break
			} else {
				active = false
				break
			}
		}
		if active {
			result = append(result, v)
		}
	}
	return result
}
