package ir.adicom.app.behavioral.adapter

class Adapter(val adaptee: Adaptee) : Target() {
    override fun request()  {
        adaptee.otherRequest()
    }
}
