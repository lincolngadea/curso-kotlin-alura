import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    println("Bem vindo ao ByteBank")

    val contaLincoln = ContaCorrente(
        Cliente(
            "Lincoln",
            "111.222.333-44",
            1234,
            Endereco(
                "Rua A",
                "90",
                "Bairro B",
                "Salvador",
                "Bahia",
                "Sem comp"
            )
        ),
        1010
    );
    contaLincoln.deposita(10000.00)

    val contaPedro = ContaPoupanca(
        Cliente(
            "Rafael",
            "111.222.333-45",
            1234,
            Endereco(
                "Rua A",
                "90",
                "Bairro B",
                "Salvador",
                "Bahia",
                "Sem comp"
            )
        ),
        1212
    );
    contaPedro.deposita(1000.00)

    println("Titular: ${contaPedro.titular}")
    println("Número da modelo.Conta: ${contaPedro.numero}")
    println("Saldo da modelo.Conta: ${contaPedro.saldo}")
    println()

    println("Titular: ${contaLincoln.titular}")
    println("Número da modelo.Conta: ${contaLincoln.numero}")
    println("Saldo da modelo.Conta: ${contaLincoln.saldo}")
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
