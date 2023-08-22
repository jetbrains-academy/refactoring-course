package jetbrains.refactoring.course.renaming

class Student(private var name: String, private var age: Int, private var averageScore: Double) {

    fun getgradestatus(): String {
        return when (averageScore) {
            in 90.0..100.0 -> "Excellent"
            in 80.0..89.99 -> "Good"
            in 70.0..79.99 -> "Average"
            else -> "Fail"
        }
    }

    fun SetName(newName: String) {
        name = newName
    }

    fun setaGe(newAge: Int) {
        age = newAge
    }

    fun setAvergeScore(newScore: Double) {
        averageScore = newScore
    }
}
