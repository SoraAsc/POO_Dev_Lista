package herancaMultiplaInterface_9.models

import herancaMultiplaInterface_9.interfaces.Desenhavel
import herancaMultiplaInterface_9.interfaces.Movimentavel

class Personagem : Movimentavel, Desenhavel
{
    private val gridSizeX: Int = 5
    private val gridSizeY: Int = 5

    // Posição Inicial (centro da grid)
    private var x: Int = 0 + (gridSizeX / 2)
    private var y: Int = 0 + (gridSizeY / 2)
    override fun mover(horizontalMove: Int, verticalMove: Int)
    {
        x = (x + horizontalMove) % gridSizeX
        y = (y + verticalMove) % gridSizeY
    }

    override fun desenhar()
    {
        for(j in 0..<gridSizeX) print("----")
        print("-\n")
        for(i in 0..<gridSizeY)
        {
            for(j in 0..<gridSizeX)
            {
                if(x == j && i == y) print("| ⦿ ")
                else print("|   ")
            }
            print("|\n")

            for(j in 0..<gridSizeX) print("----")
            print("-\n")
        }
    }
}