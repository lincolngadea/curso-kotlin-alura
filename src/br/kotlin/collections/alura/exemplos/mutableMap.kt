package br.kotlin.collections.alura.exemplos


fun mutableMap(): MutableMap<Int, Double?> {
    val pedidos: MutableMap<Int, Double?> = mutableMapOf(
        1 to 50.0,
        2 to 30.0,
        3 to 20.00,
        4 to null
    )
    return pedidos
}