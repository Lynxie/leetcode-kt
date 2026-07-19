package solutions

// https://leetcode.com/problems/4sum/

class FourSum {

    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        if (nums.size < 4) return emptyList()

        val sorted = nums.sortedArray()
        val answer = mutableListOf<List<Int>>()
        val targetSum = target.toLong()

        for (first in 0 until sorted.size - 3) {
            if (first > 0 && sorted[first] == sorted[first - 1]) continue

            for (second in first + 1 until sorted.size - 2) {
                if (second > first + 1 && sorted[second] == sorted[second - 1]) continue

                var left = second + 1
                var right = sorted.lastIndex

                while (left < right) {
                    val sum = sorted[first].toLong() +
                        sorted[second].toLong() +
                        sorted[left].toLong() +
                        sorted[right].toLong()

                    when {
                        sum < targetSum -> left++
                        sum > targetSum -> right--
                        else -> {
                            answer.add(
                                listOf(
                                    sorted[first],
                                    sorted[second],
                                    sorted[left],
                                    sorted[right]
                                )
                            )

                            val leftValue = sorted[left]
                            val rightValue = sorted[right]

                            while (left < right && sorted[left] == leftValue) left++
                            while (left < right && sorted[right] == rightValue) right--
                        }
                    }
                }
            }
        }

        return answer
    }
}
