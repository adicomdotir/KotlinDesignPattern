package ir.adicom.app.behavioral.mediator

abstract class Mediator {
    abstract fun send(message: String, colleague: Colleague);
}
