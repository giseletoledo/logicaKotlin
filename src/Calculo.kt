class Calculo {
    private var A: Int = 0
    private var B: Int = 0
    var C: Int = 0
        private set

    // Função para ler os valores e realizar o cálculo
    fun realizarCalculo() {
        A = InputUtils.lerNumero("Digite o valor de A:")
        B = InputUtils.lerNumero("Digite o valor de B:")

        // Verifica se A e B são iguais e realiza o cálculo apropriado
        C = if (A == B) {
            A + B
        } else {
            A * B
        }
    }

    // Função para exibir o resultado
    fun exibirResultado() {
        println("O resultado do cálculo é: $C")
    }
}
