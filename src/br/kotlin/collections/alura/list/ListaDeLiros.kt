package br.kotlin.collections.alura.list

import kotlin.collections.sortBy as sortBy

fun main(){
    val livro1 = Livro(
        "Título 01",
        "Autor 01",
        1900,
        "Editora 01"
    )

    val livro2 = Livro(
        "Título 02",
        "Autor 02",
        1900,
        "Editora 02"
    )

    val livro3 = Livro(
        "Título 03",
        "Autor 03",
        1900,
        "Editora 03"
    )

    val livro4 = Livro(
        "Título 04",
        "Autor 04",
        1800,
        "Editora 04"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.imprimeComMarcadores()

    livros.add(
        Livro(
        "Novo Título",
        "Novo Autor",
        2000,
        "Nova editora"
    )
    )

    println()
    livros.imprimeComMarcadores()
    println()

    livros.remove(livro1)
    livros.imprimeComMarcadores()
    println()

    //Ordena os Livros por título
    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()
}

//Cria uma função para imprimir uma lista de livro com marcadores
fun List<Livro>.imprimeComMarcadores(){
    val textoFormatado = this.joinToString(separator = "\n"){
        " - ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de Livros #### \n$textoFormatado")
}


