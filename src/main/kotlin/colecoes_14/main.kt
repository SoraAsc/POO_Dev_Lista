package colecoes_14

import colecoes_14.models.Biblioteca
import colecoes_14.models.Livro

fun main()
{
    val lib = Biblioteca()

    lib.adicionarLivro(Livro("Livro 1", "Autor 1"))
    lib.adicionarLivro(Livro("Livro 2", "Autor 2"))
    lib.adicionarLivro(Livro("Livro 3", "Autor 33"))
    lib.adicionarLivro(Livro("Livro 4", "Autor 1"))

    lib.listarLivros()
}