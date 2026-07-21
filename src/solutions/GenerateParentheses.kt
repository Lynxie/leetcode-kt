package solutions

// https://leetcode.com/problems/generate-parentheses/

class GenerateParentheses {

    fun generateParenthesis(n: Int): List<String> {
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