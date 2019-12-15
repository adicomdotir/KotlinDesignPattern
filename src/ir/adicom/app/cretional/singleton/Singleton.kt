package ir.adicom.app.cretional.singleton

class Singleton private constructor() {

    companion object {
        private var instance: Singleton? = null
        fun getInstance(): Singleton {
            if (instance != null) {
                return instance as Singleton
            }
            instance = Singleton()
            return instance as Singleton
        }
    }

    fun singletonMethod(): String = "This is singleton class method's"
}
