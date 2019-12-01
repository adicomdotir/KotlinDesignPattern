package ir.adicom.app.behavioral.state

class StatePlay : MyState() {
    override fun pressPlay(player: Player) {
        println("Play")
        player.state = StatePause()
    }
}
