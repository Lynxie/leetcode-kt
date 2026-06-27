package solutions

// https://leetcode.com/problems/container-with-most-water/

class ContainerWithMostWater {

    fun maxArea(height: IntArray): Int {
        var startIndex = 0
        var endIndex = height.size - 1
        var result = 0

        while (startIndex < endIndex) {
            val limitFromStart = height[startIndex] < height[endIndex]
            val area = (endIndex - startIndex) * minOf(height[startIndex], height[endIndex])

            if (result < area) result = area
            if (limitFromStart) startIndex++ else endIndex--
        }

        return result
    }

}