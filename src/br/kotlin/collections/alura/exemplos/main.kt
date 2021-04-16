package br.kotlin.collections.alura.exemplos

fun main(){
    val pedidos: Map<Int, Double> = mapOf(Pair(1,30.0), Pair(2,20.0), 3 to 50.0)
    println(pedidos)

//    val pedido:Double? = pedidos[1]
//    pedido?.let { println("Pedido $it") }

    for(pedido: Map.Entry<Int,Double> in pedidos){
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
        println()
    }
}

