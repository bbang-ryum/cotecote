package solution

func removeStars(s string) string {
	result := []byte{}
	for i := 0; i < len(s); i++ {
		if s[i] != '*' {
			result = append(result, s[i])
		} else {
			result = result[:len(result)-1]
		}
	}
	return string(result)
}
