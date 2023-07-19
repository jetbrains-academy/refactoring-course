package jetbrains.refactoring.course.extracting

class Student(private val name: String, private val grades: List<Double>) {
    companion object {
        const val PASSING_GRADE = 60.0
        const val DEFAULT_AVERAGE = 0.0
    }

    fun calculateOverallAverage(): Double {
        val sum = grades.sum()
        val count = grades.size

        return if (count > 0) {
            sum / count
        } else {
            DEFAULT_AVERAGE
        }
    }

    private fun calculateTotalGrades(): Double {
        return grades.sum()
    }

    fun hasPassed(): Boolean {
        val average = calculateOverallAverage()
        return average >= PASSING_GRADE
    }
}
