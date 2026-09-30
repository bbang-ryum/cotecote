package solution

import "strings"

func reverseWords(s string) string {
	list := strings.Fields(s)
	r := []string{}
	for i := len(list) - 1; i >= 0; i-- {
		r = append(r, list[i])
	}

	return strings.Join(r, " ")
}
