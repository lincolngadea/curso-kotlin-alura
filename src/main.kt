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

    val lincoln = Diretor(
        nome = "Lincoln",
        cpf = "000.111.223.45",
        salario = 30000.00,
        senha = 1234
    )

    println("Nome: ${alex.nome}")
    println("Cpf: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao}")
    println()

    println("Nome: ${fran.nome}")
    println("Cpf: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao}")


    if(fran.autentica(123)){
        println("Usuário autenticado com sucesso!")
    }else{
        println("Problemas com a autenticação!")
    }
    println()

    println("Nome: ${lincoln.nome}")
    println("Cpf: ${lincoln.cpf}")
    println("Salário: ${lincoln.salario}")
    println("Bonificação: ${lincoln.bonificacao}")


    if(lincoln.autentica(1234)){
        println("Usuário autenticado com sucesso!")
    }else{
        println("Problemas com a autenticação!")
    }
}