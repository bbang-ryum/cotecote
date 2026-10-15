package solution

func isSubsequence(s string, t string) bool {
	si := 0
	ti := 0

	for si < len(s) && ti < len(t) {
		if s[si] == t[ti] {
			si++
		}
		ti++
	}

	return si == len(s)
}
