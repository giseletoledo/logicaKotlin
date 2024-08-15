// Constante do salário mínimo
private const val SALARIO_MINIMO = 1293.20

class Salario(private val salarioUsuario: Double) {
    // Função para calcular quantos salários mínimos o usuário ganha
    fun calcularSalariosMinimos(): Double {
        return salarioUsuario / SALARIO_MINIMO
    }

    // Função para exibir o resultado
    fun exibirResultado() {
        val salariosMinimos = calcularSalariosMinimos()
        println("O salário do usuário é equivalente a ${"%.2f".format(salariosMinimos)} salários mínimos.")
    }
}