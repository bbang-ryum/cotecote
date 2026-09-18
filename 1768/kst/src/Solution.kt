class Solution {
    //두 문자열이 주어지고 앞에서 부터 문자 하나씩 번갈아서 섞음
    //두 문자열 길이가 다르다면 섞은 결과 마지막에 붙인다.
    //a, b -> ab
    //b -> b
    //ab, c -> acb
    fun solve(word1: String, word2: String): String {
        val result = StringBuilder()
        val length = Math.max(word1.length, word2.length)

        for (i in 0 until length) {
            if (i < word1.length) {
                result.append(word1[i])
            }
            if (i < word2.length) {
                result.append(word2[i])
            }
        }

        return result.toString()
    }
}
