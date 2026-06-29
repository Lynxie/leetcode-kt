package solutions

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

class PhoneLetterCombinations {

    var map = mapOf<Char, List<Char>>(
        '2' to listOf('a', 'b', 'c'),
        '3' to listOf('d', 'e', 'f'),
        '4' to listOf('g', 'h', 'i'),
        '5' to listOf('j', 'k', 'l'),
        '6' to listOf('m', 'n', 'o'),
        '7' to listOf('p', 'q', 'r', 's'),
        '8' to listOf('t', 'u', 'v'),
        '9' to listOf('w', 'x', 'y', 'z')
    )

    fun letterCombinations1(digits: String): List<String> {
        var result = mutableListOf<String>()

        for (digit in digits) {
            val letters = map[digit]!!
            if (result.isEmpty()) {
                result.addAll(letters.toList().map { it.toString() })
            } else {
                val temp = result
                result = mutableListOf()
                letters.forEach { letter ->
                    temp.forEach { str ->
                        result.add(str + letter.toString())
                    }
                }
            }
        }

        return result.toList()
    }

    fun letterCombinations2(digits: String): List<String> {
        val result = mutableListOf<String>()
        val resultTemp = mutableListOf<List<Char>>()

        for (digit in digits) {
            val letters = map[digit]!!
            resultTemp.add(letters)
        }

        val c = resultTemp.fold(1) { acc, digits -> digits.count() * acc }

        for (resultItemNumber in 1..c) {
            var str = ""
            var optionCount = 1
            resultTemp.forEach { letters ->
                val letterCount = letters.count()
                val neededLetterIndex = (resultItemNumber / optionCount) % letterCount
                optionCount *= letterCount
                str += letters[neededLetterIndex]
            }
            result.add(str)
        }

        return result.toList()
    }

}