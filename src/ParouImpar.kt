object NumeroUtils {
    // Função para verificar se um número é par ou ímpar
    fun verificarParOuImpar(numero: Int): String {
        return if (numero % 2 == 0) "par" else "ímpar"
    }

    // Função para verificar se um número é positivo ou negativo
    fun verificarPositivoOuNegativo(numero: Int): String {
        return if (numero >= 0) "positivo" else "negativo"
    }
}
