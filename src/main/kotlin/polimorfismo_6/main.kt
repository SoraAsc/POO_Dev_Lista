package polimorfismo_6

import polimorfismo_6.models.Animal
import polimorfismo_6.models.Gato
import polimorfismo_6.models.Cachorro

fun main()
{
    val anim = Animal()
    val gato = Gato()
    val cachorro = Cachorro()

    anim.emitirSom()
    gato.emitirSom()
    cachorro.emitirSom()
}
