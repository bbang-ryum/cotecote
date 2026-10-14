import kotlin.math.max
import kotlin.math.min

class Solution {
    //height에서 두 점을 찾아 두 점 중 작은 것 * 두 점 사이의 거리의 값이 가장 큰 값을 구하라
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var maxArea = 0

        while (left <= right) {
            val distance = right - left
            val leftHeight = height[left]
            val rightHeight = height[right]
            val currentArea = min(leftHeight, rightHeight) * distance

            maxArea = max(maxArea, currentArea)

            if (leftHeight <= rightHeight) {
                left += 1
                continue
            }

            right -= 1
        }

        return maxArea
    }
}
