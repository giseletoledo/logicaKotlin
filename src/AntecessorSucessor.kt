class AntecessorSucessor(private val numero: Int) {
    // Função para calcular e exibir o antecessor e sucessor
    fun exibirAntecessorESucessor() {
        val antecessor = numero - 1
        val sucessor = numero + 1
        println("O número digitado é: $numero")
        println("Seu antecessor é: $antecessor")
        println("Seu sucessor é: $sucessor")
    }
}
