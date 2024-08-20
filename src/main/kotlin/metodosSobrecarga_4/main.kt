package metodosSobrecarga_4

import metodosSobrecarga_4.models.Calculadora
import java.text.DecimalFormat

fun main()
{
    val df = DecimalFormat("#.##")
    val calc = Calculadora()

    println("------ Operações ------")

    println(" 3,5 + 2,3 = ${df.format(calc.adicionar(3.5,2.3))}")

    println(" 3,5 - 2,3 = ${df.format(calc.subtrair(3.5,2.3))}")

    println(" 10,4 * 30,2 = ${df.format(calc.multiplicar(10.4,30.2))}")

    println(" 8 / 4 / 2 = ${df.format(calc.dividir(8,4,2))}")
}