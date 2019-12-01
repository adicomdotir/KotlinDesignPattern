package ir.adicom.app.behavioral.visitor

fun main(args: Array<String>) {
    val content: Content = Content(13)
    println(content.data)
    content.accept(AddVisitor())
    println(content.data)
}
