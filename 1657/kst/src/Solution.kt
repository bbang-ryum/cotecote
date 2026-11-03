class Solution {
    //문자열 word1과 word2가 주어졌을 떄 두 문자열이 가까운 문자열인지 판별하라
    //가까운 문자열은 문자열들의 문자 순서나 문자를 다른 문자로 서로 교체해서 상대 문자열이 나온다면 가깝다고 판단한다
    //abc, cba -> true
    //a, aa -> false
    //cabbba. abbccc -> true
    fun closeStrings(word1: String, word2: String): Boolean {
        val word1CharacterAndAppearancePair = countCharacters(word1)
        val word2CharacterAndAppearancePair = countCharacters(word2)

        return checkCharacters(word1CharacterAndAppearancePair.keys, word2CharacterAndAppearancePair.keys)
                && checkCharactersAppearance(word1CharacterAndAppearancePair.values.toList().sorted(), word2CharacterAndAppearancePair.values.toList().sorted())
    }

    private fun checkCharactersAppearance(counts: List<Int>, otherCounts: List<Int>): Boolean {
        return counts == otherCounts
    }

    private fun checkCharacters(characters: Set<Char>, otherCharacters: Set<Char>): Boolean {
        return (characters - otherCharacters).isEmpty() && (otherCharacters - characters).isEmpty()
    }

    fun countCharacters(word: String): Map<Char, Int> {
        return buildMap {
            word.forEach {
                val count = this.getOrDefault(it, 0)
                this[it] = count + 1
            }
        }
    }
}
