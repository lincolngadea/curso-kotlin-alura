import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
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
        1111
    )

    val contaPoupanca = ContaPoupanca(
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
        1211
    )

    contaCorrente.deposita(1000.00)
    contaPoupanca.deposita(1000.00)

    println("Saldo da conta corrente antes do saque: ${contaCorrente.saldo}")
    println("Endereço: ${contaCorrente.titular.endereco.cidade}")
    println("Saldo da conta poupança antes do saque: ${contaPoupanca.saldo}")
    println("Endereço: ${contaPoupanca.titular.endereco.cidade}")
    println()

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo da conta corrente depois do saque: ${contaCorrente.saldo}")
    println("Saldo da conta poupança depois do saque: ${contaPoupanca.saldo}")
    println()

    contaCorrente.transfere(100.00, contaPoupanca)

    println("Saldo da conta corrente depois da transferência: ${contaCorrente.saldo}")
    println("Saldo da conta poupança depois da transferência: ${contaPoupanca.saldo}")
    println()

    contaPoupanca.transfere(200.0, contaCorrente)

    println("Saldo da conta corrente depois da transferência: ${contaCorrente.saldo}")
    println("Saldo da conta poupança depois da transferência: ${contaPoupanca.saldo}")
    println()
}