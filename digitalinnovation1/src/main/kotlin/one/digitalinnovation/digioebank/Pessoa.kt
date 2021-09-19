package one.digitalinnovation.digioebank

class Pessoa {
    var nome: String = "Carlos"
    var cpf: String = "798.805.762-687"

    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val carlos = Pessoa()
    println( carlos.pessoaInfo() )

}