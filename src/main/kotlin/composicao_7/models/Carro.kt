package composicao_7.models

class Carro
{
    private val motor = Motor()

    fun ligarCarro()
    {
        motor.ligar()
        println("O carro está ligado\n")
    }

    fun desligarCarro()
    {
        motor.desligar()
        println("O carro está desligado\n")
    }

    fun statusMotor()
    {
        if(motor.getEstaLigado()) println("O motor está ligado.\n")
        else println("O motor está desligado.\n")
    }
}