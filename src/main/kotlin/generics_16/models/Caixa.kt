package generics_16.models

class Caixa<T>
{
    private val itens = ArrayList<T>()

    fun adicionarItem(item: T) = itens.add(item)
    fun removerItem(item: T) = itens.remove(item)
    fun listarItens() = itens.forEach { i -> println(i) }

}