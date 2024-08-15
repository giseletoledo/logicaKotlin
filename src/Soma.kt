//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma
//entre A e B e mostre se a soma é menor que C.
class Soma {
    var A: Int = 0
    var B: Int = 0
    var C: Int = 0

    private var _resultado: Int = 0 // resultado privado

    val resultado: Int
        get() = _resultado // Interface pública para leitura

    // Função que calcula a soma de A e B e armazena em _resultado
    fun calcularSoma() {
        _resultado = A + B
    }

    // Função que verifica se a soma é menor que C
    fun isSomaMenorQueC(): Boolean {
        return _resultado < C
    }

    override fun toString(): String {
        return "Soma(A=$A, B=$B, C=$C, _resultado=$_resultado)"
    }
}
