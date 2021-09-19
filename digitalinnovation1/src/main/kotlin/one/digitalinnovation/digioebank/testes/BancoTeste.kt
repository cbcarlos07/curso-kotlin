package one.digitalinnovation.digioebank.testes

import one.digitalinnovation.digioebank.Banco

fun main() {
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")
    println(banco2.info())
}
