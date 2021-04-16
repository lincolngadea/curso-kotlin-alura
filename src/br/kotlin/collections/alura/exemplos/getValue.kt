package br.kotlin.collections.alura.exemplos

fun main() {

    val pedidos: MutableMap<Int, Double?> = mapaDePedidos()

    val valorExistente: Double? = pedidos.getValue(1)
    val valorNulo: Double? = pedidos.getValue(4)
//    val valorInexistente: Double? = pedidos.getValue(5)

    println("Valor 1: ${valorExistente}")
    println("Valor nulo: ${valorNulo}")
//    println("Valor 1: ${valorInexistente}")

    /**
     * Se testar o valorInexistente vai perceber um exception no resultado
     * isso ocorre pq o getValue trata essa informação diferente do Get.
     *
     */
}
