package br.kotlin.collections.alura.exemplos

fun testaComportamentos() {
    val pedidos: MutableMap<Int, Double?> = mapaDePedidos()

    println(pedidos)

    val pedido: Double? = pedidos[1]
    pedido?.let { println("Pedido $it") }

    for (p: Map.Entry<Int, Double?> in pedidos) {
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
        println()
    }

    //retorna um array com as chaves do mapa
    println(pedidos.keys)

    //retorna um array com os valores do mapa
    println(pedidos.values)

    //Cria uma iteração dentro do mapa e retorna a chave
    for (valor: Int in pedidos.keys) {
        println("Pedido $valor")
    }

    //Cria uma iteração dentro do mapa e retorna os valores
    for (valor: Double? in pedidos.values) {
        if (valor != null) {
            println("Valor $valor")
        }
    }
}
