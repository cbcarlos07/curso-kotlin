package one.digitalinnovation.digioebank.testes

import one.digitalinnovation.digioebank.Funcionario

class ImprimieRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}