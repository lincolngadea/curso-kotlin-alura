package br.kotlin.collections.alura.exemplos

fun testaSet() {
    val alunosDeAndroid: MutableSet<String> = mutableSetOf("Rafael", "Pedro", "Lincoln", "Romário", "Carol")
    val alunosDeKotlin: MutableSet<String> = mutableSetOf("Carol", "Lincolin", "Marílha", "Ricardo")
    val todosOsAlunos: MutableSet<String> = mutableSetOf<String>()
    todosOsAlunos.addAll(alunosDeAndroid)
    todosOsAlunos.addAll(alunosDeKotlin)
    println(todosOsAlunos)
}