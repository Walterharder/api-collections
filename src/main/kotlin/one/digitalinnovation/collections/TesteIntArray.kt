package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0]=5
    values[1]=8
    values[2]=4
    values[3]=2
    values[4]=3

    for (valor in values) {
        println(valor)
    }

    println("------------------")
    values.forEach {
        println(it)
    }

    println("------------------")
    for (index in values.indices){
        println(values[index])
    }

    println("------------------")
    values.sort()
    for (valor in values){
        println(valor)
    }
}