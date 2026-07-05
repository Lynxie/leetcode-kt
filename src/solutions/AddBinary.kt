package solutions

class AddBinary {

    fun addBinary(a: String, b: String): String {
        var result = ""

        var aIndex = a.lastIndex
        var bIndex = b.lastIndex

        var carry = 0
        while (aIndex >= 0 || bIndex >= 0 || carry > 0) {
            val aBit = (a.getOrNull(aIndex) ?: '0').digitToInt()
            val bBit = (b.getOrNull(bIndex) ?: '0').digitToInt()

            val sum = aBit + bBit + carry
            val resBit = sum % 2
            carry = sum / 2

            result += resBit.toString()
            aIndex--
            bIndex--
        }

        return result.reversed()
    }

}