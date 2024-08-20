package construtores_3

import construtores_3.models.Produto

fun main()
{
    val banana = Produto("Banana", 1.50, 400)
    val feijao = Produto("Feijão", 13.00, 30)

    feijao.nome = "Feijão 1kg"

    println("---------- Produtos Em Estoque ----------")
    println("Nome: ${banana.nome} | Quantidade: ${banana.quantidade} | Preço: R$ ${banana.preco}")
    println("Nome: ${feijao.nome} | Quantidade: ${feijao.quantidade} | Preço: R$ ${feijao.preco}")
}