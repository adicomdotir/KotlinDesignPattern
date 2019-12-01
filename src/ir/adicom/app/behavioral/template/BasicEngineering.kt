package ir.adicom.app.behavioral.template

abstract class BasicEngineering {
    fun study() {
        math()
        physics()
        other()
    }

    abstract fun other()

    private fun physics() {
        println("Physics")
    }

    private fun math() {
        println("Math")
    }
}
