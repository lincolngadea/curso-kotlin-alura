package br.kotlin.collections.alura.list

fun main(){
    val prateleira = Prateleira(genero = "Literatura",livros = listaDeLivros)

    val organizarPorAutor = prateleira.organizarPorAutor()
    val organizarPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    organizarPorAnoPublicacao.imprimeComMarcadores()
    organizarPorAutor.imprimeComMarcadores()
}