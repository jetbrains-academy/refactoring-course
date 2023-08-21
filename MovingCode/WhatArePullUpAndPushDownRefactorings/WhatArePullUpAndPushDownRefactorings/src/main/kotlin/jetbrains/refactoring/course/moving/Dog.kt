package jetbrains.refactoring.course.moving

class Dog(val name: String, val age: Int) : Animal {

    override fun eat() {
        println("$name the dog is eating.")
    }

    override fun sleep() {
        println("$name the dog is sleeping.")
    }

    override fun bark() {
        println("$name the dog is barking.")
    }

    override fun meow() {
        println("$name the animal is meowing.")
    }

    fun play() {
        println("$name the dog is playing.")
    }
}
