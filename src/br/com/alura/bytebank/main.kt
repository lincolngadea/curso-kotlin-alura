package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaComportamentosConta
import java.lang.IllegalStateException

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Recife")
    val logradouro: String? = enderecoNulo?.logradouro
    enderecoNulo?.let{
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não deve ser vazio")
        println(tamanhoComplemento)
    }
}

