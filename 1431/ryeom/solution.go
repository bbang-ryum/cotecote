package solution

func kidsWithCandies(candies []int, extraCandies int) []bool {
	result := []bool{}
	max := 0

	// 현재 가장 많은 사탕 수 찾기
	for i := 0; i < len(candies); i++ {
		if candies[i] > max {
			max = candies[i]
		}
	}

	// 각 친구들한테 추가 사탕을 전부 줬을 때 확인
	for i := 0; i < len(candies); i++ {
		result = append(result, candies[i]+extraCandies >= max)
	}

	return result
}
