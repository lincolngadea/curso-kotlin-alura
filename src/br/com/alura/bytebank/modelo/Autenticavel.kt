package modelo

abstract interface Autenticavel {

    open fun autentica(senha: Int): Boolean
}