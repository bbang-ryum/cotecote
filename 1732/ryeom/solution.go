package solution

func largestAltitude(gain []int) int {
	altitude := 0
	maxAltitude := 0

	for i := 0; i < len(gain); i++ {
		altitude += gain[i]

		if altitude > maxAltitude {
			maxAltitude = altitude
		}
	}

	return maxAltitude
}
