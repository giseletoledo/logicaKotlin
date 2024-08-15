class Reajuste(private val valor: Double) {
    private val PERCENTUAL_REAJUSTE = 0.05

    // Função para calcular o valor com o reajuste
    fun calcularReajuste(): Double {
        return valor * (1 + PERCENTUAL_REAJUSTE)
    }

    // Função para exibir o resultado
    fun exibirResultado() {
        val valorReajustado = calcularReajuste()
        println("O valor com reajuste de 5% é: ${"%.2f".format(valorReajustado)}")
    }
}
