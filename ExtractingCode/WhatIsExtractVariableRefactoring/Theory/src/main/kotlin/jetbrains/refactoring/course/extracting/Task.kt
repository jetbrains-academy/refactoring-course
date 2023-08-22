package jetbrains.refactoring.course.extracting

fun calculatePhotonEnergy(waveLength: Double): Double {
    val frequency = 299792458.0 / waveLength
    return 6.62607015e-34 * frequency
}

fun calculatePhotonMass(energy: Double): Double {
    return energy / (299792458.0 * 299792458.0)
}

fun main() {
    val photonEnergy = calculatePhotonEnergy(0.5e-6)
    val photonMass = calculatePhotonMass(photonEnergy)

    println("Photon energy: $photonEnergy Joules")
    println("Photon mass: $photonMass kg")
}
