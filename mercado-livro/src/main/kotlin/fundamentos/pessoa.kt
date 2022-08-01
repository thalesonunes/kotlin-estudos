package fundamentos

class pessoa (var nome: String){
}

fun main() {

   //println(pessoa("Thales").nome)
    var lista = listOf<Int>(1, 2, 5, 8, 7, 3, 10)
    var listaDePares = lista.filter { it % 2 == 0 }.last()
    println(listaDePares)
}

