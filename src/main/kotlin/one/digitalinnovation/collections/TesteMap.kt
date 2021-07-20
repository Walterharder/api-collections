package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ (k, v) -> println("chave: $k - Valor: $v")}

    val map2 = mapOf(
        "Pedro" to 1350.0,
        "Maria" to 2200.0
    )
    map2.forEach{ (k, v) -> println("chave: $k - Valor: $v")}
}