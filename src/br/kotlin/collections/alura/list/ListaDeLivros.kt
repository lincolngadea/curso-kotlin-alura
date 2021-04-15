package br.kotlin.collections.alura.list

import Livro


fun main(){

    val livros: MutableList<Livro> = listaDeLivros

    livros.imprimeComMarcadores()

    livros.add(
        Livro(
            "Novo Título",
            "Novo Autor",
            2000,
            "Nova editora"
        )
    )

    livros.imprimeComMarcadores()
    println()

    //Ordena os Livros por título
    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    //Filtra livro por nome do autor e ordena por ano de publicacao
    listaDeLivros
        .filter { it.autor == "David Allen" }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    //Filtra livrso cujo o nome do autor começa com uma Letra específica
    listaDeLivros
        .filter { it.autor.startsWith("T") }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()


}



