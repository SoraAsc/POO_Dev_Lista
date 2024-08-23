package gestaoFunc_19.models

class Gestao
{
    private val funcionarios = mutableListOf<Funcionario>()

    companion object {
        private var id: Int = 0
    }

    fun adicionarFuncionario(nome: String, cargo: String, salario: Double)
    {
        val novoFuncionario = Funcionario(id, nome, cargo, salario)
        funcionarios.add(novoFuncionario)
        println("Funcionário: $nome adicionado com sucesso!")
        id++
    }

    fun removerFuncionarioPeloId(id: Int)
    {
        val funcionario = adquirirFuncionarioPeloID(id)
        if(funcionario != null)
        {
            funcionarios.remove(funcionario)
            println("Funcionário: ${funcionario.nome} removido com sucesso!")
        } else println("Funcionário não encontrado.")
    }

    fun atualizarFuncionarioPeloId(id: Int, nome: String? = null, cargo: String? = null, salario: Double? = null)
    {
        if(nome == null && cargo == null && salario == null)
        {
            println("Você não forneceu nenhum campo para atualizar o funcionário de ID: $id")
            return
        }
        val funcionario = adquirirFuncionarioPeloID(id)
        if(funcionario != null)
        {
            funcionario.atualizarInformacoes(nome, cargo, salario)
            println("Funcionário: ${funcionario.nome} de ID: $id atualizado com sucesso!")
        } else println("Funcionário não encontrado.")
    }

    fun adquirirFuncionarioPeloID(id: Int) = funcionarios.find { f -> f.id == id }

    fun listarFuncionarios()
    {
        if(funcionarios.isNotEmpty()) funcionarios.forEach { f -> println(f) }
        else println("Não há funcionários cadastrados no Sistema!")
    }
}