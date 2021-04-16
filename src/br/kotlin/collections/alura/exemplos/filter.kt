package br.kotlin.collections.alura.exemplos

fun main(){
    val pedidos: MutableMap<Int, Double?> = mapaDePedidos()

    val filtro = pedidos.filter { (chave, valor) -> valor != null && chave % 2 ==0 && valor > 10.0}
    println(filtro)

    val filterKeys = pedidos.filterKeys { chave -> chave == 3 }
    println(filterKeys)

    val filterValues = pedidos.filterValues { valor -> valor == null }
    println(filterValues)
}