package ir.adicom.app.behavioral.mediator

class ConcreteMediator() : Mediator() {

    var concreteColleague1: ConcreteColleague1? = null;
    var concreteColleague2: ConcreteColleague2? = null;

    override fun send(message: String, colleague: Colleague) {
        when(colleague) {
            concreteColleague1 -> concreteColleague2?.notify(message)
            concreteColleague2 -> concreteColleague1?.notify(message)
        }
    }
}
