package br.kotlin.collections.alura.exemplos

fun main(){
    val pedidos: MutableMap<Int, Double?> = mutableMap()

    println(pedidos)

    val pedido:Double? = pedidos[1]
    pedido?.let { println("Pedido $it") }

    for(p: Map.Entry<Int,Double?> in pedidos){
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
        println()
    }
}

