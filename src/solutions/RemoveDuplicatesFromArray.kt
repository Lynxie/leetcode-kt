package solutions

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class RemoveDuplicatesFromArray {

    fun removeDuplicates(nums: IntArray): Int {
        var uniqIndex = 0

        for (i in 1..<nums.size) {
            if (nums[i] != nums[uniqIndex]) {
                uniqIndex++
                nums[uniqIndex] = nums[i]
            }
        }

        return uniqIndex + 1
    }

}