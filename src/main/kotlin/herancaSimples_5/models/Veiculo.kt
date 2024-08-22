package herancaSimples_5.models

open class Veiculo(protected val marca: String, protected val modelo: String)
{
    fun detalharVeiculo() = println("Marca: $marca | Modelo: $modelo")

    fun ligar() = println("Ligando...")
    fun desligar() = println("Desligando...")
}