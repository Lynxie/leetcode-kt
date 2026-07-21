package solutions

// https://leetcode.com/problems/generate-parentheses/

class GenerateParentheses {

    fun generateParenthesis(n: Int): List<String> {
        val r = mutableListOf<String>()
        generateOptions(r, "", n, 0, 0)

        return r
    }

    fun generateOptions(carry: MutableList<String>, currentString: String, total: Int, opened: Int, closed: Int) {
        if (total == opened && total == closed) {
            carry.add(currentString)
            return
        }

        if (opened < total) {
            generateOptions(carry,"$currentString(", total, opened + 1, closed)
        }

        if (closed < opened) {
            generateOptions(carry,"$currentString)", total, opened, closed + 1)
        }
    }

    fun generateParenthesis2(n: Int): List<String> {
        var result = mutableListOf<String>("(")
        var step = 2
        val iterations = n * 2

        while (step <= iterations) {
            val nextResult = mutableListOf<String>()
            for (r in result) {
                val opened = r.count { c -> c == '(' }
                val closed = step - opened - 1
                if (opened < n) {
                    nextResult.add("$r(")
                }
                if (closed < opened) {
                    nextResult.add("$r)")
                }
            }
            result = nextResult
            step++
        }

        return result
    }

}