package br.kotlin.collections.alura.list

//Cria uma função para imprimir uma lista de livro com marcadores
fun List<Livro?>.imprimeComMarcadores(){
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n"){
        " - ${it.titulo} de ${it.autor}"
    }
    println()
    println(" #### Lista de Livros #### \n$textoFormatado")
}