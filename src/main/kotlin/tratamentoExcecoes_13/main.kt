package tratamentoExcecoes_13

import tratamentoExcecoes_13.models.Divisao
import tratamentoExcecoes_13.models.DivisaoException

fun main()
{
    val n1 = 5
    val n2 = 0
    val divisao = Divisao()

    try { println("$n1 / $n2 = ${divisao.dividir(n1, n2)}") }
    catch (e: DivisaoException) { println(e.message) }
}