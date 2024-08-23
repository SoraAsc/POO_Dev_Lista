package gestaoFunc_19.models

class Funcionario(id: Int, nome: String, cargo: String, salario: Double)
{
    private val _id: Int = id
    private var _nome: String = nome
    private var _cargo: String = cargo
    private var _salario: Double = salario

    val id: Int get() = _id
    val nome: String get() = _nome

    fun atualizarInformacoes(nome: String?, cargo: String?, salario: Double?)
    {
        nome?.let { this._nome = nome }
        cargo?.let { this._cargo = cargo }
        salario?.let { this._salario = salario }
    }
    override fun toString(): String = "ID: $_id | Nome: $_nome | Cargo: $_cargo | Salário: R$%.2f".format(_salario)
}