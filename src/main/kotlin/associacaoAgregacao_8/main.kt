package associacaoAgregacao_8

import associacaoAgregacao_8.models.Aluno
import associacaoAgregacao_8.models.Escola

fun main()
{
    val escola = Escola(ArrayList())

    val al1 = Aluno("Marcos", "023141dj", 7.0)
    val al2 = Aluno("Guilherme", "km203891", 8.0)

    escola.adicionarAluno(al1)
    escola.adicionarAluno(al2)

    escola.listarAlunos()

    escola.removerAluno(al2)

    escola.mediaEscolar()
}