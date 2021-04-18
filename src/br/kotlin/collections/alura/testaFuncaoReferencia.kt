package br.kotlin.collections.alura

fun testaFuncaoReferencia() {
    val somatorio: (Int, Int) -> Int = ::soma
    println(somatorio(10, 10))
//
//    val somatorio1 = somatorio(10, 10)
//    println(somatorio1)
}

fun soma(a: Int,b: Int): Int{
    return a + b
}