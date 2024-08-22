package composicao_7.models

class Motor(private var ligado: Boolean = false)
{

    fun getEstaLigado() = ligado

    fun ligar()
    {
        if(!ligado)
        {
            ligado = true
            println("O Motor está ligando!")
        } else print("O motor já está ligado.")
    }

    fun desligar()
    {
        if(ligado)
        {
            ligado = false
            println("O Motor está desligando!")
        } else print("O motor já está desligado.")
    }
}