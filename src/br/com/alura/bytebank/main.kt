import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

var totalContas = 0

fun main() {

    val alex = Cliente("Alex","",123)
    val contaPoupanca = ContaPoupanca(alex, 1000)
    val contaContaCorrente = ContaCorrente(alex,232)

    testaContasDiferentes()


    println("Tota de contas: ${totalContas}")
}