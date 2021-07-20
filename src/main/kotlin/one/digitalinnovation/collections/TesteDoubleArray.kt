package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1500.0
    salarios[1] = 1750.0
    salarios[2] = 2350.0

    salarios.forEach { println(it) }

    println("-------------------")

    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.3
    }
    salarios.forEach { println(it) }

    println("-------------------")

    val salarios2 = doubleArrayOf(1500.0, 5000.0, 1375.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

}