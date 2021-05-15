import java.io.File
import java.lang.Integer.parseInt

fun day1(input_path: String): Int {
    return allPairs(readNumbers(input_path))
        .findLast { it.first + it.second == 2020 }
        .let {
            if (it != null) it.first * it.second else 0
        }
}

fun day1Part2(input_path: String): Int {
    return allTriples(readNumbers(input_path).asSequence())
        .findLast { it.first + it.second + it.third == 2020 }
        .let {
            if (it != null) it.first * it.second * it.third else 0
        }
}

private fun readNumbers(input_path: String) = File(input_path)
    .readLines()
    .map { parseInt(it) }

fun allTriples(numbers: Sequence<Int>): Sequence<Triple<Int, Int, Int>> {
    return numbers.flatMap { x -> numbers.flatMap { y -> numbers.map { z -> Triple(x, y, z) } }
        .filter { !(it.first == it.second || it.first == it.third || it.second == it.third)   }
    }
}

private fun allPairs(numbers: List<Int>) = numbers.flatMap { x -> numbers.map { y -> Pair(x, y) } }




