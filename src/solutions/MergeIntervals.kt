package solutions

class MergeIntervals {

    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        var mergedIntervals = mutableListOf<IntArray>()

        intervals.sortBy { it[0] }

        for ((from, to) in intervals) {
            var latestMergedInterval = mergedIntervals.lastOrNull()
            if (latestMergedInterval == null || latestMergedInterval[1] < from) {
                latestMergedInterval = intArrayOf(from, to)
                mergedIntervals.add(latestMergedInterval)
                continue
            }

            if (latestMergedInterval[1] < to) {
                latestMergedInterval[1] = to
            }
        }

        return mergedIntervals.toTypedArray()
    }

}