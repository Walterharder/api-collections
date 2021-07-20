package one.digitalinnovation.collections

fun main() {
    val f1 = Funcionario("João", 3200.0, "CLT")
    val f2 = Funcionario("Pedro", 1500.0, "PJ")
    val f3 = Funcionario("Maria", 2000.0, "CLT")

    val funcionarios = listOf(f1, f2, f3)

    funcionarios.forEach { println(it) }

    println("------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}
    data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
        """.trimIndent()
}