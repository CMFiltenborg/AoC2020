import java.io.File
import java.lang.Integer.parseInt

data class Password(val lower: Int, val upper: Int, val character: Char, val password: String)

fun day2(input_path: String): Int = readLines(input_path)
    .map { it.split(' ') }
    .map { createPassword(it) }
    .filter { validatePassword(it) }
    .count()

fun day2Part2(input_path: String): Int = readLines(input_path)
    .map { it.split(' ') }
    .map { createPassword(it) }
    .filter { validatePasswordPart2(it) }
    .count()

fun validatePasswordPart2(password: Password): Boolean =
    (password.password[password.lower - 1] == password.character ||
            password.password[password.upper - 1] == password.character) &&
            !(password.password[password.lower - 1] == password.character &&
                    password.password[password.upper - 1] == password.character)

fun validatePassword(password: Password): Boolean =
    password.password.count { it == password.character }
        .let {
            it >= password.lower
                    && it <= password.upper
        }

fun createPassword(it: List<String>): Password {
    val bounds = it[0]
    val lower = bounds.split('-')[0]
    val upper = bounds.split('-')[1]
    val character: Char = it[1][0]

    return Password(parseInt(lower), parseInt(upper), character, it.last())
}


