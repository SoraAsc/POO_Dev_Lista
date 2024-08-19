package encapsulamento_2

import encapsulamento_2.models.ContaBancaria

fun main()
{
    val contaBancaria = ContaBancaria() // Inicializando por padrão com saldo 0.0

    contaBancaria.depositar(-50.0)
    contaBancaria.consultarSaldo()

    contaBancaria.depositar(200.0)
    contaBancaria.sacar(201.0)
    contaBancaria.consultarSaldo()

    contaBancaria.sacar(50.20)
    contaBancaria.consultarSaldo()
}