package br.kotlin.collections.alura.arrays

fun main(){
    val idades: IntArray = intArrayOf(25,30,55,44,22)

    var maiorIdade = 0

    //Iterando o array com for
    for(idade in idades){
        if (idade > maiorIdade){
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    //Iterando o array com foreach
    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if(idade < menorIdade){
            menorIdade = idade
        }
    }
    println(menorIdade)

    //Iterando o array utilizando os seus índices
    val salarios: DoubleArray = doubleArrayOf(1500.0, 2300.0, 3500.0, 5000.0, 5500.0, 7000.0)

    val aumento = 1.1
    for(indice in salarios.indices){
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    //Iterando o array utilizando o índice com forEachIndexed
    salarios.forEachIndexed{i,salario->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())


}
