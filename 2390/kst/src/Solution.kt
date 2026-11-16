class Solution {
    //문자열 word가 주어졌을 때 *를 만나면 가장 처음 만나는 *가 아닌 문자 하나를 지운다
    //word에서 모든 *를 제거한 문자열을 반환해라
    fun removeStars(word: String): String {
        return word.fold(mutableListOf<Char>()) { builder, character ->
            if (character == '*') {
                builder.removeLast()
                return@fold builder
            }

            builder.addLast(character)
            builder
        }.joinToString("")
    }
}
