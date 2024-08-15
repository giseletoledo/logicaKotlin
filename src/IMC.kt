class IMC(private val peso: Double, private val altura: Double) {

    // Calcula o IMC
    private fun calcularIMC(): Double {
        return peso / (altura * altura)
    }

    // Determina a condição de acordo com o IMC
    fun condicaoIMC(): String {
        val imc = calcularIMC()
        return when {
            imc < 18.5 -> "Abaixo do peso"
            imc in 18.5..24.9 -> "Peso ideal (parabéns)"
            imc in 25.0..29.9 -> "Levemente acima do peso"
            imc in 30.0..34.9 -> "Obesidade grau I"
            imc in 35.0..39.9 -> "Obesidade grau II (severa)"
            else -> "Obesidade grau III (mórbida)"
        }
    }

    override fun toString(): String {
        return "Peso: $peso, Altura: $altura, IMC: ${calcularIMC()}, Condição: ${condicaoIMC()}"
    }
}
