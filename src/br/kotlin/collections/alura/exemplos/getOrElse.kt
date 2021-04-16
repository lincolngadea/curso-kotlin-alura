package br.kotlin.collections.alura.exemplos

fun main(){

    val pedidos: MutableMap<Int, Double?> = mapaDePedidos()

    val valorInformado = pedidos.getOrElse(5) { "Valor nulo" }

    println(valorInformado)

    /**
     * Utilizando o getOrElse eu posso definir um valor para chaves inexistente ou nula
     */

}