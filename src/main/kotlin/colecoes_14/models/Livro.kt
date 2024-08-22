package colecoes_14.models

class Livro(private val titulo: String, private val autor: String)
{
    fun getTitulo() = titulo
    fun getAutor() = autor
    fun detalharLivro() = println("- $titulo por $autor")
}