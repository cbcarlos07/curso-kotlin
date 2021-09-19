package one.digitalinnovation.digioebank.testes

import one.digitalinnovation.digioebank.Analista
import one.digitalinnovation.digioebank.Funcionario
import one.digitalinnovation.digioebank.Pessoa
import java.math.BigDecimal

fun main(){
    val joao = Analista(nome= "Carlos Bruno", cpf = "12345678900", 2000.0)

    ImprimieRelatorioFuncionario.imprime(joao)

}

