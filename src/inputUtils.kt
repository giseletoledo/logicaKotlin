object InputUtils {
    // Função para ler um número inteiro do usuário
    fun lerNumero(mensagem: String = "Digite um número:"): Int {
        println(mensagem)
        return readLine()?.toIntOrNull() ?: 0 // Retorna 0 se a entrada não for um número válido
    }

    fun lerDecimal(mensagem: String = "Digite um valor decimal:"): Double {
        println(mensagem)
        return readLine()?.toDoubleOrNull() ?: 0.0
    }

    fun lerBooleano(mensagem: String = "Digite um valor booleano (true/false):"): Boolean {
        println(mensagem)
        return readLine()?.toBooleanStrictOrNull() ?: false
    }
}
