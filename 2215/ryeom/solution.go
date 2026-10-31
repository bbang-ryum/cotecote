package solution

func findDifference(nums1 []int, nums2 []int) [][]int {
	uq1 := map[int]bool{}
	for _, n := range nums1 {
		uq1[n] = true
	}
	uq2 := map[int]bool{}
	for _, n := range nums2 {
		uq2[n] = true
	}

	only1 := []int{}
	for n := range uq1 {
		if !uq2[n] {
			only1 = append(only1, n)
		}
	}
	only2 := []int{}
	for n := range uq2 {
		if !uq1[n] {
			only2 = append(only2, n)
		}
	}
	return [][]int{only1, only2}
}
