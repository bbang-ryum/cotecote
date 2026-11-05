package solution

import "sort"

func closeStrings(word1 string, word2 string) bool {
	if len(word1) != len(word2) {
		return false
	}

	counts1 := map[rune]int{}
	counts2 := map[rune]int{}
	for _, ch := range word1 {
		counts1[ch]++
	}
	for _, ch := range word2 {
		counts2[ch]++
	}

	// 문자 종류가 같은지 확인
	if len(counts1) != len(counts2) {
		return false
	}
	for ch := range counts1 {
		if counts2[ch] == 0 {
			return false
		}
	}

	// 문자별 횟수만 모으기
	freq1 := []int{}
	freq2 := []int{}
	for _, count := range counts1 {
		freq1 = append(freq1, count)
	}
	for _, count := range counts2 {
		freq2 = append(freq2, count)
	}

	// 순서를 맞춘 뒤 비교
	sort.Ints(freq1)
	sort.Ints(freq2)
	for i := 0; i < len(freq1); i++ {
		if freq1[i] != freq2[i] {
			return false
		}
	}
	return true
}
