package associacaoAgregacao_8.models

class Aluno(private val nome: String, private val matricula: String, private val nota: Double)
{
    fun inspecionarAluno() = println("Nome: $nome | Matricula: $matricula | Nota: $nota")
    fun getNota(): Double = nota
}