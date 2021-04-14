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
    val arrayDinamico = bigDecimalArrayOf("1500.55", "2000.00")
    println(arrayDinamico.contentToString())

    //Somatória de arrays com reduce
    val gastoInicial = salarioComAumento.somatoria()
    println("Gasto inicial: $gastoInicial")
    println()

    //Verica gastos totais durante 6 meses
    val meses = 6.toBigDecimal()
    val gastoTotal = salarioComAumento.fold(gastoInicial) { acc, salario ->
        acc + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gastos totais: $gastoTotal")


}

//Função para somar arrays
fun Array<BigDecimal>.somatoria(): BigDecimal{
    return this.reduce{acc, valor->
        acc + valor
    }
}

//Cria um array de BigDecimal de forma dinâmica
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size){ i ->
        valores[i].toBigDecimal()
    }
}
