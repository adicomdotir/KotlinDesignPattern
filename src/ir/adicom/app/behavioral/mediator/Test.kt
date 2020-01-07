package ir.adicom.app.behavioral.mediator

fun main() {
    val m = ConcreteMediator()
    val cc1 = ConcreteColleague1(m)
    val cc2 = ConcreteColleague2(m)
    m.concreteColleague1 = cc1
    m.concreteColleague2 = cc2
    cc2.send("Hi guys")
}
