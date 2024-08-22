package herancaSimples_5.models

class Carro(
    marca: String, modelo: String, private val placa: String,
    private val numPortas: Int) : Veiculo(marca, modelo)
{
    fun detalharCarro() = println("Marca: $marca | Modelo: $modelo | Placa: $placa | Número de Portas: $numPortas")

    fun acelerar() = println("Acelerando...")
    fun reduzir() = println("Reduzindo a velocidade...")
}