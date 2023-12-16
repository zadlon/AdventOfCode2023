import common.FileInput

fun main(vararg args: String) {
    if (args.isEmpty()) throw IllegalArgumentException("Missing arguments")
    val day = args[0].toIntOrNull()
        ?.also { if (it !in 1..25) throw IllegalArgumentException("day [$it] must be between 1 and 25") }
        ?: throw IllegalArgumentException("day [${args[0]}] must be a number")
    val dayRunner: Day<*, *> = when (day) {
        else -> TODO("${day}th day has not been implemented yet")
    }
    args.getOrNull(1)
        ?.let { filename -> dayRunner.run(FileInput(filename)) }
        ?: run { dayRunner.run() }
}