package br.kotlin.collections.alura.arrays

import java.math.BigDecimal

//Função para somar arrays
fun Array<BigDecimal>.somatoria(): BigDecimal {
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

//Cria uma média de Arrays
fun Array<BigDecimal>.media(): BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatoria()/ this.size.toBigDecimal()
    }
}