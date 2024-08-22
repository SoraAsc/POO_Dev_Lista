package herancaSimples_5

import herancaSimples_5.models.Carro

fun main()
{
    val car = Carro("Ford", "Maverick Lariat FX4", "2MW0K310", 4)

    car.detalharVeiculo()
    car.detalharCarro()

    car.ligar()
    car.acelerar()
    car.reduzir()
    car.desligar()
}