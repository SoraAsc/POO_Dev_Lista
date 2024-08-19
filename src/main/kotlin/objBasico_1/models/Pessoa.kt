package objBasico_1.models

class Pessoa(private val nome: String, private val idade: Int)
{
    fun getNome() = nome
    fun getIdade() = idade

    fun exibirInformacoes() = println("Olá $nome você tem atualmente $idade anos")
}