package gestaoFunc_19

import gestaoFunc_19.models.Gestao

fun main()
{
    val gestao = Gestao()
    println("--------- Adicionando Funcionários ---------")
    gestao.adicionarFuncionario("Wanderson", "Desenvolvedor", 5000.0)
    gestao.adicionarFuncionario("Marcos", "Designer", 4500.0)
    gestao.adicionarFuncionario("Teste", "Teste", 4000000.0)
    gestao.adicionarFuncionario("Kaue", "RH", 6500.0)

    println("\n--------- Listando Funcionários ---------")
    gestao.listarFuncionarios()

    println("\n--------- Adquirindo Funcionário ---------")
    println(gestao.adquirirFuncionarioPeloID(2))

    println("\n--------- Removendo Funcionários ---------")
    gestao.removerFuncionarioPeloId(2)

    println("\n--------- Atualizando Funcionários ---------")
    gestao.atualizarFuncionarioPeloId(1)
    gestao.atualizarFuncionarioPeloId(1, "Ricardo")


    println("\n--------- Abrindo Menu de Opções ---------\n")
    while (true)
    {
        println("\n--- Menu Principal ---")
        println("1. Listar Funcionários")
        println("2. Visualizar Funcionário")
        println("3. Adicionar Funcionário")
        println("4. Atualizar Funcionário")
        println("5. Deletar Funcionário")
        println("6. Sair")
        print("Escolha uma das opções (1-6): ")

        when(readlnOrNull())
        {
            "1" -> { gestao.listarFuncionarios(); esperarInput() }
            "2" -> visualizarFuncionario(gestao)
            "3" -> criarFuncionario(gestao)
            "4" -> atualizarFuncionario(gestao)
            "5" -> deletarFuncionario(gestao)
            "6" -> { println("Encerrando..."); break }
//            "7" -> repeat(50) { println() }
            else -> println("Opção inválida. Tente novamente!")
        }
    }
}

private fun visualizarFuncionario(gestao: Gestao)
{
    val id = lerInput("Informe o ID: ")?.toIntOrNull()
    if(id != null) println(gestao.adquirirFuncionarioPeloID(id) ?: "Funcionário não encontrado")
    else println("ID inválido")

    esperarInput()
}

private fun criarFuncionario(gestao: Gestao)
{
    val nome = lerInput("Informe o Nome: ")
    val cargo = lerInput("Informe o Cargo: ")
    val salario = lerInput("Informe o Salario: ")?.toDoubleOrNull()

    if(nome != null && cargo != null && salario != null) gestao.adicionarFuncionario(nome, cargo, salario)
    else println("Campos Inválidos. Tente Novamente.")

    esperarInput()
}

private fun atualizarFuncionario(gestao: Gestao)
{
    val id = lerInput("Informe o ID: ")?.toIntOrNull()
    val nome = lerInput("Informe o Nome: ")
    val cargo = lerInput("Informe o Cargo: ")
    val salario = lerInput("Informe o Salario: ")?.toDoubleOrNull()

    if(id != null) gestao.atualizarFuncionarioPeloId(id, nome, cargo, salario)
    else println("ID inválido")

    esperarInput()
}

private fun deletarFuncionario(gestao: Gestao)
{
    val id = lerInput("Informe o ID: ")?.toIntOrNull()
    if(id != null) gestao.removerFuncionarioPeloId(id)
    else println("ID inválido")

    esperarInput()
}

private fun lerInput(messsage: String): String?
{
    print(messsage)
    val valor = readlnOrNull()
    valor?.isEmpty()
    return if(valor?.isEmpty() == true) null else valor
}

private fun esperarInput()
{
    println("Aperte ENTER para continuar")
    readln()
}