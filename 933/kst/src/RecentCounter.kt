class RecentCounter {
    //항상 전 값보다 큰 time을 받는다고 가정했을 때
    //[t - 3000, t] 안에 있는 값을 반환하는 함수 ping을 구현
    //1 -> [-2999, 1] -> 1
    //queue.add(1)
    //100 -> [-2900, 100] -> 2
    //queue.add(100)
    //3001 -> [1, 3001] -> 3
    //queue.add(3001)
    //3002 -> [2, 3002] -> 3

    private val records = ArrayDeque<Int>()
    private val limit = 3000

    fun ping(time: Int): Int {
        while (records.isNotEmpty() && records.first() < time - limit) {
            records.removeFirst()
        }

        records.addLast(time)

        return records.size
    }
}
