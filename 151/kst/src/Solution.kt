class Solution {
    //공백으로 구분되는 여러 단어가 들어있는 문자열 words를 받았을 때
    //공백을 기준으로 단어를 역순으로 변경한 값을 반환해라
    //문자열은 앞뒤로 trim이 되어야하고 단어 간 공백은 오직 하나만 있어야 한다
    //"the sky is  blue " -> "blue is sky the"
    //words trim
    //left right를 이용해 right는 끝까지 진행한다
    //만약 right가 공백 또는 다음이 없는 곳 까지 가면 left를 움직여 단어를 만든다
    //right까지 도달아하면 만든 단어를 PQ에 넣는다
    //문자열 순회가 끝났다면 PQ를 마지막 부터 하나씩 이어서 문자열을 만든다
    fun reverseWords(words: String): String {
        val trimWords = words.trim()
        val reversedWords = mutableListOf<String>()

        var left = 0
        var right = 0

        while (right <= trimWords.lastIndex) {
            val rightCharacter = trimWords[right]
            val builder = StringBuilder()

            if (rightCharacter == ' ' || right + 1 > trimWords.lastIndex) {
                while (left <= right) {
                    if (trimWords[left] != ' ') {
                        builder.append(trimWords[left])
                    }

                    left += 1
                }

            }

            if (builder.isNotEmpty()) {
                reversedWords.add(builder.toString())
            }

            right += 1
        }

        var current = reversedWords.lastIndex
        val result = StringBuilder()

        while (current >= 0) {
            result.append(reversedWords[current])

            if (current != 0) {
                result.append(" ")
            }

            current -= 1
        }

        return result.toString()
    }
}
