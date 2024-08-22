package metodosEstaticos_11

import metodosEstaticos_11.models.MatematicaUtil

fun main()
{
    val n = 4.0
    println("$n^2 = ${MatematicaUtil.calcularQuadrado(n)}")
    println("$n^3 = ${MatematicaUtil.calcularCubo(n)}")
    println("√$n = ${MatematicaUtil.calcularRaizQuadrada(n)}")
}