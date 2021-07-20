package one.digitalinnovation.collections

fun main() {
    val f1 = Funcionario("João", 1000.0)
    val f2 = Funcionario("Pedro", 1500.0)
    val f3 = Funcionario("Maria", 2000.0)

    val funcionarios = listOf(f1, f2, f3)

    funcionarios.forEach { println(it) }

    println("------------------")
    println(funcionarios.find { it.nome == "Maria" })
}
    data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
        """.trimIndent()
}