class Solution {
    //정수형배열 nums1과 nums2가 주어졌을 때
    // nums1에 있는데 nums2에는 없는 정수 배열을 담은 요소를 중첩배열 첫 번째 요소로
    // nums2에 있는데 nums1에는 없는 정수 배열을 담은 요소를 중첩배열 두 번째 요소로

    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val nums1Set =  nums1.toSet()
        val nums2Set =  nums2.toSet()

        return listOf(
            (nums1Set - nums2Set).toList(),
            (nums2Set - nums1Set).toList()
        )
    }
}
