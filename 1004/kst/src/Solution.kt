import kotlin.math.max

class Solution {
    //0과 1로 이루어진 정수형 배열 nums와 정수 k가 주어졌을 때
    //최대 k회 0을 1로 변환할 수 있을 때 가장 긴 1로 이루어진 부분수열의 길이를 구하라
    //[1,1,1,0,0,0,1,1,1,1,0], 2 -> 6

    //left right
    //while k > 0
    //if bits[right] == 1 {
    //right += 1
    //max = max(max, right - left)
    //continue
    // }
    //if (k > 0) {
    // k -= 1
    // right += 1
    //max = max(max, right - left)
    //continue
    //}
    //left += 1
    //right = left
    //
    fun longestOnes(bits: IntArray, k: Int): Int {
        var left = 0
        var right = 0
        var max = 0
        var zeros = 0

        while (right <= bits.lastIndex) {
            if (bits[right] == 0) {
                zeros += 1
            }

            while (zeros > k) {
                if (bits[left] == 0) {
                    zeros -= 1
                }

                left += 1
            }

            max = max(right - left + 1, max)
            right += 1
        }

        return max
    }
}
