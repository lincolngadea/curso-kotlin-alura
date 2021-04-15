package br.kotlin.collections.alura.exemplos

fun main(){

    val bancoDeNomes = BancoDeNomes()
    bancoDeNomes.salva("Camila")

    println(bancoDeNomes.nomes)

}

class BancoDeNomes{
    val nomes: Collection<String> get() = dados

    fun salva(nome: String){
       dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }

}

fun testaColecao() {
    val nomes: MutableList<String> = mutableListOf(
        "Lincoln",
        "Pedro",
        "Rafael",
        "Christiny",
        "Jackeline",
        "Jackson",
        "Graça"
    )

    for (nome in nomes) {
        println(nome)
    }

    println(nomes)
    println("Tem o nome Lincoln? ${nomes.contains("Lincoln")}")
    println("Tamano da coleção ${nomes.size}")
}