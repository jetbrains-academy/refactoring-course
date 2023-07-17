package jetbrains.refactoring.course.renaming

class Student(private var name: String, private var age: Int, private var averageScore: Double) {

    fun getGradeStatus(): String {
        return when (averageScore) {
            in 90.0..100.0 -> "Excellent"
            in 80.0..89.99 -> "Good"
            in 70.0..79.99 -> "Average"
            else -> "Fail"
        }
    }

    fun setName(newName: String) {
        name = newName
    }

    fun setAge(newAge: Int) {
        age = newAge
    }

    fun setAverageScore(newScore: Double) {
        averageScore = newScore
    }
}
