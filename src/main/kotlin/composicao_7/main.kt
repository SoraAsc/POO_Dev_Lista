package composicao_7

import composicao_7.models.Carro

fun main()
{
    val car = Carro()

    car.statusMotor()
    car.ligarCarro()
    car.statusMotor()
    car.desligarCarro()
    car.statusMotor()
}