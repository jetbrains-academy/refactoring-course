package jetbrains.refactoring.course.inlining

// DataProvider class
class DataProvider {
    fun fetchData(): String {
        // Some complex logic to fetch data from a remote server
        return "Data from the server"
    }
}

// Client class not using MiddleMan
class Client {
    fun processData(): String {
        val dataProvider = DataProvider()
        return dataProvider.fetchData()
    }
}

fun main() {
    val client = Client()
    println(client.processData()) // Output: Data from the server
}
