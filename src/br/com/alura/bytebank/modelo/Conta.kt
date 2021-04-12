package br.com.alura.bytebank.modelo

import totalContas

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set
    var total = 0

    fun deposita(valor: Double) {
        if(valor>0){
            saldo += valor
        }
    }

    init{
        println("Criando Conta")
        totalContas++
    }
    abstract fun saca(valor: Double)

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo < valor) {
            return false
        }
        saldo -= valor
        contaDestino.deposita(valor)
        return true
    }
}