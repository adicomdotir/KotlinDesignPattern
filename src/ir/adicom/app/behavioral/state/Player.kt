package ir.adicom.app.behavioral.state

class Player(var state: MyState) {
    fun play() {
        state.pressPlay(this)
    }
}
