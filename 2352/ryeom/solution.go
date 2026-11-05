package solution

func equalPairs(grid [][]int) int {
	count := 0

	for _, row := range grid {
		for columnIndex := range row {
			// 여기서 시작
			same := true

			for position := range row {
				if row[position] != grid[position][columnIndex] {
					same = false
					break
				}
			}
			if same {
				count++
			}
		}
	}
	return count
}
