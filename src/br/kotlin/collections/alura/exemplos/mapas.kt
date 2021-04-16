package br.kotlin.collections.alura.exemplos


fun mapaDePedidos(): MutableMap<Int, Double?> {
    val pedidos: MutableMap<Int, Double?> = mutableMapOf(
        1 to 50.0,
        2 to 30.0,
        3 to 20.00,
        4 to null
    )
    return pedidos
}

fun mapaDeNovosPedidos(): MutableMap<Int,Double> {
    val pedidos: MutableMap<Int,Double> = mutableMapOf(
        4 to 20.0,
        5 to 30.0,
        6 to 40.00
    )
    return pedidos
}