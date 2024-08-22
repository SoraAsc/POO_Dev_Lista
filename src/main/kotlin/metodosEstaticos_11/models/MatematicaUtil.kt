package metodosEstaticos_11.models

import kotlin.math.sqrt

class MatematicaUtil
{
    companion object
    {
        fun calcularQuadrado(n: Double) = n * n
        fun calcularCubo(n: Double) = n * n * n
        fun calcularRaizQuadrada(n: Double) = sqrt(n)
    }
}