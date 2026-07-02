package solutions

// https://leetcode.com/problems/valid-parentheses/description/

class ValidParentheses {
    val map = mapOf(
        '(' to ')',
        '[' to ']',
        '{' to '}'
    )

    fun isValid(s: String): Boolean {
        var stack = mutableListOf<Char>()

        for (char in s) {
            if (map.containsKey(char)) {
                stack.add(map[char]!!)
            } else {
                 if (stack.removeLastOrNull() != char) {
                     return false
                 }
            }
        }

        return stack.isEmpty()
    }
}