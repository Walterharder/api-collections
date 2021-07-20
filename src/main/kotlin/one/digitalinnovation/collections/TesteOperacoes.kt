package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1500.0, 5000.0, 1375.0)

    for(salario in salarios){
        println(salario)
    }

    println("-------------------")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Média de salário: ${salarios.average()}")

    println("-------------------")
    val salariosMarioresQue1400 = salarios.filter { it >1400.0 }
    salariosMarioresQue1400.forEach{println(it)}

    println("-------------------")
    println(salarios.count { it in 1000.0..1999.0})

    println("-------------------")
    println(salarios.find { it == 1375.0 })
    println(salarios.find { it == 700.0 })

    println("-------------------")
    println(salarios.any { it == 1375.0 })
    println(salarios.any { it == 500.0 })
}