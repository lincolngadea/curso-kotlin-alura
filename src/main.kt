fun main() {

    println("Seja Bem vindo ao Kotlin")
    println()

    val alex = Funcionario(
        "Alex",
        "000.111.222-33",
        10000.00
    )

    val fran = Gerente(
        nome = "Fran",
        "000.111.222-34",
        20000.00,
        123
    )

    println("Nome: ${alex.nome}")
    println("Cpf: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao()}")
    println()

    println("Nome: ${fran.nome}")
    println("Cpf: ${fran.cpf}")
    println("Salário: ${fran.salario}")

    if(fran.autentica(123)){
        println("Usuário autenticado com sucesso!")
    }else{
        println("Problemas com a autenticação!")
    }

}