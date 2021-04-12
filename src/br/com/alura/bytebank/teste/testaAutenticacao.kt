import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        "Lincoln",
        "111.222.333-44",
        20000.0,
        1234
    )

    val diretor = Diretor(
        "Fabricio",
        "222.333.444-55",
        30000.0,
        2000.0,
        1234
    )

    val cliente = Cliente(
        "Pedro",
        "333.444.555-66",
        1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 1234)
    sistema.entra(cliente,1234)
}