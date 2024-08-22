package classesAbstratas_10.models

class Circulo(private val raio: Double) : FormaGeometrica()
{
    override fun calcularArea(): Double = Math.PI * raio * raio
}