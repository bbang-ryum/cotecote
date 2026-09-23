class Solution {
    //정수형 배열 candies가 주어지고 정수 extracandies가 주어졌을 때 canides 각 요소에 extracandies을 추가했을 때
    //해당 배열에서 가장 큰 정수가 된다면 동일 index에 true를 아니면 false를 기입한 boolean 배열을 반환
    //가장 큰 정수는 복수가 존재할 수 있다
    //[1, 2, 3], 1 -> [false, true, true]
    //candies 돌면서 가장 큰 숫자 확인
    //candies 다시 돌면서 가장 숫자와 동일하다면 true 아니면 false
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = getMax(candies)

        return candies.fold(mutableListOf()) { acc, number ->
            if (number + extraCandies >= max) {
                acc.add(true)
            } else {
                acc.add(false)
            }

            acc
        }
    }

    fun getMax(numbers: IntArray): Int {
        return numbers.fold(Int.MIN_VALUE) { acc, number ->
            if (number > acc) number else acc
        }
    }
}
