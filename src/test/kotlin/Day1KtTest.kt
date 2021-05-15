import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day1KtTest {
    @Test
    fun test_day1() {
        val filePath = "./src/test/resources/day1_test.txt"

        assertEquals(514579, day1(filePath))
    }

    @Test fun day1() {
        val filePath = "./src/test/resources/day1.txt"

        val n = day1(filePath)
        println("Result day 1: $n")

        assertNotEquals(0, n)
    }

    @Test fun `test day1 p2`() {
        val filePath = "./src/test/resources/day1_test.txt"

        assertEquals(241861950, day1Part2(filePath))
    }

    @Test fun day1PartTwoOutput() {
        val filePath = "./src/test/resources/day1.txt"

        val n = day1Part2(filePath)
        println("Result day 1 p2: $n")

        assertNotEquals(0, day1Part2(filePath))
    }
}



