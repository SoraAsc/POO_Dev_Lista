package metodosSobrecarga_4.models

class Calculadora
{
    fun adicionar(n1: Double, n2: Double) : Double = n1 + n2
    fun adicionar(vararg nums: Int): Int = nums.sum()

    fun subtrair(n1: Double, n2: Double) : Double = n1 - n2
    fun subtrair(vararg nums: Int): Int = nums.reduce {acc, num -> acc - num}

    fun multiplicar(n1: Double, n2: Double): Double = n1 * n2
    fun multiplicar(vararg nums: Int): Int = nums.reduce {acc, num -> acc * num}

    fun dividir(n1: Double, n2: Double): Double = n1 / n2
    fun dividir(vararg nums: Int): Int = nums.reduce {acc, num -> acc / num}

}