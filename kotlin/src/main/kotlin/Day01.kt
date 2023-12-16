import common.Input

object Day01 : Day<Long, Long>() {

    override fun part1(input: Input): Long =
        input.sumLines { line ->
            val first = line.first { it.isDigit() }
            val last = line.last { it.isDigit() }
            "$first$last".toLong()
        }

    private val digits = mapOf(
        "zero" to '0',
        "one" to '1',
        "two" to '2',
        "three" to '3',
        "four" to '4',
        "five" to '5',
        "six" to '6',
        "seven" to '7',
        "eight" to '8',
        "nine" to '9',
        "0" to '0',
        "1" to '1',
        "2" to '2',
        "3" to '3',
        "4" to '4',
        "5" to '5',
        "6" to '6',
        "7" to '7',
        "8" to '8',
        "9" to '9')

    private val keys = digits.keys

    override fun part2(input: Input): Long =
        input.sumLines { line ->
            val first = line.findAnyOf(keys)!!.let { digits[it.second] }
            val last = line.findLastAnyOf(keys)!!.let { digits[it.second] }
            "$first$last".toLong()
        }

    internal inline fun Input.sumLines(crossinline digitsReader: (String) -> Long) =
        useContentLines { lines ->
            lines.map { digitsReader(it) }
                .sum()
        }

}