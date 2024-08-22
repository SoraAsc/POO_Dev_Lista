package enums_12

import enums_12.enums.DiasDaSemana
import enums_12.models.Agenda

fun main()
{
    val agenda = Agenda()

    agenda.verificarCompromisso()

    agenda.marcarCompromisso(DiasDaSemana.Terca)

    agenda.verificarCompromisso()
}