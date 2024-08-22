package classesAbstratas_10

import classesAbstratas_10.models.Circulo
import classesAbstratas_10.models.Quadrado

fun main()
{
    println(Quadrado(2.0).calcularArea())
    println(Quadrado(5.0).calcularArea())
    println(Circulo(15.0).calcularArea())
}