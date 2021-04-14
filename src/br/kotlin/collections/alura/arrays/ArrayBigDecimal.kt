package br.kotlin.collections.alura.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main(){
    //Cria um array manualmente
    val salarios = Array<BigDecimal>(5) {BigDecimal.ZERO}//Valor de inicialização do Array
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2000.30".toBigDecimal()
    salarios[2] = "5000.30".toBigDecimal()
    salarios[3] = "4000.30".toBigDecimal()
    salarios[4] = "1000.30".toBigDecimal()
    println(salarios.contentToString())

    println()

    //Cria um aumento de 10% para cada valor do array
    val aumento = "1.1".toBigDecimal()
    val salarioComAumento = salarios
        .map { salario -> (salario * aumento).setScale(2,RoundingMode.UP) }
        .toTypedArray()

    println("Salários com aumento: ${salarioComAumento.contentToString()}")

    println()

    //Cria um array dinamicamente
    val salariosDinamicos = bigDecimalArrayOf("1500.55", "2000.00")
    println(salariosDinamicos.contentToString())


}



//Cria um array de BigDecimal de forma dinâmica
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size){ i ->
        valores[i].toBigDecimal()
    }
}
