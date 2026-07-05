package solutions

class IntegerToRoman {

    val map = arrayOf(
        1000 to "M",
        900 to "CM",
        500 to "D",
        400 to "CD",
        100 to "C",
        90 to "XC",
        50 to "L",
        40 to "XL",
        10 to "X",
        9 to "IX",
        5 to "V",
        4 to "IV",
        1 to "I"
    )

    fun intToRoman(num: Int): String {
        var result = ""
        var numCopy = num

        for ((int, romanChar) in map) {
            while (int <= numCopy) {
                numCopy -= int
                result += romanChar
            }
        }

        return result
    }

    fun intToRoman2(num: Int): String {
        var result = ""
        var numCopy = num

        while (numCopy > 0) {
            for ((romanInt, romanChar) in map) {
                if (romanInt <= numCopy) {
                    numCopy -= romanInt
                    result += romanChar
                    break
                }
            }
        }

        return result
    }

}