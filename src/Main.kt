import solutions.PhoneLetterCombinations
import kotlin.system.measureTimeMillis

fun main() {
    println(
        measureTimeMillis {
            PhoneLetterCombinations().letterCombinations1("23436456")
        }
    )

    println(
        measureTimeMillis {
            PhoneLetterCombinations().letterCombinations2("23436456")
        }
    )
}