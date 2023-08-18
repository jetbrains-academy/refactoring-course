package jetbrains.refactoring.course.moving.animal

class Cat(val name: String, val age: Int) : Animal {

    override fun eat() {
        println("$name the cat is eating.")
    }

    override fun sleep() {
        println("$name the cat is sleeping.")
    }

    override fun bark() {
        println("$name the animal is barking.")
    }

    override fun meow() {
        println("$name the animal is meowing.")
    }

    fun play() {
        println("$name the cat is playing.")
    }
}
