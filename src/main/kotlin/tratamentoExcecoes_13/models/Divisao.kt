package tratamentoExcecoes_13.models

class DivisaoException() : Exception("Divisão por zero não é permitido.")

class Divisao
{
    fun dividir(n1: Int, n2: Int): Int
    {
        if(n2 == 0) throw DivisaoException()
        return n1 / n2
    }
}