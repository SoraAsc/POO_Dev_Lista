package objBasico_1

import objBasico_1.models.Pessoa

fun main()
{
    val pessoa = Pessoa("Gustavo", 33)

    println("Nome: ${pessoa.getNome()}")
    println("Idade: ${pessoa.getIdade()}")
    pessoa.exibirInformacoes()
}
