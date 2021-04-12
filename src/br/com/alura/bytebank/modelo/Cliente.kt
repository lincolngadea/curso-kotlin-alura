package br.com.alura.bytebank.modelo
import br.com.alura.bytebank.modelo.Endereco

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int,
    var endereco: Endereco = Endereco()
): Autenticavel {

    override fun autentica(senha: Int):Boolean{
        if(this.senha != senha){
            return false
        }
        return true
    }
}