package ir.adicom.app.behavioral.visitor

class Content(var data: Int) {
    fun accept(contentVistor: ContentVisitor) {
        contentVistor.visit(this)
    }
}
