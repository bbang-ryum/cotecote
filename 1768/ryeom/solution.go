func mergeAlternately(word1 string, word2 string) string {
	n1, n2 := len(word1), len(word2)
	str := make([]byte, 0, n1+n2)
	i := 0
	for i < n1 || i < n2 {
		if i < n1 {
			str = append(str, word1[i])
		}
		if i < n2 {
			str = append(str, word2[i])
		}
		i++
	}
	return string(str)
}
