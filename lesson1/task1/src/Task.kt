private const val STRING = "string"

fun main() {
    val list = ArrayList<String>()
    list.add(STRING)
    method(STRING)
    val a = 0
}

private fun method(string: String) {
    println(string)
}
