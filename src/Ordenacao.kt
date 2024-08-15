class Ordenacao {
    private val numeros = mutableListOf<Int>()

    // Adiciona um número à lista
    fun adicionarNumero(numero: Int) {
        numeros.add(numero)
    }

    // Ordena a lista em ordem decrescente e imprime o resultado
    fun imprimirOrdenadoDecrescente() {
        val listaOrdenada = numeros.sortedDescending()
        println("Lista ordenada em ordem decrescente:")
        listaOrdenada.forEach { println(it) }
    }

    override fun toString(): String {
        return "Numeros: $numeros"
    }
}
