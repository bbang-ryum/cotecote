class Solution {
    //문자열이 주어졌 때 아래 알고리즘을 사용해 압축한다
    //그룹 길이가 1이라면 문자를 s에 추가
    //그렇ㄱ지 않으면 문자를 출가한 뒤 그룹의 길이를 덧붙인다
    //10을 초과하는 그룹은 두 자리를 차지한다
    //입력 배열을 수정한 뒤에 새로운 길이를 반환한다
    //상수 공간만 사용해야 한다
    //[a, a, b, b, c, c, c] => 6, [a, 2, b, 2, c, 3]
    //[a, a, b] => [a, 2 ,b], 3
    fun compress(chars: CharArray): Int {
        var left = 0
        var right = 0

        while (right <= chars.lastIndex) {
            val targetChar = chars[right]
            var count = 0

            while (right <= chars.lastIndex && chars[right] == targetChar) {
                right += 1
                count += 1
            }

            chars[left] = targetChar
            left += 1

            if (count > 1) {
                for (digit in count.toString()) {
                    chars[left] = digit
                    left += 1
                }
            }
        }

        return left
    }
}
