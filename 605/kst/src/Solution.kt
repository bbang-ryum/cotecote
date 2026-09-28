class Solution {
    //0과 1이 들어있는 정수형 배열이 주어졌을 때 n만큼 1을 해당 배열에 추가할 수 있는지 확인한다.
    //1은 오로지 양옆이 0이거나 범위를 벗어났을 경우 심을 수 있다
    //[1, 0, 0, 0, 1], 1 -> true
    //해당 요소가 0이거나, 좌가 0이거나 배열 0보다 작던가 우가 배열 index 크기보다 크거나 0이라면 심을 수 있다
    //그럴 때 마다 n -=1.
    //배열을 순회했을 때 n이 0이라면 true 아니라면 false
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var currentIndex = 0
        var currentFlower = n

        while (currentIndex <= flowerbed.lastIndex) {
            if (flowerbed[currentIndex] != 0) {
                currentIndex += 1

                continue
            }

            if (checkLeft(currentIndex, flowerbed) && checkRight(currentIndex, flowerbed)) {
                if (currentFlower > 0) {
                    flowerbed[currentIndex] = 1
                    currentFlower -= 1
                }
            }

            currentIndex += 1
        }

        return currentFlower <= 0
    }

    fun checkLeft(currentIndex: Int, flowerbed: IntArray): Boolean {
        if (currentIndex - 1 < 0) {
            return true
        }

        return flowerbed[currentIndex - 1] == 0
    }

    fun checkRight(currentIndex: Int, flowerbed: IntArray): Boolean {
        if (currentIndex + 1 > flowerbed.lastIndex) {
            return true
        }

        return flowerbed[currentIndex + 1] == 0
    }
}
