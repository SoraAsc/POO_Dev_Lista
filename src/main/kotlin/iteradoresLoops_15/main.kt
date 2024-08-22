package iteradoresLoops_15

import iteradoresLoops_15.models.Biblioteca
import iteradoresLoops_15.models.Livro

fun main()
{
    val lib = Biblioteca()

    lib.adicionarLivro(Livro("Livro 1", "Autor 1"))
    lib.adicionarLivro(Livro("Livro 2", "Autor 2"))
    lib.adicionarLivro(Livro("Livro 3", "Autor 33"))
    lib.adicionarLivro(Livro("Livro 4", "Autor 1"))

    lib.listarLivros()

    println("Iterando sobre os livros")
    for(livro in lib)  println("- ${livro.getTitulo()} por ${livro.getAutor()}")

    // ou
    val it = lib.iterator()
    println("Iterando sobre os livros explicitamente")
    while (it.hasNext())
    {
        val livro = it.next()
        println("- ${livro.getTitulo()} por ${livro.getAutor()}")
    }
}