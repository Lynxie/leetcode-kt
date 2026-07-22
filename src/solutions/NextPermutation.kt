package solutions

// https://leetcode.com/problems/next-permutation/

class NextPermutation {

    fun nextPermutation(nums: IntArray): Unit {
        if (nums.size < 2) return

        var i = nums.lastIndex - 1
        while (i >= 0) {
            if (nums[i] < nums[i + 1]) {
                break
            }
            i--
        }

        // find next
        if (i >= 0) {
            var nextGreaterNumIndex = i + 1
            for (j in i + 1..nums.lastIndex) {
                if (nums[j] > nums[i] && nums[j] < nums[nextGreaterNumIndex]) {
                    nextGreaterNumIndex = j
                }
            }
            swap(nums, i, nextGreaterNumIndex)
        }

        // sort everything else ASC
        var left = i+1
        var right = nums.lastIndex
        while (left < right) {
            swap(nums, left++, right--)
        }
    }

    fun nextPermutation2(nums: IntArray): Unit {
        if (nums.size < 2) return

        var i = nums.lastIndex - 1
        while (i >= 0) {
            if (nums[i] < nums[i + 1]) {
                break
            }
            i--
        }

        // find next
        if (i >= 0) {
            var nextGreaterNumIndex = i + 1
            for (j in i + 1..nums.lastIndex) {
                if (nums[j] > nums[i] && nums[j] < nums[nextGreaterNumIndex]) {
                    nextGreaterNumIndex = j
                }
            }
            swap(nums, i, nextGreaterNumIndex)
        }

        // sort everything else ASC
        nums.sort(i+1)
    }

    fun swap(nums: IntArray, i1: Int, i2: Int) {
        val temp = nums[i1]
        nums[i1] = nums[i2]
        nums[i2] = temp
    }

}