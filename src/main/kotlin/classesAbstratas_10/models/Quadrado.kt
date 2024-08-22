package classesAbstratas_10.models

class Quadrado(private val lado: Double) : FormaGeometrica()
{
    override fun calcularArea(): Double = lado*lado
}