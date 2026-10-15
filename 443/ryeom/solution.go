package solution

import "strconv"

func compress(chars []byte) int {
	read := 0
	write := 0

	for read < len(chars) {
		current := chars[read]
		count := 0

		// 같은 글자를 끝까지 읽으며 세기
		for read < len(chars) && chars[read] == current {
			count++
			read++
		}

		// 문자 쓰기
		chars[write] = current
		write++

		// 두 개 이상이면 개수도 쓰기
		if count > 1 {
			digits := strconv.Itoa(count)
			for j := 0; j < len(digits); j++ {
				chars[write] = digits[j]
				write++
			}
		}
	}

	return write
}
