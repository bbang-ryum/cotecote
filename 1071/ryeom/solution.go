package solution

import "strings"

func gcdOfStrings(str1 string, str2 string) string {
	answer := ""
	for size := 1; size <= len(str1); size++ {
		if len(str1)%size != 0 || len(str2)%size != 0 {
			continue
		}
		dep := str1[:size]
		if strings.Repeat(dep, len(str1)/size) == str1 &&
			strings.Repeat(dep, len(str2)/size) == str2 {
			answer = dep
		}
	}
	return answer
}
