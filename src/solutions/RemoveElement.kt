package solutions

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var end = nums.lastIndex

        var i = 0
        while (i <= end) {
            if (nums[i] == `val`) {
                val temp = nums[end]
                nums[end] = nums[i]
                nums[i] = temp
                end--
            } else {
                i++
            }
        }

        return i
    }

    fun removeElement2(nums: IntArray, `val`: Int): Int {
        var pointer = 0

        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[pointer] = nums[i]
                pointer++
            }
        }

        return pointer
    }
}