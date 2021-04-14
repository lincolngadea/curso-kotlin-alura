package br.kotlin.collections.alura.arrays

fun main(){
    val valores: IntArray = intArrayOf(100,255,363,456,7,4,-5,66,-1000)

    //Verifica o Valor máximo do array
    val max = valores.maxOrNull()
    println("Valor máximo: $max")

    //Verifica o Valor menor do array
    val min = valores.minOrNull()
    println("Valor menor: $min")

    //Verifica a média dos valores do array
    val average = valores.average()
    println("Média dos valores: $average")

    //Verifica se todos os valores são maiores que 100 e retorna um boolean
    val all = valores.all { it > 100 }
    println("Todos os valores são maiores que 100? $all")

    //Verifica se ao menos um valor é maior que 100 e retorna um boolean
    val any = valores.any { it > 100 }
    println("Temos valores maiores que 100? $any")

    //Verifica a instrução e retorna o valor filtrado em um array com o resultado
    val filter = valores.filter { it > 100 }
    println("Valores maiores que 100: $filter")

    //Busca um determinado valor no array e retorna null se não encontrar
    //Retornará o primeiro valor que satisfaça a instrução
    val find = valores.find { it == 101 }
    println("Valor da busca: $find")
}