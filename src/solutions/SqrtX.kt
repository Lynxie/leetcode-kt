package solutions

class SqrtX {

    fun mySqrt(x: Int): Int {
        var guess = x.toLong()
        while (guess * guess > x) {
            guess = (guess + x / guess) / 2
        }

        return guess.toInt()
    }

}