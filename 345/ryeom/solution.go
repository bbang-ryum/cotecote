package solution

import "strings"

func reverseVowels(s string) string {
	chars := []byte(s)
	arr := []byte{}
	for i := 0; i < len(chars); i++ {
		if strings.ContainsRune("aeiouAEIOU", rune(chars[i])) {
			arr = append(arr, chars[i])
		}
	}
	j := len(arr) - 1
	for i := 0; i < len(chars); i++ {
		if strings.ContainsRune("aeiouAEIOU", rune(chars[i])) {
			chars[i] = arr[j]
			j--
		}
	}
	return string(chars)
}
