import kotlin.math.absoluteValue

class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        return asteroids.fold(AsteroidStack()) { stack, asteroid ->
            stack.add(asteroid)
            stack
        }.state()
    }
}

class AsteroidStack(
    private val asteroids: MutableList<Int> = mutableListOf()
) {
    fun add(asteroid: Int) {
        while (calculate(asteroids.lastOrNull(), asteroid)) {
            val last = asteroids.last()

            if (last.absoluteValue == asteroid.absoluteValue) {
                asteroids.removeLast()
                return
            }

            if (last.absoluteValue > asteroid.absoluteValue) {
                return
            }

            asteroids.removeLast()
        }

        asteroids.add(asteroid)
    }

    fun calculate(last: Int?, asteroid: Int): Boolean {
        if (last == null) {
            return false
        }
        return last > 0 && asteroid < 0
    }

    fun state(): IntArray {
        return asteroids.toIntArray()
    }
}
