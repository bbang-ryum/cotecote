class Solution {
    //두 개의 문자열이 주어졌을 때 두 문자열을 나눌 수 있는 최대공통문자열을 구해라
    //ABCABC, ABC -> ABC
    //ABABAB, ABAB -> AB
    //LEET, CODE -> ""
    //AAAAAAB, AAA -> ""
    fun solve(word: String, otherWord: String): String {
        if (word.isEmpty() || otherWord.isEmpty()) {
            return ""
        }

        val (small, large) = divide(word, otherWord)
        val smallerWordDivisors = getDivisors(small).sortedByDescending { it.length }

        smallerWordDivisors.forEach { divisor ->
            var start = 0
            var end = divisor.lastIndex

            while (end <= large.lastIndex) {
                val sliced = large.slice(start..end)

                if (sliced != divisor) {
                    return@forEach
                }

                if (end == large.lastIndex) {
                    return divisor
                }

                start += divisor.lastIndex + 1
                end += divisor.lastIndex + 1
            }
        }

        return ""
    }

    private fun divide(word: String, otherWord: String): Pair<String, String> {
        if (word.length <= otherWord.length) {
            return Pair(word, otherWord)
        }

        return Pair(otherWord, word)
    }

    fun getDivisors(smallerWord: String): List<String> {
        var current = 0
        var divisorLength = 1
        var currentDivisor = smallerWord.slice(0 until divisorLength)
        val divisors = mutableListOf<String>()

        while (currentDivisor.length <= smallerWord.length) {
            var divided = smallerWord.slice(0 until divisorLength)

            while (divided == currentDivisor) {
                current += 1

                if (current * divisorLength == smallerWord.length) {
                    divisors.add(currentDivisor)

                    continue
                }

                if (current * divisorLength + divisorLength > smallerWord.length) {
                    break
                }

                divided = smallerWord.slice(current * divisorLength until current * divisorLength + divisorLength)
            }

            current = 0
            divisorLength += 1

            if (divisorLength > smallerWord.length) {
                break
            }

            currentDivisor = smallerWord.slice(0 until divisorLength)
        }

        return divisors
    }
}
