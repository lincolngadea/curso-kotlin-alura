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


}
