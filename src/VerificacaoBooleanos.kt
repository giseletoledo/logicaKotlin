class VerificacaoBooleanos(private val valor1: Boolean, private val valor2: Boolean) {

    // Função para verificar se ambos valores são VERDADEIRO ou FALSO
    fun verificarValores(): String {
        return when {
            valor1 && valor2 -> "Ambos são VERDADEIRO."
            !valor1 && !valor2 -> "Ambos são FALSO."
            else -> "Os valores são diferentes."
        }
    }

    // Função para exibir o resultado
    fun exibirResultado() {
        println(verificarValores())
    }
}
