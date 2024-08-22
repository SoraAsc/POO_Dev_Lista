package herancaMultiplaInterface_9

import herancaMultiplaInterface_9.models.Personagem

fun main()
{
    val mc = Personagem()

    println("\n-------- Desenhando GRID --------\n")
    mc.desenhar()

    mc.mover(4, 3)

    println("\n-------- Desenhando GRID --------\n")
    mc.desenhar()
}
