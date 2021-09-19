package one.digitalinnovation.digioebank

class Gerente(
     nome: String,
     cpf: String,
     salario: Double
): Funcionario(nome = nome, cpf = cpf, salario) {
    override fun calculoAuxilio(): Double = salario * 0.4
}