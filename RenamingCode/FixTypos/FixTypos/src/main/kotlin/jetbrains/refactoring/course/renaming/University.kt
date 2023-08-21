package jetbrains.refactoring.course.renaming

class University {
    private val students = mutableListOf<Student>()

    fun admitStudent(name: String, age: Int, averageScore: Double) {
        val student = Student(name, age, averageScore)
        students.add(student)
    }

    fun updateStudentInfo(index: Int, newName: String, newAge: Int, newScore: Double) {
        if (index >= 0 && index < students.size) {
            val student = students[index]
            student.setName(newName)
            student.setAge(newAge)
            student.setAverageScore(newScore)
        }
    }

    fun getStudentGradeStatus(index: Int): String {
        if (index >= 0 && index < students.size) {
            return students[index].getGradeStatus()
        }
        return "Invalid index"
    }
}
