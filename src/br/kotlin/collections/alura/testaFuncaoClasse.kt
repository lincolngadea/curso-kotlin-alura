package br.kotlin.collections.alura


public fun testaFuncaoClasse() {
    testaFuncaoReferencia()

    val invoke = Soma().invoke(10, 10)
    println(invoke)

//    val result = Soma2().result(10, 10)
//    println(result)
}


class Soma: (Int, Int) -> Int{
    override fun invoke(p1: Int, p2: Int): Int {
        return p1+p2
    }
}

class Soma2{
    fun result(a: Int, b: Int): Int {
        return a + b
    }
}