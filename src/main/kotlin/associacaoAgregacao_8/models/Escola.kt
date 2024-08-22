package associacaoAgregacao_8.models

class Escola(private val alunos: ArrayList<Aluno>)
{
    fun listarAlunos() = alunos.forEach { aluno: Aluno -> aluno.inspecionarAluno() }

    fun mediaEscolar()
    {
        var soma = 0.0
        alunos.forEach {a -> soma += a.getNota()}
        println("Média da Escola: ${soma/alunos.count()}")
    }

    fun adicionarAluno(aluno: Aluno) = alunos.add(aluno)
    fun removerAluno(aluno: Aluno) = alunos.remove(aluno)
}