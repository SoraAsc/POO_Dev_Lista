package enums_12.models

import enums_12.enums.DiasDaSemana

class Agenda(private var dia: DiasDaSemana = DiasDaSemana.Nenhum)
{
    fun marcarCompromisso(dia: DiasDaSemana)
    {
        this.dia = dia
    }

    fun verificarCompromisso()
    {
        if (dia != DiasDaSemana.Nenhum) println("Você tem um compromisso ${dia.nome}")
        else println("Você não tem nenhum compromisso marcado")
    }
}