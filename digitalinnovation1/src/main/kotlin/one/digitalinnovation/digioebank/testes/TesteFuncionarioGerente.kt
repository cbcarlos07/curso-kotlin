package one.digitalinnovation.digioebank.testes

import one.digitalinnovation.digioebank.Analista
import one.digitalinnovation.digioebank.Funcionario
import one.digitalinnovation.digioebank.Gerente
import one.digitalinnovation.digioebank.Pessoa
import java.math.BigDecimal

fun main(){
    val maria = Gerente(nome= "Maria", cpf = "12345678900", 5000.0)
    ImprimieRelatorioFuncionario.imprime(maria)

}

