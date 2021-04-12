package br.com.alura.bytebank.modelo

abstract interface Autenticavel {

    open fun autentica(senha: Int): Boolean
}