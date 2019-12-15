package ir.adicom.app.cretional.singleton

fun main() {
    val singleton = Singleton.getInstance()
    println(singleton.singletonMethod())
}
