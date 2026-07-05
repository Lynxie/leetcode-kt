package solutions

// https://leetcode.com/problems/climbing-stairs/description/

class ClimbingStairs {

    var cache = mutableMapOf<Int, Int>()

    fun climbStairs(n: Int): Int {
        var options = 0

        if (cache.containsKey(n)) {
            return cache[n]!!
        } else if (n in 0..2) {
            return n
        } else {
            options = climbStairs(n - 1) + climbStairs(n - 2)
        }

        if (!cache.containsKey(n)) {
            cache[n] = options
        }

        return options
    }


    fun climbStairs2(n: Int): Int {
        if (n in 0..2) {
            return n
        }

        var oneBack = 2
        var twoBack = 1
        for (i in 3..n) {
            val current =  oneBack + twoBack
            twoBack = oneBack
            oneBack = current
        }

        return oneBack
    }

}