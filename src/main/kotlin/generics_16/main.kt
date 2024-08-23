package generics_16

import generics_16.models.Caixa

fun main()
{
    println("--------- Caixa de Números Inteiros v1 ---------")
    val caixaI = Caixa<Int>()

    caixaI.adicionarItem(1)
    caixaI.adicionarItem(9)
    caixaI.adicionarItem(3)
    caixaI.listarItens()

    println("--------- Caixa de Números Inteiros v2 ---------")
    caixaI.removerItem(9)
    caixaI.listarItens()

    println("--------- Caixa de Strings ---------")
    val caixaS = Caixa<String>()
    caixaS.adicionarItem("Kotlin")
    caixaS.adicionarItem("Java")
    caixaS.listarItens()
}