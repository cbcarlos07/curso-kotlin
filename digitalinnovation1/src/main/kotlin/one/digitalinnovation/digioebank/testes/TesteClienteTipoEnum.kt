package one.digitalinnovation.digioebank.testes

import one.digitalinnovation.digioebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("$elemento.name - ${elemento.descricao}")
    }
    ClienteTipo.values().forEach {
        println("$it.name - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println(pf.name)


}