package encapsulamento_2.models

class ContaBancaria(private var saldo: Double = 0.0)
{
    fun depositar(valor: Double)
    {
        if (valor > 0) saldo += valor
        else println("É necessário depositar um valor maior do que 0")
    }

    fun sacar(valor: Double)
    {
        if(saldo >= valor) saldo -= valor
        else println("Você não pode sacar mais do que possui na conta!")
    }

    fun consultarSaldo() = println("Seu saldo atual é: R$ $saldo")

}