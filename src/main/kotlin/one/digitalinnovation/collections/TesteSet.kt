package one.digitalinnovation.collections

fun main() {
    val f1 = Funcionario("João", 3200.0, "CLT")
    val f2 = Funcionario("Pedro", 1500.0, "PJ")
    val f3 = Funcionario("Maria", 2000.0, "CLT")

    val funcionarios1 = setOf(f1,f2)
    val funcionarios2 = setOf(f3)

    val resulUnion = funcionarios1.union(funcionarios2)
    resulUnion.forEach { println(it) }

    println("------------------")
    val funcionarios3 = setOf(f1, f2, f3)
    val resulSubtract = funcionarios3.subtract(funcionarios2)
    resulSubtract.forEach { println(it) }

    println("------------------")
    val resulIntersect = funcionarios3.intersect(funcionarios2)
    resulIntersect.forEach { println(it) }


}