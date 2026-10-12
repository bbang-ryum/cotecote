class Solution {
    //문자열 s와 t가 주어졌을 때 s가 t의 부분문자열일 경우 true를 반환하고 아니라면 false를 반환해라
    //ace, abcde -> true
    //aec, abcde -> false
    fun isSubsequence(s: String, t: String, sIndex: Int = 0, tIndex: Int = 0): Boolean {
        if (sIndex > s.lastIndex) {
            return true
        }

        if (sIndex > t.lastIndex || tIndex > t.lastIndex) {
            return false
        }

        if (s[sIndex] == t[tIndex]) {
            return isSubsequence(s, t, sIndex + 1, tIndex + 1)
        }

        return isSubsequence(s, t, sIndex, tIndex + 1)
    }
}
