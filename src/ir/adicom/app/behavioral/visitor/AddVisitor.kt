package ir.adicom.app.behavioral.visitor

class AddVisitor : ContentVisitor {
    override fun visit(content: Content) {
        content.data *= 5
    }
}
