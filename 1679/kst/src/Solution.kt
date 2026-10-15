class Solution {
    //정수형 배열 nums와 정수 k 를 주어졌을 때
    //nums에서 두 요소의 합이 k인 것을 제거할 수 있을 때 총 몇 번 제거할 수 있는지 구해라
    //[1, 2, 3, 4], 5 -> 2
    //모든 요소는 1과 같거나 크다
    fun maxOperations(nums: IntArray, k: Int): Int {
        val numberIndices = getIndices(nums)

        return nums.sumOf {  number ->
            val diff = k - number
            val indices = numberIndices.getValue(number)

            if (diff == number) {
                if (indices.size < 2) {
                    return@sumOf 0
                }
            }

            val diffIndices = numberIndices[diff] ?: return@sumOf 0

            if (indices.isNotEmpty() && diffIndices.isNotEmpty()) {
                indices.removeLast()
                diffIndices.removeLast()

                return@sumOf 1
            }

            0
        }
    }

    fun getIndices(nums: IntArray): Map<Int, MutableList<Int>> {
        return buildMap {
            nums.forEachIndexed { index, i ->
                val indices = this.getOrDefault(i, mutableListOf())
                indices.add(index)
                this[i] = indices
            }
        }
    }
}


