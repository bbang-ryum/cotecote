class Solution {
    fun largestAltitude(gains: IntArray): Int {
        return gains.runningFold(0) { acc, i ->
            acc + i
        }.maxBy { it }
    }
}
