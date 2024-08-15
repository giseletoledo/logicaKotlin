class Notas(private val nota1: Double, private val nota2: Double, private val nota3: Double) {

    // Calcula a média das notas
    fun calcularMedia(): Double {
        return (nota1 + nota2 + nota3) / 3
    }

    // Imprime a média na tela
    fun imprimirMedia() {
        val media = calcularMedia()
        println("A média das notas é: $media")
    }
}
