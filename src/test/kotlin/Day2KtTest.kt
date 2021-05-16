import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day2KtTest {
    @Test fun `test day2`() {
        val filePath = "./src/test/resources/day2-test.txt"

        assertEquals(2, day2(filePath))
    }

    @Test fun `day2 answer`() {
        val filePath = "./src/test/resources/day2.txt"

        val n = day2(filePath)
        println("Result day 2: $n")

        assertNotEquals(0, n)
    }

    @Test fun `day2 test cdefg`() {
        val password = Password(lower=1, upper=3, character='b', password="cdefg")

        assertFalse(validatePassword(password))
    }

    @Test fun `test day2 part2`() {
        val filePath = "./src/test/resources/day2-test.txt"

        assertEquals(1, day2Part2(filePath))
    }

    @Test fun `day2 part2 answer`() {
        val filePath = "./src/test/resources/day2.txt"

        val n = day2Part2(filePath)
        println("Result day 2: $n")

        assertNotEquals(0, n)
    }
}
