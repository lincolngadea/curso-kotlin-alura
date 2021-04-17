package br.kotlin.collections.alura.exemplos

fun main(){

    val parentesEFamiliares: List<String> = listOf(
        "Rafael",
        "Pedro",
        "Lincoln",
        "Jackson",
        "Christiny",
        "Jackeline",
        "Eugrácia",
        "Ananias",
        "Sara",
        "Rodrigo"
    )

    val agenda: Map<Char, List<String>> = parentesEFamiliares.groupBy { familia ->
        familia.first()
    }

    println(agenda)

}

