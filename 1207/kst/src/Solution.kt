class Solution {
    //정수형 배열 numbers가 주어졌을 때 출현하는 정수의 횟수가 모두 다르다면 true 하나라도 동일한게 있다면 false를 반환해라
    //[1, 2, 2, 1, 1, 3] => true
    //1, 3
    //2, 2
    //3, 1

    fun uniqueOccurrences(numbers: IntArray): Boolean {
        val counts = count(numbers)
        val appearence = mutableSetOf<Int>()

        counts.forEach {
            if (!appearence.add(it)) {
                return false
            }
        }

        return true
    }

    fun count(numbers: IntArray): List<Int> {
        return buildMap {
            numbers.forEach {
                val count = this.getOrDefault(it, 0)
                this[it] = count + 1
            }
        }.values.toList()
    }
}
