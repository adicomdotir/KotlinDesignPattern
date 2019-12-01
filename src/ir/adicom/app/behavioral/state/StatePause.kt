package ir.adicom.app.behavioral.state

class StatePause : MyState() {
    override fun pressPlay(player: Player) {
        println("Pause")
        player.state = StatePlay()
    }
}
