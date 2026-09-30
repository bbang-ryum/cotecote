class Solution {
    //문자열이 주어졌을 때 모음만 역순으로 정렬된 새로운 문자열을 반환해라
    //IceCreAm -> AceCreIm
    //문자열을 순회하면서 대소문자 구분 없이 모음이라면 문자와 인덱스를 기록.
    //문자열 순회가 끝났으면 기록했던 것을 앞뒤로 하나씩 꺼내서 교환. 하나만 있는 경우 그대로
    private val vowels = listOf('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')
    fun reverseVowels(word: String): String {
        val vowels = getVowels(word)
        val answer = StringBuilder(word)

        while (vowels.size >= 2) {
            val head = vowels.removeFirst()
            val tail = vowels.removeLast()

            answer[head.index] = tail.character
            answer[tail.index] = head.character
        }

        return answer.toString()
    }

    fun getVowels(word: String): MutableList<Vowel> {
        return word.mapIndexedNotNull { index, ch ->
            if (ch in vowels) {
                return@mapIndexedNotNull Vowel(
                    index = index,
                    character = ch
                )
            }

            null
        }.toMutableList()
    }
}

data class Vowel(
    val index: Int,
    val character: Char
)
