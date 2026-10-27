import kotlin.math.max

class Solution {
    //문자열 s와 정수 k가 주어졌을 때
    //s 안에서 길이가 k인 연속문자열의 최대 모음 갯수를 구하라.
    //abciiidef , 3-> 3
    //left right
    //while (right <= s.lastIndex)
    //while (right - left < 3) {
    //if (right.isVowel) += 1
    //right += 1
    //continue
    //if s[right] isVowel += 1
    //if s[left] isVowel -= 1
    //right += 1
    //left +=1

    private val vowels = listOf('a', 'e', 'i', 'o', 'u')
    fun maxVowels(s: String, k: Int): Int {
        var left = 0
        var right = 0
        var max = 0
        var current = 0

        while (right <= s.lastIndex) {
            while (right - left < k) {
                if (s[right].isVowel()) {
                    current += 1
                    max = current
                }
                right += 1
            }

            if (right > s.lastIndex) {
                break
            }

            val head = s[right]
            val tail = s[left]

            if (head.isVowel() && !tail.isVowel()) {
                current += 1
            }

            if (!head.isVowel() && tail.isVowel()) {
                current -= 1
            }

            max = max(current, max)

            left += 1
            right += 1
        }

        return max
    }

    private fun Char.isVowel(): Boolean {
        return vowels.contains(this)
    }
}
