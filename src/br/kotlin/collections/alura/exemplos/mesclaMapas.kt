package br.kotlin.collections.alura.exemplos

fun main(){
    val mapaDePedidos: MutableMap<Int, Double?> = mapaDePedidos()
    val mapaDeNovosPedidos: MutableMap<Int, Double> = mapaDeNovosPedidos()

    val novoMapa = mapaDePedidos + mapaDeNovosPedidos

    println("Mapa antigo: $mapaDePedidos")
    println("Mapa novo: $mapaDeNovosPedidos")
    println("Mapa Gerado: $novoMapa")
}

