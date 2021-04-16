package br.kotlin.collections.alura.exemplos

fun main(){
    val pedidos: MutableMap<Int, Double?> = mapaDePedidos()
    println(pedidos.getOrDefault(0,-1.0))

    /**
     * Basicamente o getOrDefault vai retornar um valor padrão se não encontrar
     * o valor da chave informada, nesse exemplo ele retornará o valor -1.0
     */
}