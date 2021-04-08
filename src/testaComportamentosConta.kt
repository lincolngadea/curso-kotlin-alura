fun testaComportamentosConta() {
    println("Bem vindo ao ByteBank")

    val contaLincoln = Conta("Lincoln", 1010);
    contaLincoln.deposita(10000.00)

    val contaPedro = Conta("Pedro", 1212);
    contaPedro.deposita(1000.00)

    println("Titular: ${contaPedro.titular}")
    println("Número da Conta: ${contaPedro.numero}")
    println("Saldo da Conta: ${contaPedro.saldo}")
    println()

    println("Titular: ${contaLincoln.titular}")
    println("Número da Conta: ${contaLincoln.numero}")
    println("Saldo da Conta: ${contaLincoln.saldo}")
    println()

    println("Depósito relizado!")
    contaLincoln.deposita(50.00)
    println("Novo Saldo: ${contaLincoln.saldo}")
    println()

    println("Depósito relizado!")
    contaPedro.deposita(100.00)
    println("Novo Saldo: ${contaPedro.saldo}")
    println()

    println("Saque na conta do Lincoln")
    contaLincoln.saca(1000.00)
    println("Novo Saldo: ${contaLincoln.saldo}")
    println()

    println("Saque na conta do Pedro")
    contaPedro.saca(1000.00)
    println("Novo Saldo: ${contaPedro.saldo}")
    println()

    println("Transferência de valores da conta do Lincoln para a conta do Pedro")
    if (contaLincoln.transfere(200.00, contaPedro)) {
        println("Transferência realizada com Sucesso")
    } else {
        println("Não foi possível realizar a transferência")
    }
    println()
    println("Novo Saldo do Lincoln: ${contaLincoln.saldo}")
    println("Novo Saldo do Pedro: ${contaPedro.saldo}")
}
