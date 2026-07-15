package solutions

import kotlin.comparisons.compareBy

// https://leetcode.com/problems/3sum/description/

class ThreeSum {

    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (nums.size < 3) return result
        val s = nums.sorted()

        var lastUsedI: Int? = null;
        for (i in 0..s.lastIndex-2) {
            if (lastUsedI != null && s[lastUsedI] == s[i]) continue;
            lastUsedI = i;
            var left = i+1
            var right = s.lastIndex

            while (left < right) {
                val sum = s[i] + s[left] + s[right]
                if (sum == 0) {
                    result.add(listOf(s[i], s[left], s[right]))
                    left++
                    right--
                } else if (sum < 0) {
                    left++
                } else {
                    right--
                }
            }
        }

        return result.distinct()
    }

    fun threeSum4(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (nums.size < 3) return result
        val s = nums.sorted()

        for (i in 0..s.lastIndex-2) {
            var left = i+1
            var right = s.lastIndex

            while (left < right) {
                val sum = s[i] + s[left] + s[right]
                if (sum == 0) {
                    result.add(listOf(s[i], s[left], s[right]))
                    left++
                    right--
                } else if (sum < 0) {
                    left++
                } else {
                    right--
                }
            }
        }

        return result.distinct()
    }

    fun threeSum3(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        if (nums.size < 3) return result

        val s = nums.sorted()

        for (i in 0..s.lastIndex-2) {
            for (j in i+1..s.lastIndex-1) {
                if (result.find { it.indexOf(s[i]) == 0 && it.indexOf(s[j]) == 1 } != null) {
                    continue
                }

                val partialSum = s[i] + s[j]
                var k = s.lastIndex
                while (k > j) {
                    val sum = partialSum + s[k]
                    if (sum == 0) {
                        result.add(listOf(s[i], s[j], s[k]))
                        break
                    } else if (sum < 0) {
                        break
                    }
                    k--
                }
            }
        }

        return result.distinct()
    }

    fun threeSum2(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        if (nums.size < 3) return result

        val s = nums.sorted()
        var start = 0
        var end = s.size - 1

        while (start + 1 < end) {
            val num1 = s[start]
            val num3 = s[end]
            val partialSum = s[start] + s[end]
            for (middle in start + 1..<end) {
                val num2 = s[middle]
                val sum = partialSum + s[middle]
                if (sum == 0) {
                    result.add(listOf(s[start], s[middle], s[end]))
                    break
                } else if (sum > 0) {
                    break
                }
            }

            if (partialSum > 0) {
                end--
            } else {
                start++
            }
        }

        return result.distinct()
    }

}