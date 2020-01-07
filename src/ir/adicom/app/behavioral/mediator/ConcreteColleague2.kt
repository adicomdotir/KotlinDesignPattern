package ir.adicom.app.behavioral.mediator

class ConcreteColleague2(mediator: Mediator) : Colleague(mediator) {
    fun send(msg: String) {
        mediator.send(msg, this);
    }

    fun notify(msg: String) {
        println(msg)
    }
}
