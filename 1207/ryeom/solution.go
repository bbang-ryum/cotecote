package solution

func uniqueOccurrences(arr []int) bool {
	counts := map[int]int{}
	for _, v := range arr {
		counts[v]++
	}

	seen := map[int]bool{}
	for _, count := range counts {
		if seen[count] {
			return false
		}
		seen[count] = true
	}

	return true
}
