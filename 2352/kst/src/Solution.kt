class Solution {
    //nxn 2차원 배열이 주어졌을 때, 행 데이터와 열 데이터가 일치하는 수를 구하라
    //요소의 순서까지 동일해야 한다
    //[
    // [3, 2, 1],
    // [1, 7, 6],
    // [2, 7, 7]
    // ]
    //
    //1, [2, 7, 7]

    //grid.forEach addTo
    fun equalPairs(grid: Array<IntArray>): Int {
        val rowMatrix = grid.map { it.toList() }
        val columnMatrix = columnMatrix(grid)

        return rowMatrix.sumOf { numbers ->
            columnMatrix.values.count { it == numbers }
        }
    }

    fun columnMatrix(grid: Array<IntArray>): Map<Int, MutableList<Int>> {
        return buildMap {
            grid.forEachIndexed { _, numbers ->
                numbers.forEachIndexed { index, number ->
                    val columnIndex = index % numbers.size
                    val numbers = this.getOrDefault(columnIndex, mutableListOf<Int>())

                    numbers.add(number)

                    this[columnIndex] = numbers
                }
            }
        }
    }
}
