import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Day01Test : DayTest() {

    @Test
    internal fun `should return correct sum for part 1`() {
        assertEquals(142, Day01.part1(testInputPart1))
    }

    @Test
    internal fun `should return correct sum for part 2`() {
        assertEquals(281, Day01.part2(testInputPart2))
    }
}