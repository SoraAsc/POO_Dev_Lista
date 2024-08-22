package iteradoresLoops_15.models

class Biblioteca : Iterable<Livro>
{
    private val livros: ArrayList<Livro> = ArrayList()

    fun adicionarLivro(livro: Livro)
    {
        livros.add(livro)
        println("${livro.getTitulo()} foi adicionado na biblioteca.")
    }
    fun removerLivro(livro: Livro)
    {
        if(livros.remove(livro)) println("${livro.getTitulo()} foi removido da bilioteca.")
        else println("${livro.getTitulo()} não encontrado na biblioteca.")
    }
    fun listarLivros()
    {
        if(livros.isEmpty()) println("A biblioteca está vazia.")
        else
        {
            println("--------- Livros ---------")
            livros.forEach { l -> l.detalharLivro() }
        }
    }

    override fun iterator(): Iterator<Livro> = livros.iterator()
}