package solution

func canPlaceFlowers(flowerbed []int, n int) bool {
	count := 0
	for i := 0; i < len(flowerbed); i++ {
		cur := flowerbed[i] == 0
		l := i == 0 || flowerbed[i-1] == 0
		r := i == len(flowerbed)-1 || flowerbed[i+1] == 0
		if cur && l && r {
			count++
			flowerbed[i] = 1
		}
	}
	return count >= n
}
